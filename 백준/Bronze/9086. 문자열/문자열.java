import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner console = new Scanner(System.in); 
      int num = console.nextInt();
      for (int i = 0; i < num; i++){
          String str = console.next();
          System.out.println(str.substring(0,1) + str.substring(str.length()-1));
        


      }
    }
}
