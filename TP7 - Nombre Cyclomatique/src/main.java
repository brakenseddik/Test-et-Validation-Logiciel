/*
Nom: BRAKEN MOHAMMED ESSEDDIK
Project: Manipulation des E/S
Version: 1.0

* creéer deux fichier textes 1.txt 2.txt done
TP 6: calcul de loc(nbre d'instruction == taille dun prgm)
pour java loc =nbre de ;

loc  phisique /logique
* */


import java.io.*;

class Main {
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

            // create a counter and initialize it with 1
            int a=1;
            // Create a table of Strings
            String  [] text;
            // convert the text into a table of Strings
            text= chaine.split(" ",chaine.length());
            // check the text if contains a decision
            int i=0;
            while (i<text.length){
                if (text[i].equals("if")|| text[i].equals("while")||text[i].equals("for")||text[i].equals("case") || text[i].equals("switch"))
                    a++;
                i++;}


            fichierSortie1.println("Le nombre cyclomatique est: "+a +"   length "+chaine.length());
            fichierSortie1.close();

            System.out.println("Le fichier  "+fichier1+" a été créé");

        }catch (Exception e){
            System.out.println(e.toString());

        }
    }


}
