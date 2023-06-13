package Recursivo;

public class Ejercisio5 {
    public static void main (String [] args)
  {
  cheers (3);
  }
  public static void cheers (int n){
  if (n<1){
    return;
    }
    
    System.out.print(n +" ");
    cheers (n - 1);
  }
    
}
