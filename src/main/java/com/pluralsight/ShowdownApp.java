package com.pluralsight;

public class ShowdownApp {
    public static void main(String[] args) {
        SuperHero hero = new SuperHero("Spider Man", 100, 20);
        SuperVillain villain = new SuperVillain("Green Goblin", 100, 15);

        System.out.println("The showdown begins!");
        while (hero.isAlive() && villain.isAlive()) {

            hero.attack(villain);

            if (villain.isAlive()) {
                villain.attack(hero);
            }

        }
    }

}


