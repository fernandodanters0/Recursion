package Recursivo;

import java.util.Scanner;

public class Factorial {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = sc.nextInt();
        long factorial = factorial(num);
        System.out.println("El factorial de " + num + " es: " + factorial);
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
}
