import java.util.*;

public class Main {
  public static void main(String[] args) {
     Scanner cs = new Scanner(System.in);
      int n = cs.nextInt();
      for (int i =1; i<=n;i++){
          int a = cs.nextInt();
          int b = cs.nextInt();
          System.out.println("Case #"+i+": "+a+" + "+b+" = "+(a+b));
      }
     
  }
   
}