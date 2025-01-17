import java.util.*;

public class Main {
  public static void main(String[] args) {
     Scanner console = new Scanner(System.in); 
      int n = console.nextInt();
      
      int x = 0;
      int answer =0;
      
      while (x<n){
          x+=1;
          answer += x;
      }
     System.out.println(answer);
      
  }
}