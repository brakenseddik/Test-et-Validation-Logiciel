/*
 Nom de TP:
 Etudiant:
 Version:
*/
package com.company;
import  java.util.*;
public class Main {


    public static void main(String[] args) {
         int[] lettres={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K' ,'L',
                'M' ,'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V' ,'W' ,'X' ,'Y' ,'Z'};
        Scanner scanner=new Scanner(System.in);
        int[] chiffrement = new int[23];
        int[] chiffr = new int[3];
        System.out.println("Entrer le mot: ");
        String mot=scanner.nextLine();
        System.out.println("Entrer la longeur de clé: ");
        int longeur=scanner.nextInt();
        for (int i=longeur;i<23;i++){
          chiffrement[i]=lettres[i];
        }
        for (int j=0;j<3;j++){
            chiffr[j]=lettres[j];
        }
        for (int j=0;j<26;j++){
            System.out.println(Integer.toBinaryString(chiffr[j]) +Integer.toBinaryString(chiffrement[j]));}
	// write your code here
    }
}
// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
// D E F G H I J K L M N O P Q R S T U V W X Y Z A B C  :: chiffrement
// X Y Z A B C D E F G H I J K L M N O P Q R S T U V W  :: dechifferement