package Recursivo;

import java.util.Scanner;
//Ejercisio capaz de invertir un numero utilizando recursion.
public class Ejercisio1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingresa el numero: ");
        int number = sc.nextInt();
        System.out.println("El numero inverso es: ");
        invertir(number);
        System.out.println();
        //int inverso = inverse(number);
        //System.out.println("El numero inverso es: " + inverso); 
    }

    public static void invertir(int n){
        if (n <= 10){
            System.out.print(n);

        } else {
            System.out.print(n % 10);
            invertir(n / 10);
        }
    }
}