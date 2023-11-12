/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author juand
 */
public class AI {

    private static final double WIN_PROBABILITY = 0.4;
    private static final double DRAW_PROBABILITY = 0.27;
    private static final double NO_COMBAT_PROBABILITY = 0.33;

    public void processBattle(Character zeldaCharacter, Character streetFighterCharacter) {
        try {
            Thread.sleep(10); //10 seg (COLOCAR 10000)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double result = Math.random();

        // Utilizamos los puntos únicos para determinar el resultado
        int zeldaPoints = zeldaCharacter.getUniquePoints();
        int streetFighterPoints = streetFighterCharacter.getUniquePoints();

        if (result < WIN_PROBABILITY) {
            handleWinner(zeldaCharacter, streetFighterCharacter, zeldaPoints, streetFighterPoints);
        } else if (result < WIN_PROBABILITY + DRAW_PROBABILITY) {
            handleDraw(zeldaCharacter, streetFighterCharacter);
        } else {
            handleNoCombat(zeldaCharacter, streetFighterCharacter);
        }
        // Después del combate, probabilidad del 40% de mover un personaje de refuerzo a la cola de prioridad 1
        if (Admin.shouldMoveToPriority1()) {
            Admin.moveCharacterToPriority(Admin.reinforcementQueueNintendo, Admin.nintendoQueue1);
        }

        if (Admin.shouldMoveToPriority1()) {
            Admin.moveCharacterToPriority(Admin.reinforcementQueueBethesda, Admin.bethesdaQueue1);
        }
        Admin.incrementRoundCounters(); // Incrementa los contadores de todas las colas
        //Generador de personajes (80% de probabilidad)
        Admin.roundCounter ++;
        if (Admin.roundCounter % 2 == 0) { // Se han completado dos rondas
            if (Admin.shouldGenerateCharacters()) {
                Admin.generateCharacters();
                System.out.println("SE GENERARON 2 PERSONAJES NUEVOS!");
            }
        }
    }

    private void handleWinner(Character winner, Character loser, int winnerPoints, int loserPoints) {
        System.out.println("¡Combate terminado! El ganador es: " + winner.getName()
                + " (ID: " + winner.getId() + ") con " + winnerPoints + " puntos únicos.");
        // logica para añadir a la lista de ganadores
    }

    private void handleDraw(Character character1, Character character2) {
        System.out.println("¡Combate empatado! Ambos personajes vuelven a la cola de prioridad 1.");
        // logica para que vulevan a la cola de prioridad 1
        Admin.nintendoQueue1.enqueue(character1);
        Admin.bethesdaQueue1.enqueue(character2);
    }

    private void handleNoCombat(Character character1, Character character2) {
        System.out.println("No puede llevarse a cabo el combate. Ambos personajes van a la cola de refuerzo.");
        // Se agregan en la cola de refuerzo
        Admin.reinforcementQueueNintendo.enqueue(character1);
        Admin.reinforcementQueueBethesda.enqueue(character2);
    }
}
