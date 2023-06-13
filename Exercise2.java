package Recursivo;

public class Exercise2 {
 
        public static void main (String [] args)
        {
        cheers (3);
        }
        public static void cheers (int n){
        if (n == 0) {
        return;
        }
          System.out.print("*" + " ");
          cheers (n - 1);
          System.out.println();
        }
    
}

