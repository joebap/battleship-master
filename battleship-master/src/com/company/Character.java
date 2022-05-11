package com.company;

public class Character {
    public String characterName;
    public static int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;
    public int x = 1;
    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */
    Character(String name) {
        characterName = name;
        level = 4 ;
        healthPoints = 100;
        manaPoints = 200;
    }

    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */

    /**
     * Create a method to Damage Target Character
     */

        public void damageTarget(Character enemyCharacter, int damagePoints,int manalost) {

                /**
                 *
                 * Deduct health points from enemy character
                 */

                enemyCharacter.healthPoints -= damagePoints;
                System.out.println(enemyCharacter.characterName+" HP Left = " + enemyCharacter.healthPoints);
                manaPoints -= manalost;
                System.out.println("your total mana points = " + manaPoints);
                if (enemyCharacter.healthPoints <= 0) {
                    System.out.println(enemyCharacter.characterName + " is defeated");
                    plevel();
                    details();
                    System.exit(0);

                /**
                 * Prompt Character is defeated if HP falls below 0
                 * eg. Character Shaman defeated.
                 */
                }
            }
         private void plevel(){
            int charlevel = 10;
            level += charlevel;

        }
        private void details(){
            System.out.println("Winner "+ characterName);
            System.out.println("Winner details :");
            System.out.println("    character name "+ characterName);
            System.out.println("    character level : "+ level);
            System.out.println("    character total health points "+ healthPoints);
            System.out.println("    character total mana points " + manaPoints);

        }
        public static void recovering (Character character){
            if (character.x == 1) {
                System.out.println(character.characterName + " is recovering increasing 20 points and 30 mana points");
                int increasePoints = 20;
                int manaPlus = 30;
                character.healthPoints += increasePoints;
                System.out.println("enemy character HP Left = " + character.healthPoints);
                character.manaPoints += manaPlus;
                System.out.println("Total mana points = " + character.manaPoints);
                character.x = character.x - 1;
            } else {
                System.out.println("sorry no more recover spell");
            }
        }
    }


