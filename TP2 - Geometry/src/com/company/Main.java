/*
NOM: BRAKEN MOHAMMED ESSDDIK
TP: Formes Geometriques
Specialité: ISI
Version: 1.0
* */

package com.company;
import java.util.*;

public class Main {
static void Rectangle(int n,int m){
    System.out.println("This is a Rectangle :");

    for(int i=0; i<n; i++)
    {
        for(int j=1; j<m; j++)
        {
            System.out.print("*  ");
        }
        System.out.println("*");
    }}

    static void Triangle(int n){
        System.out.println("This is a Triangle: ");

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print("*  ");
            }
            System.out.println("*");
        }}
    static void Monchar(int n,int m){
        System.out.println("This is a Monchar: ");
int k;
for (k=0;k<m;k++){
    for(int i=0; i<=n; i++)
    {
        for(int j=0; j<=i; j++)
        {
            System.out.print("*  ");
        }
        System.out.println();
    }
}
       }

    public static void Pyramid(int n)
    {
    System.out.println("This is a pyramid :");
        for (int i=0; i<n; i++)
        {
            for (int j=n-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static  void Losange(int n){
        System.out.println("This is a Losange :");
        int  x, j, blank = 1;
        blank = n - 1; // logic for balck spaces
        for (j = 1; j <= n; j++) {
            for (x = 1; x <= blank; x++) {
                System.out.print(" ");
            }
            blank--;
            for (x = 1; x <= 2 * j - 1; x++) {
                System.out.print("*"); //Print Star
            }
            System.out.println("");
        }
        blank = 1;
        for (j = 1; j <= n - 1; j++) {
            for (x = 1; x <= blank; x++) {
                System.out.print(" "); //Print Spaces
            }
            blank++;

            for (x = 1; x <= 2 * (n - j) - 1; x++) {
                System.out.print("*"); //Print Star
            }
            System.out.println(""); //Print new line
        }
    }

    static  void letterM(int n){
        double x,y,m;
        m=n;
        for(y=m;y>=-m;y--){
            for(x=-m;x<=m;x++){

                if((Math.abs(Math.abs(x)-y)<m/5&&y>0)||(Math.abs(x)<=m&&Math.abs(x)>=m-(m/5))){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }

    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        System.out.print("Enter n: ");
       int n= scanner.nextInt();
        System.out.print("Enter m: ");
       int m= scanner.nextInt();
        Rectangle(n,m);
        Triangle(n);
        Monchar(n,m);
        Pyramid(n);
        Losange(n);
        letterM(n);


    }
}
