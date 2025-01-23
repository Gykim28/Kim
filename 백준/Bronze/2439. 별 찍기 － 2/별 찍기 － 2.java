import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner console = new Scanner(System.in); 
      int num = console.nextInt();
      for (int i = 1; i < num+1; i++){
         for (int x = 0; x < num-i; x++){
             System.out.print(" ");
         }
         for (int j = 0; j < i; j++){
             System.out.print("*");
         }
         System.out.print("\n");
      }
        
    }
}