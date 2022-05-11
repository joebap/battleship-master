package com.company;

public class Warlock extends Character{
    Warlock(String name){
        super(name);

    }
    public void lightningAxe(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Firestorm (Damage - 60)");
        int damagePoints = 60;
        int manaLost =50;
        damageTarget(enemyCharacter, damagePoints,manaLost);
    };
    public static void recover(Character character) {
        recovering(character);
    };

}