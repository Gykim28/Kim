import java.util.*;

public class Main {
  public static void main(String[] args) {
     Scanner console = new Scanner(System.in);
     int n = console.nextInt();
     for (int i = 1; i < 10; i++){
         System.out.println(n+ " * "+ i +" = "+(i*n));
     }
  }
}