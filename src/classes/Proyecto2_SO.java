/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author juand
 */
public class Proyecto2_SO {

    public static void main(String[] args) {
        // Crear instancias de las clases necesarias
        Admin admin = new Admin();
        AI ai = new AI();

        // Inicializar personajes y colocarlos en las colas
        admin.initializeCharacters();

        // Simular rondas de la IA
        for (int round = 1; round <= 10; round++) { // Ejemplo: 10 rondas
            System.out.println("\n--- Ronda " + round + " ---");

            // Mostrar las colas antes de la ronda
            admin.printQueues();

            // Seleccionar personajes para el combate desde las colas
            Character[] charactersForBattle = admin.selectCharactersForBattle();
            Character zeldaCharacter = charactersForBattle[0];
            Character streetFighterCharacter = charactersForBattle[1];

            if (zeldaCharacter != null && streetFighterCharacter != null) {
                System.out.println("Inicia el combate: " + zeldaCharacter.getName() + " vs " + streetFighterCharacter.getName());
            }

            // Procesar la batalla en la IA
            ai.processBattle(zeldaCharacter, streetFighterCharacter);

            // Actualizar las colas después de la ronda
//            admin.updateQueues(); ESTO HACE QUE SE SUBAN LAS POSICIONES 1 DE LAS COLAS AL FINAL DE CADA RONDA.
        }

        // Mostrar las colas al final de la simulación
        System.out.println("\n--- Colas finales ---");
        admin.printQueues();
    }
}
