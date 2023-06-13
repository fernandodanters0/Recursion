package Recursivo;

import java.util.Scanner;

//Escribe un programa recursivo que pida al usuario un número entero
//N e imprima en pantalla los números enteros N, N-1, N-2,…,3, 2, 1

public class Secuencia {
    //Atributo scanner
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingresa un numero entero: ");
        int num = sc.nextInt();
        serieN1(num);
        System.out.println();

    }

    public static void serieN1(int n) {
        if (n == 1) {
            System.out.print(n);
        } else {
            System.out.print(n + " ");
            serieN1(n - 1);

        }

    }

}
