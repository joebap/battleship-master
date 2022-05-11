package com.company;

public class Wizard extends Character{
    Wizard(String name){
        super(name);
    }
    public void fireStorm(Character enemyCharacter){
        System.out.println(super.characterName + "attacks " + enemyCharacter.characterName + " with Firestorm (Damage - 50)");
        int damagePoints = 50;
        int Mana_decrease = 60;
        damageTarget(enemyCharacter, damagePoints,Mana_decrease);
    };
    public static void recover(Character character) {
        recovering(character);
    };
}