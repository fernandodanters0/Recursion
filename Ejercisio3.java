package Recursivo;

public class Ejercisio3 {

    public static void main(String[] args) {

        cheers(1234);

    }

    public static void cheers(int n) {
        if (n == 1) {
            System.out.println(n);
        }

        else {
            cheers(n - 1);
            System.out.println();
        }

    }

}
