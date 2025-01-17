import java.util.*;

public class Main {
  public static void main(String[] args) {
     Scanner console = new Scanner(System.in);
     while (true){
         int a = console.nextInt();
         int b = console.nextInt();
         if (a+b == 0){
             break;
         }
         else {
             System.out.println(a+b);
         }
         
     }
      
  }
}