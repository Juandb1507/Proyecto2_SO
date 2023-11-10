/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Random;

/**
 *
 * @author juand
 */

public class Admin {
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
        for (int i = 0; i < 5; i++) {
            Character nintendoCharacter = Character.createZeldaCharacter();
            Character bethesdaCharacter = Character.createStreetFighterCharacter();

            addToQueue(nintendoCharacter, nintendoQueue1, nintendoQueue2, nintendoQueue3);
            addToQueue(bethesdaCharacter, bethesdaQueue1, bethesdaQueue2, bethesdaQueue3);
        }
    }

    public void addToQueue(Character character, Queue<Character>... queues) {
        int priorityIndex = character.getLevelPriority() - 1;
        queues[priorityIndex].enqueue(character);
    }

    public Character[] selectCharactersForBattle() {
        Character[] charactersForBattle = new Character[2];

        charactersForBattle[0] = selectCharacterFromQueue(0, nintendoQueue1, nintendoQueue2, nintendoQueue3);
        charactersForBattle[1] = selectCharacterFromQueue(0, bethesdaQueue1, bethesdaQueue2, bethesdaQueue3);

        return charactersForBattle;
    }

    private Character selectCharacterFromQueue(int queueIndex, Queue<Character>... queues) {
        return queues[queueIndex].isEmpty() ? null : queues[queueIndex].dequeue();
    }

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



    private boolean shouldMoveToPriority1() {
        // Devuelve true con un 40% de probabilidad (para sacar de la cola de refuerzo)
        return new Random().nextInt(100) < 40;
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