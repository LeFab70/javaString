package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez votre nom complet :");
        String nameComplet = scan.nextLine().trim().toUpperCase();
        System.out.println(nameComplet.substring(1, 3));
        String prenom = nameComplet.substring(0, nameComplet.indexOf(" "));
        String name = nameComplet.substring(nameComplet.indexOf(" ") + 1);
        System.out.println("Nom:" + name + " \nPrénom:" + prenom);
        System.out.println("Nom :" + name + " " + prenom.charAt(0) + ".");
        System.out.println("**************Dans ordre inverse*******************");
        for (int i = nameComplet.length() - 1; i > 0; i--) {
            System.out.print(nameComplet.charAt(i) + " ");
        }
        System.out.println("**************Dans check email*******************");
        System.out.println("Entrez un email :");
        String email=scan.nextLine().trim();

        if(checkEmail(email))
        System.out.println("Email correct");
        else
        System.out.println("Email incorrect");

        scan.close();
    }

    public static boolean checkEmail(String email){
       int indexOfArobase=email.indexOf("@");
       if(indexOfArobase==-1) //Pas de @
           return false;
       else
       {
           int indexOfFirstPoint=email.indexOf(".",0,indexOfArobase);//Verifier sil ya un point avant @
           int indexOfSecondPoint=email.indexOf(".",indexOfArobase); // verifier sil ya un point apres @
           return indexOfFirstPoint != -1 && indexOfSecondPoint != -1;
       }
    }
}