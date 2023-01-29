/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicexp.exercice2;
import java.util.Scanner;

/**
 *
 * @author kernel-mk
 */
public class Exercice2 {
    public void TimeZone(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez le décalage horaire entre votre domicile et la destination de voyage (en heures) : ");
            int offset = scanner.nextInt();

            int midnightAtHome = 0;
            int noonAtHome = 12;
            int midnightAtDestination = (midnightAtHome + offset) % 24;
            int noonAtDestination = (noonAtHome + offset) % 24;

            System.out.println("Il sera " + midnightAtDestination + "h00 à la destination de voyage lorsqu'il sera minuit à la maison.");
            System.out.println("Il sera " + noonAtDestination + "h00 à la destination de voyage lorsqu'il sera midi à la maison.");
        }
    }

    public static void main(String[] args) {
        Exercice2 exo2 = new Exercice2();
        exo2.TimeZone();
    }
}
