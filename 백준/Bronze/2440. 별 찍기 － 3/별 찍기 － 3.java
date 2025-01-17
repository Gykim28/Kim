import java.util.*;

public class Main {
  public static void main(String[] args) {
     Scanner console = new Scanner(System.in);
      int num = console.nextInt();
     for (int i = num; i > 0; i--){
         for (int j = i; j > 0; j--){
             System.out.print("*");
         }
       System.out.print("\n");
     }
  }
}