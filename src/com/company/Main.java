package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        java.util.Scanner sc;
        sc = new Scanner(System.in);
        int selection = Integer.parseInt(sc.nextLine());

        if (selection == 1) {
            System.out.println("Le jeu va démarrer...");
        } else if (selection == 2) {

            System.out.println("                            ▓ Règles ▓ ");

            System.out.println("                            ▓  ▲  ▲  ▓");

            System.out.println("Pendant son tour un joueur peut déplacer son pion d’une case (verticalement ou\n" +
                    "horizontalement), puis il détruit une case du plateau.\n" +
                    "Le dernier joueur pouvant encore se déplacer gagne ");
            System.out.println("Contraintes :\n" +
                    "-Un joueur ne peut pas détruire une case occupée.\n" +
                    "-Un joueur ne peut pas occuper une case détruite ou une case déjà occupée.\n" +
                    "-Un joueur bloqué pendant un tour est déclaré perdant.\n" +

                    " \nPour retourné au Menu tapez 1");


            java.util.Scanner rt;
            rt = new Scanner(System.in);
            int retour = Integer.parseInt(rt.nextLine());

            if (retour == 1) {

            } else if (selection == 3) {
                System.out.println("casse toi");
            }
        }

    }
}












