package main.java;

import java.util.Scanner;

class VirtualPetApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println ("What is your pet's name?");
        String petName = input.nextLine();
        System.out.println ("What is your pet's species? Please choose Cat or Dog");
        String petSpecies = input.nextLine();
        System.out.println ("What color is your pet? You may select purple or yellow ");
        String petColor = input.next();
        VirtualPet cutePet = new VirtualPet();
        String textColor = null;
        String resetColor= "\033[0m";
        String nameOne = petName.substring(0,1);
        String nameTwo = nameOne.toUpperCase();
        String printName = nameTwo + petName.substring(1);



        if (petColor.equalsIgnoreCase("purple")){
           textColor = "\033[0;35m";
        }
        else if (petColor.equalsIgnoreCase("yellow")) {
            textColor = "\033[0;33m";
        }

        System.out.println ("Congratulations on your new pet. Here is your pet:" + printName + " the " + petColor + " " + petSpecies);
        System.out.println("Here is what your pet looks like:" + textColor);
        if (petSpecies.equalsIgnoreCase("Dog")){
            System.out.println("    ______ ");
            System.out.println("  (|.   .|)");
            System.out.println("  (  (Y)  )");
            System.out.println("  ('') ('') ");

        }
        if (petSpecies.equalsIgnoreCase("Cat")){
            System.out.println("        ^      ^		");
            System.out.println("       =(*  . * )=		");
            System.out.println("        (___~___)  	");
            System.out.println("           U U           ");


        }
        System.out.println(resetColor + "What would you like to do with your pet?");
        System.out.println("p.s. keep my levels low to keep me happy and healthy!");
        printMenu();



        while (true) {

            System.out.println("Here are my current stats ");
            System.out.println("Hunger: " + cutePet.getHunger());
            System.out.println("My emotions: " + cutePet.getFeelings());
            System.out.println("Comfort: " + cutePet.getComfort());
            System.out.println("Fun: " + cutePet.getFun());
            System.out.println("Hygiene: " + cutePet.getHygiene());
            System.out.println("Energy: " + cutePet.getEnergy());
            System.out.println("What do you want to do next? Type 'help' to see your options");

            String menuOption = input.next();

            if (menuOption.equals("help")) {
                printMenu();
                continue;
            } else if (menuOption.equals("1")) {
                System.out.println("Wow! That was delicious!");
                cutePet.feed();

            } else if (menuOption.equals("2")) {
                System.out.println("That was a lot of fun, you have me wiped out!");
                cutePet.play();
            } else if (menuOption.equals("3")) {
                System.out.println("Thank you for the attention!");
                cutePet.snuggle();

            } else if (menuOption.equals("4")) {
                System.out.println("I feel so refreshed!");
                cutePet.pottyTime();

            } else if (menuOption.equals("5")) {
                System.out.println("goodnight. I love you!");
                cutePet.sleep();

            } else if (menuOption.equals("6")) {
                System.out.println("See you next time. I'll miss you!");
                break;
            } else {
                System.out.println("Error! Please try again.");
            }

            cutePet.tick();

           // System.out.println("Press enter to see my updated stats!");

            input.nextLine();

        }

        input.close();

    }

    private static void printMenu() {
        System.out.println("Press 1 to feed me");
        System.out.println("Press 2 to play with me");
        System.out.println("Press 3 to snuggle with me");
        System.out.println("Press 4 to wash and toilet me");
        System.out.println("Press 5 to tuck me in");
        System.out.println("Press 6 to leave");



        System.out.println("To see menu throughout the game, type \"help\".");

    }


    }



