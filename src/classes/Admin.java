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
                    default:
                        // Manejo si el índice es inesperado, encolarlo en la cola 1 (manejo de error luego lo quitamos)
                        nintendoQueue1.enqueue(nintendoCharacter);
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
                    default:
                        // Manejo si el índice es inesperado, encolarlo en la cola 1 (manejo de error luego lo quitamos)
                        bethesdaQueue1.enqueue(bethesdaCharacter);
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

    // Método para actualizar las colas en los JLabel
    public static void actualizarColasEnInterfaz() {
        StringBuilder resultadoZelda = new StringBuilder("Nintendo Queues:\n");
        resultadoZelda.append(printQueuesToString(nintendoQueue1, nintendoQueue2, nintendoQueue3));
        resultadoZelda.append("\nReinforcement Queue Nintendo:\n");
        resultadoZelda.append(printQueueToString(reinforcementQueueNintendo));

        MainInterfaz.ColasZelda.setText(resultadoZelda.toString());

        StringBuilder resultadoSF = new StringBuilder("Bethesda Queues:\n");
        resultadoSF.append(printQueuesToString(bethesdaQueue1, bethesdaQueue2, bethesdaQueue3));
        resultadoSF.append("\nReinforcement Queue Bethesda:\n");
        resultadoSF.append(printQueueToString(reinforcementQueueBethesda));

        MainInterfaz.ColasSF.setText(resultadoSF.toString());
    }

// Cambia estos métodos para que sean estáticos
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
