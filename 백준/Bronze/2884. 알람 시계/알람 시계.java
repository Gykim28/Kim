import java.util.*;

public class Main {
  public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      int hour = console.nextInt();
      int minute = console.nextInt();
      
      if (minute < 45){
          if (hour > 0){
              System.out.println((hour-1)+" "+(60+(minute - 45)));
          }
          else{
             System.out.println(23+" "+(60+(minute - 45))); 
          }
      }
      else{
              System.out.println(hour+" "+(minute - 45));
 
      }
  }
}
      