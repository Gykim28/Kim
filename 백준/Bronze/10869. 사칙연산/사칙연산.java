import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in); 
    int input1 = console.nextInt();
    int input2 = console.nextInt();
    
    //A+B, A-B, A*B, A/B(몫), A%B
    System.out.println(input1 + input2);
    System.out.println(input1 - input2);
    System.out.println(input1 * input2);
    System.out.println(input1 / input2);
    System.out.println(input1 % input2);
    
  }
}