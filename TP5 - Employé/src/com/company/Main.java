/*
* le payement d'un employe est par heur
* chaque heur=500 da
* si nbre de heurs>35 heurs en semaines chaque heur ==300
* si nbre heurs <=10 h ne peux pas payé
*  <=10 zero
* 11 - 35 nbr heurs* 500
* >35 nbr heurs -(35)* 300+35 * 500
* */


package com.company;

import java.util.Scanner;

public class Main {
    static void calculSalaire(int heurs){
        int max=56;
        if (heurs<=10){
            System.out.println("l'employé ne put pas etre payé");
        }
        else if (heurs<=35){
            System.out.println("salaire :"+ heurs*500);
        }
        else if(heurs<max){
            int a=heurs-35*300+35*500;
            System.out.println("salaire :"+ a);

        }
        else{ int a=20*300 + 35*500;
            System.out.println("salaire :"+ a);

    }}

static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        System.out.print("Entrer le nombre des heurs: ");
        int heurs=scanner.nextInt();
        calculSalaire(heurs);
    }
}
