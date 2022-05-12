package com.lab;

public class Wizard extends Character{
    // Calling the constructor of the super class.
    Wizard (String name, int newLevel, int newHealth, int newMana){
        super(name,newLevel,newHealth,newMana);
    }



    // This is a method that is used to attack the enemy character.
    public void FrostBite (Character enemyCharacter) {
        int damagePoints = 50;
        int manaCost = 30;
        manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with FrostBite (Damage - 70)");
        damageTarget(enemyCharacter, damagePoints);
    }


    // A method that is used to attack the enemy character.
    public void IceSpear(Character enemyCharacter){
        int damagePoints = 70;
        int manaCost = 45;
        manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with IceSpear (Damage - 40)");
        damageTarget(enemyCharacter, damagePoints);
    }
    /**
     * This function is used to heal the character and regenerate mana
     */
    public void healSpell(){
        int heal=80;
        int manaRegen=60;

        healthPoints += heal;
        manaPoints += manaRegen;

        System.out.println(super.characterName +" use Spell Regen (Health +"+ heal +")" + " (Mana +"+ manaRegen +")");
    }

}