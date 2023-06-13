package Recursivo;

public class Ejercisio4 {
    public static void main (String [] args)
  {
  cheers(3, 8);
  }
  public static void cheers (int inicio, int n){
  if (inicio>n){
    return;
    }
    System.out.println (inicio + " ");
    cheers (inicio + 1,n);
  }
    
}
