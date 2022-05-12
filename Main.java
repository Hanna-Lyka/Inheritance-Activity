package com.lab;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks\n");

        // Creating a new instance of the class Wizard and Warlock.
        Wizard Hanna = new Wizard("Hanna", 15,150,200);
        Warlock Cyrelle = new Warlock("Cyrelle", 10, 100, 150);

        // Calling the methods of the class Wizard and Warlock.
        Hanna.nameDisplay();
        Cyrelle.nameDisplay();

        Hanna.IceSpear(Cyrelle);
        Hanna.showStats();
        Cyrelle.showStats();

        Cyrelle.LightBarage(Hanna);
        Hanna.showStats();
        Cyrelle.showStats();

        Hanna.healSpell();
        Hanna.showStats();
        Cyrelle.showStats();

        Cyrelle.ThunderBolt(Hanna);
        Hanna.showStats();
        Cyrelle.showStats();

        Hanna.FrostBite(Cyrelle);
        Hanna.levelUp();
    }
}