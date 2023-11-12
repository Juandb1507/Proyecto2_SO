/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author juand
 */
public class Character {
    private static int idCounter = 1;
    private int id;
    private String name;
    private int levelPriority;
    private boolean exceptional;
    private int abilities;
    private int health;
    private int strength;
    private int agility;
    private int uniquePoints; // Puntos únicos según nivel de prioridad
    private Set<String> specialAbilities; // Habilidades especiales

    private static final String[] ZELDA_NAMES = {"Link", "Sidon", "Ganondorf", "Impa", "Mipha"};
    private static final String[] STREET_FIGHTER_NAMES = {"Ryu", "Chun-Li", "Guile", "Dhalsim", "Blanka"};

    private Character(String name) {
        this.id = idCounter++;
        this.name = name;

        this.abilities = generateQuality(60);
        this.health = generateQuality(70);
        this.strength = generateQuality(50);
        this.agility = generateQuality(40);

        // Determina si el personaje es excepcional
        if (countQualityAttributes() >= 3) {
            this.exceptional = true;
            this.levelPriority = 1;
        } else {
            this.exceptional = false;
            // Calcula el nivel de prioridad utilizando un método simplificado
            if (determineNumSpecialAbilities() == 1){
                this.levelPriority = 3; //Al solo tener 1 habilidad se setea como Deficiente (Prioridad 3)
            }
            else{
                this.levelPriority = 2; //Al tener 2 habilidades se setea como Promedio(Prioridad 2)
            }
        }

        this.uniquePoints = generateUniquePoints();
        this.specialAbilities = generateSpecialAbilities();
    }

    public static Character createZeldaCharacter() {
        String name = ZELDA_NAMES[new Random().nextInt(ZELDA_NAMES.length)];
        return new Character(name); // El nivel de prioridad se establecerá dentro del constructor
    }

    public static Character createStreetFighterCharacter() {
        String name = STREET_FIGHTER_NAMES[new Random().nextInt(STREET_FIGHTER_NAMES.length)];
        return new Character(name); // El nivel de prioridad se establecerá dentro del constructor
    }

    private int generateQuality(int baseProbability) {
        return new Random().nextInt(100) < baseProbability ? new Random().nextInt(100) + 1 : 0;
    }

    private int generateUniquePoints() {
        // Genera puntos únicos según nivel de prioridad
        switch (levelPriority) {
            case 1:
                return new Random().nextInt(20) + 80; // Rango de 80 a 100 para prioridad 1
            case 2:
                return new Random().nextInt(30) + 50; // Rango de 50 a 80 para prioridad 2
            case 3:
                return new Random().nextInt(40) + 10; // Rango de 10 a 50 para prioridad 3
            default:
                return 0;
        }
    }

    private Set<String> generateSpecialAbilities() {
        Set<String> abilities = new HashSet<>();
        int numAbilities = determineNumSpecialAbilities();

        for (int i = 0; i < numAbilities; i++) {
            abilities.add("SpecialAbility" + (i + 1));
        }

        return abilities;
    }

    private int determineNumSpecialAbilities() {
        return new Random().nextInt(2) + 1; // Devuelve 1 o 2 aleatoriamente (dependiendo de el numero  de habilidades será Promedio o Deficiente)
    }

    private int countQualityAttributes() {
        int count = 0;
        if (abilities > 0) count++;
        if (health > 0) count++;
        if (strength > 0) count++;
        if (agility > 0) count++;
        return count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isExceptional() {
        return exceptional;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getUniquePoints() {
        return uniquePoints;
    }

    public Set<String> getSpecialAbilities() {
        return specialAbilities;
    }

    public int getLevelPriority() {
        return levelPriority;
    }

    @Override
    public String toString() {
        return name + id;
    }
}