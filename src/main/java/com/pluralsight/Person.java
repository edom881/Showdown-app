package com.pluralsight;

public class Person {


        String name;
        int health;
        int attackPower;

        // constructor
        public Person(String name, int health, int attackPower) {
            this.name = name;
            this.health = health;
            this.attackPower = attackPower;
        }

        // attack method
        public void attack(Person enemy) {
            enemy.health -= this.attackPower;

            System.out.println(this.name + " attacks " +
                    enemy.name + " for " +
                    this.attackPower + " damage!");

            System.out.println(enemy.name +
                    " health is now " +
                    enemy.health);
        }

        // check if alive
        public boolean isAlive() {
            return health > 0;
        }
    }


