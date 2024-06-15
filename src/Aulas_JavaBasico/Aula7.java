package Aulas_JavaBasico;

import java.util.Scanner;

public class Aula7 {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        String name1, name2;

        System.out.print("Enter here the first name: ");
        name1 = sc.next();
        System.out.print("Enter here the second name: ");
        name2 = sc.next();

        System.out.print("Name 1 is the same as name 2?: " + name1.equals(name2));
        // equals é utilizado apenas para string e objetos
    }
}
