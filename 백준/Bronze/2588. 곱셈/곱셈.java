import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner console = new Scanner(System.in); 
      int a = console.nextInt();
      int b = console.nextInt();
      
      System.out.println(a*(b%10));
      System.out.println(a*((b/10)%10));
      System.out.println(a*((b/100)));
      System.out.println(a*b);
    }
}
           
                     
