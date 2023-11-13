/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Random;
import javax.swing.JLabel;
import ui.MainInterfaz;

/**
 *
 * @author juand
 */
public class Admin {

    public static int roundCounter = 0;
    public static Queue<Character> nintendoQueue1; // Colas para Nintendo 
    public static Queue<Character> nintendoQueue2;
    public static Queue<Character> nintendoQueue3;
    public static Queue<Character> bethesdaQueue1; // Colas para Bethesda 
    public static Queue<Character> bethesdaQueue2;
    public static Queue<Character> bethesdaQueue3;
    public static Queue<Character> reinforcementQueueNintendo; // Cola de refuerzo para Nintendo
    public static Queue<Character> reinforcementQueueBethesda; // Cola de refuerzo para Bethesda

    public Admin() {
        // Inicializa las colas para Nintendo
        nintendoQueue1 = new Queue<>();
        nintendoQueue2 = new Queue<>();
        nintendoQueue3 = new Queue<>();

        // Inicializa las colas para Bethesda
        bethesdaQueue1 = new Queue<>();
        bethesdaQueue2 = new Queue<>();
        bethesdaQueue3 = new Queue<>();

        // Inicializa las colas de refuerzo
        reinforcementQueueNintendo = new Queue<>();
        reinforcementQueueBethesda = new Queue<>();
    }

    public void initializeCharacters() {
        for (int i = 0; i < 10; i++) {
            Character nintendoCharacter = Character.createZeldaCharacter();
            Character bethesdaCharacter = Character.createStreetFighterCharacter();

            addToQueue(nintendoCharacter, nintendoQueue1, nintendoQueue2, nintendoQueue3);
            addToQueue(bethesdaCharacter, bethesdaQueue1, bethesdaQueue2, bethesdaQueue3);
        }
    }

    public static void addToQueue(Character character, Queue<Character>... queues) {
        int priorityIndex = character.getLevelPriority() - 1;
        queues[priorityIndex].enqueue(character);
    }

    public static void upgradeToQueue(Character character, Queue<Character>... queues) {

        int NewpriorityIndex = character.getLevelPriority() - 1;
        int priorityIndex = character.getLevelPriority();
        // Eliminar el personaje de las colas existentes (si está presente)
        for (Queue<Character> queue : queues) {
        queue.remove(character);
    }
        queues[NewpriorityIndex].enqueue(character);

    }

    public Character[] selectCharactersForBattle() {
        Character[] charactersForBattle = new Character[2];

        charactersForBattle[0] = selectCharacterFromNextNonEmptyQueue(nintendoQueue1, nintendoQueue2, nintendoQueue3);
        charactersForBattle[1] = selectCharacterFromNextNonEmptyQueue(bethesdaQueue1, bethesdaQueue2, bethesdaQueue3);

        return charactersForBattle;

    }

    private Character selectCharacterFromNextNonEmptyQueue(Queue<Character>... queues) {
        for (int i = 0; i < queues.length; i++) {
            if (!queues[i].isEmpty()) {
                return queues[i].dequeue();
            }
        }
        return null; // Si todas las colas están vacías
    }

    // Ya no lo uso para selecionar los personajes de las colas.
    private Character selectCharacterFromQueue(int queueIndex, Queue<Character>... queues) {
        return queues[queueIndex].isEmpty() ? null : queues[queueIndex].dequeue();
    }

    public static void moveCharacterToPriority(Queue<Character> reinforcementQueue, Queue<Character> priorityQueue) {
        if (!reinforcementQueue.isEmpty()) {
            Character character = reinforcementQueue.dequeue();
            priorityQueue.enqueue(character);
        }
    }

// Sube los personajes en la posicion 1 de las colas. 
    public void updateQueues() {
        for (int i = 1; i < 3; i++) {
            Character nintendoCharacter = selectCharacterFromQueue(i, nintendoQueue1, nintendoQueue2, nintendoQueue3);
            if (nintendoCharacter != null) {
                switch (i) {
                    case 1:
                        nintendoQueue1.enqueue(nintendoCharacter);
                        break;
                    case 2:
                        nintendoQueue2.enqueue(nintendoCharacter);
                        break;
                    case 3:
                        nintendoQueue3.enqueue(nintendoCharacter);
                        break;
                }
            }

            Character bethesdaCharacter = selectCharacterFromQueue(i, bethesdaQueue1, bethesdaQueue2, bethesdaQueue3);
            if (bethesdaCharacter != null) {
                switch (i) {
                    case 1:
                        bethesdaQueue1.enqueue(bethesdaCharacter);
                        break;
                    case 2:
                        bethesdaQueue2.enqueue(bethesdaCharacter);
                        break;
                    case 3:
                        bethesdaQueue3.enqueue(bethesdaCharacter);
                        break;
                }
            }
        }
    }

    public static boolean shouldGenerateCharacters() {
        // Devolver true con una probabilidad del 80% (Para generar personajes)
        return new Random().nextInt(100) < 80;
    }

    public static void generateCharacters() {
        Character nintendoCharacter = Character.createZeldaCharacter();
        Character bethesdaCharacter = Character.createStreetFighterCharacter();

        addToQueue(nintendoCharacter, nintendoQueue1, nintendoQueue2, nintendoQueue3);
        addToQueue(bethesdaCharacter, bethesdaQueue1, bethesdaQueue2, bethesdaQueue3);
    }

    public static boolean shouldMoveToPriority1() {
        // Devuelve true con un 40% de probabilidad (para sacar de la cola de refuerzo)
        return new Random().nextInt(100) < 40;
    }
    //Lógica para aumentar contadores de Characters

    public static void incrementRoundCounters() {
        Queue<Character>[] allQueues = new Queue[]{
            nintendoQueue1, nintendoQueue2, nintendoQueue3,
            bethesdaQueue1, bethesdaQueue2, bethesdaQueue3
        };

        for (Queue<Character> queue : allQueues) {
            incrementQueueRoundCounters(queue);
        }
    }
// Lógica para aumentar el nivel de prioridad (Subir de Queue)

    private static void incrementQueueRoundCounters(Queue<Character> queue) {
        Queue<Character> tempQueue = new Queue<>();
        while (!queue.isEmpty()) {
            Character character = queue.dequeue();
            character.increaseRoundCounter();
            tempQueue.enqueue(character);
        }
        while (!tempQueue.isEmpty()) {
            queue.enqueue(tempQueue.dequeue());
        }
    }

    // Método para actualizar las colas en los JLabel
    public static void actualizarColasEnInterfaz() {
        // Para Nintendo
        for (int i = 0; i < 4; i++) {
            StringBuilder resultadoZelda = new StringBuilder();
            JLabel colasZelda = MainInterfaz.getColasZelda(i + 1);

            if (colasZelda != null) {
                Queue<Character> currentQueue;

                // Determinar la cola actual según el índice
                if (i < 3) {
                    resultadoZelda.append("Nintendo Queue " + (i + 1) + ":\n");
                    currentQueue = getNintendoQueue(i + 1);
                } else {
                    resultadoZelda.append("Reinforcement Queue Nintendo:\n");
                    currentQueue = reinforcementQueueNintendo;
                }

                resultadoZelda.append(printQueueToString(currentQueue));
                colasZelda.setText(resultadoZelda.toString());
            }
        }

        // Para Bethesda
        for (int i = 0; i < 4; i++) {
            StringBuilder resultadoSF = new StringBuilder();
            JLabel colasSF = MainInterfaz.getColasSF(i + 1);

            if (colasSF != null) {
                Queue<Character> currentQueue;

                // Determinar la cola actual según el índice
                if (i < 3) {
                    resultadoSF.append("Bethesda Queue " + (i + 1) + ":\n");
                    currentQueue = getBethesdaQueue(i + 1);
                } else {
                    resultadoSF.append("Reinforcement Queue Bethesda:\n");
                    currentQueue = reinforcementQueueBethesda;
                }

                resultadoSF.append(printQueueToString(currentQueue));
                colasSF.setText(resultadoSF.toString());
            }
        }
    }

    private static Queue<Character> getNintendoQueue(int index) {
        switch (index) {
            case 1:
                return nintendoQueue1;
            case 2:
                return nintendoQueue2;
            case 3:
                return nintendoQueue3;
            case 4:
                return reinforcementQueueNintendo;
            default:
                return null;
        }
    }

    private static Queue<Character> getBethesdaQueue(int index) {
        switch (index) {
            case 1:
                return bethesdaQueue1;
            case 2:
                return bethesdaQueue2;
            case 3:
                return bethesdaQueue3;
            case 4:
                return reinforcementQueueBethesda;
            default:
                return null;
        }
    }

    private static <T> String printQueuesToString(Queue<T>... queues) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < queues.length; i++) {
            result.append("Queue ").append(i + 1).append(": ");
            result.append(printQueueToString(queues[i]));
        }
        return result.toString();
    }

    private static <T> String printQueueToString(Queue<T> queue) {
        Queue<T> tempQueue = new Queue<>();
        StringBuilder result = new StringBuilder();
        while (!queue.isEmpty()) {
            T data = queue.dequeue();
            result.append(data).append(" ");
            tempQueue.enqueue(data);
        }
        result.append("\n");
        while (!tempQueue.isEmpty()) {
            queue.enqueue(tempQueue.dequeue());
        }
        return result.toString();
    }

    public void printQueues() {
        System.out.println("Nintendo Queues:");
        printQueues(nintendoQueue1, nintendoQueue2, nintendoQueue3);

        System.out.println("\nReinforcement Queue Nintendo:");
        printQueue(reinforcementQueueNintendo);

        System.out.println("\nBethesda Queues:");
        printQueues(bethesdaQueue1, bethesdaQueue2, bethesdaQueue3);

        System.out.println("\nReinforcement Queue Bethesda:");
        printQueue(reinforcementQueueBethesda);
    }

    private <T> void printQueues(Queue<T>... queues) {
        for (int i = 0; i < queues.length; i++) {
            System.out.print("Queue " + (i + 1) + ": ");
            printQueue(queues[i]);
        }
    }

    private <T> void printQueue(Queue<T> queue) {
        Queue<T> tempQueue = new Queue<>();
        while (!queue.isEmpty()) {
            T data = queue.dequeue();
            System.out.print(data + " ");
            tempQueue.enqueue(data);
        }
        System.out.println();
        while (!tempQueue.isEmpty()) {
            queue.enqueue(tempQueue.dequeue());
        }
    }
}
