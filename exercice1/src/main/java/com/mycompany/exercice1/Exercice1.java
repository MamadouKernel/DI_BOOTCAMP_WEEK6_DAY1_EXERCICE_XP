/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercice1;

import java.util.Scanner;

/**
 *
 * @author kernel-mk
 */
public class Exercice1 {
    public void TriangleValidity() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez le premier angle: ");
            int angle1 = scanner.nextInt();
            System.out.print("Entrez le deuxième angle: ");
            int angle2 = scanner.nextInt();
            System.out.print("Entrez le troisième angle: ");
            int angle3 = scanner.nextInt();

            if (angle1 + angle2 + angle3 == 180) {
                System.out.println("C'est un triangle valide.");
            } else {
                System.out.println("Ce n'est pas un triangle valide.");
            }
        }
    }
    public static void main(String[] args) {
        Exercice1 exo1 = new Exercice1();
        exo1.TriangleValidity();
    }

}
