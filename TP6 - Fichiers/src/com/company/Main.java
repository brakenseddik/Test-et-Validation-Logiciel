/*
Nom: BRAKEN MOHAMMED ESSEDDIK
Project: Manipulation des E/S
Version: 1.0

* creéer deux fichier textes 1.txt 2.txt done
TP 6: calcul de loc(nbre d'instruction == taille dun prgm)
pour java loc =nbre de ;
* */

package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // lecture
        String chaine="";
        String fichier="code.txt";
        String fichier1="results.txt";

        try {
            InputStream f1=new FileInputStream(fichier);

            InputStreamReader ipsr1=new InputStreamReader(f1);

            BufferedReader br1= new BufferedReader(ipsr1);

            String ligne;
            while ((ligne=br1.readLine())!=null){
               // System.out.println(ligne);
                chaine+=ligne+"\n";

            }

            br1.close();



        }catch (Exception e){
            System.out.println(e.toString());

        }

// ecriture
        try {
            FileWriter fw1=new FileWriter(fichier1);

            BufferedWriter bw1=new BufferedWriter(fw1);

            PrintWriter fichierSortie1=new PrintWriter(bw1);
            int c=0;
            char [] code= chaine.toCharArray();
            for (int i = 0; i < code.length ; i++) {
                if (code[i]==';')c++;
            }
            fichierSortie1.println("Le nombre d'instructions (LOC) est: "+c);
            fichierSortie1.close();

            System.out.println("Le fichier  "+fichier1+" a été créé");

        }catch (Exception e){
            System.out.println(e.toString());

        }
    }


}
