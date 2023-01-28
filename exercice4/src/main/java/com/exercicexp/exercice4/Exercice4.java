/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicexp.exercice4;

/**
 *
 * @author kernel-mk
 */
public class Exercice4 {
    private static final int[] letterScores = {
        1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10
    };
    //Attribut qui contiendra le mot pour lequel on veut calculer le score
    private String word;
    //Constructeur qui prend en entrée un mot et le convertit en majuscule
    public Exercice4(String word){
        this.word = word.toUpperCase();
    }
    //Méthode qui calcule le score du mot
    public int getScore(){
        int score = 0;
        for (int i = 0; i < word.length(); i++) {
            score += letterScores[word.charAt(i) - 'A'];
        }
        return score;
    }

    
    public static void main(String[] args) {
            Exercice4 exo4 = new Exercice4("hello");
            System.out.println(exo4.getScore());
    }
}
