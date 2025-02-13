import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner console = new Scanner(System.in); 
     int num = console.nextInt();
        
     for (int i = 0;i<=num;i++){
         for (int k = 0; k < i; k++){
              System.out.print(" ");
         }
         for (int j = 0; j < num*2 - (1+i*2) ; j++){
             System.out.print("*");
         }
         System.out.println();
     }
    }
}
    
        