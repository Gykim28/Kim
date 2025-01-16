import java.util.*;

public class Main {
  public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      int num1=console.nextInt();
      int num2=console.nextInt();
      int num3=console.nextInt();

    if ((num1 == num2) && (num2 == num3)){
        System.out.println(10000 + num1 * 1000);
    }

      else if ((num1 == num2) || (num2 == num3) || (num1== num3)){
          if (num1 == num2){
              System.out.println(1000 + num1 * 100);
          }
        else if (num2 == num3){
              System.out.println(1000 + num2 * 100);
          }
          else {
              System.out.println(1000 + num3 * 100);
          }
      }
    
      else{
          if ((num1 > num2) && (num1 > num3)){
              System.out.println(num1 * 100);
          }
        else if ((num2 > num1) && (num2 > num3)){
              System.out.println(num2 * 100);
          }
          else {
              System.out.println(num3 * 100);
          }
      }
  }
}
