package org.example;

public class Main {
    public static void main(String[] args) {

        String nameComplet = "Fabrice Michel".trim();
        System.out.println(nameComplet.substring(1, 3));
        String prenom = nameComplet.substring(0, nameComplet.indexOf(" "));
        String name = nameComplet.substring(nameComplet.indexOf(" ") + 1);
        System.out.println("Nom:" + name + " \nPrénom:" + prenom);
        System.out.println("Nom :" + name + " " + prenom.charAt(0)+".");
        for (int i = nameComplet.length()-1; i >0 ; i--) {

            System.out.print(nameComplet.charAt(i)+" ");

        }

    }
}