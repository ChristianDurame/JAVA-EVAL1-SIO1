package com.sio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String GREEN = "\u001B[32m";
    private static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println(GREEN);
        System.out.println("#############################################");
        System.out.println("            JAVA EVAL 1 SIO 1 ALT            ");
        System.out.println("#############################################");

        while(true){
            System.out.println("#############################################");
            System.out.println("1. Exercice 1");
            System.out.println("2. Exercice 2");
            System.out.println("3. Exercice 3");
            System.out.println("4. Exercice 4");
            System.out.println("0. Quitter le programme");
            System.out.println("#############################################");
            System.out.print("Entrer votre choix: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 1");
                    System.out.println("---------------------------------------------");
                    //Exercice 1 : Entrer votre code ici
                    System.out.println("Entrez le nombre :");
                    int nb = scanner.nextInt();
                    System.out.println("Entrez la puissance :");
                    int pui = scanner.nextInt();
                    while (pui < 0) {
                        System.out.println("La puissance doit être supérieur ou égale à 0");
                        System.out.println("Entrez la puissance :");
                        pui = scanner.nextInt();
                    }
                    double resultat = Math.pow(nb, pui);
                    System.out.println("Le résultat de " + nb + " puissance " + pui + " est: " + resultat);
                    System.out.println("---------------------------------------------");
                    break;
                case 2:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 2");
                    System.out.println("---------------------------------------------");
                    //Exercice 2 : Entrer votre code ici
                    double min = 0.20;
                    double mid = 0.50;
                    double high = 0.80;
                    System.out.println("Entrez le nombre de kilomètres parcourus par le client :");
                    int km = scanner.nextInt();
                    if (km <= 100) {
                        System.out.println( "Le montant à payer par le client est: " + (km * min) + " €");
                    } else if (km <=  500) {
                        System.out.println( "Le montant à payer par le client est: " + (km * mid) + " €");
                    } else {
                        System.out.println( "Le montant à payer par le client est: " + (km * high) + " €");
                    }

                    System.out.println("---------------------------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 3");
                    System.out.println("---------------------------------------------");
                    //Exercice 3 : Entrer votre code ici
                    int x = 0;
                    int y = 0;
                    String mont = "*";
                    System.out.println("Entrez la largeur du rectangle :");
                    int largeur = scanner.nextInt();
                    while (largeur <= 0) {
                        System.out.println("Entrez la largeur du rectangle :");
                        largeur = scanner.nextInt();
                    }
                    System.out.println("Entrez la hauteur du rectangle :");
                    int hauteur = scanner.nextInt();
                    while (hauteur <= 0) {
                        System.out.println("Entrez la hauteur du rectangle :");
                        hauteur = scanner.nextInt();
                    }
                    while (x != largeur) {
                        x++ ;
                        System.out.println("*");
                    }
                    while (y != hauteur) {
                        y++;
                        System.out.println("*");
                    }



                    System.out.println("---------------------------------------------");

                    break;
                case 4:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 4");
                    System.out.println("---------------------------------------------");
                    //Exercice 4 : Entrer votre code ici
                    System.out.println("Entrez un nombre :");
                    int nombre = scanner.nextInt();
                    while (nombre < 0) {
                        System.out.println("Le nombre doit être supérieur à 0 :");
                        nombre = scanner.nextInt();
                    }
                    int resultfacto = 1;
                    int i = 1;
                    while (i <= nombre) {
                        resultfacto *= i;
                        i++;
                    }
                    System.out.println("La factorielle de " + nombre + " est : " + resultfacto);
                    System.out.println("---------------------------------------------");
                    break;
                case 0:
                    System.out.println(RESET);
                    System.exit(0);
                    break;
            }
        }
    }
}