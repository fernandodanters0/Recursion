package Recursivo;

import java.util.Scanner;

public class Palindromo {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingresa una palabra: ");
        String palabra = sc.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println(palabra + " es un palindromo");
        } else {
            System.out.println(palabra + " no es un palindromo");
        }
        System.out.println();

    }

    public static boolean esPalindromo(String palabra) {
        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    

}