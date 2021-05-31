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
        String input="code.txt";
        String output="results.txt";

        try {
            InputStream f1=new FileInputStream(input);

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
            FileWriter fw1=new FileWriter(output);

            BufferedWriter bw1=new BufferedWriter(fw1);

            PrintWriter fichierSortie1=new PrintWriter(bw1);

            int c=0;
            char [] code= chaine.toCharArray();
            for (int j = 0; j < code.length ; j++) {
                if (code[j]==';') c++;
            }
            fichierSortie1.println("Le nombre d'instructions (LOC) est: "+c );
String[] table={"+","-","*","/","int","float","double","String",
        "bool","<",">","==","System.out.println","(","{","for","while",";"};
            // create a counter and initialize it with 1
            int operateurs=0;
            int operands=0;
            String  [] text;
            text= chaine.split(" ",chaine.length());
char x='"';
            int i=0;
            int j=0;
            while (i<text.length){
                if (text[i].equals("if")|| text[i].equals(">")||text[i].equals("=")||text[i].equals("+")
                        ||text[i].equals("System.out.println")||text[i].equals("(")||text[i].equals("{")||text[i].equals("int")
                        ||text[i].equals(";") ||text[i].equals(x))
                    operateurs++;
                else operands++;
                i++;}
            fichierSortie1.println("operateurs n1: "+operateurs);
            fichierSortie1.println("operands n2: "+operands);
            fichierSortie1.println("length: "+text.length);


            fichierSortie1.close();

            System.out.println("Le fichier  "+output+" a été créé");

        }catch (Exception e){
            System.out.println(e.toString());

        }
    }


}
