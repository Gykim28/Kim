import java.util.*;

public class Main {
  public static void main(String[] args) {
     Scanner console = new Scanner(System.in);
     int totalMoney = console.nextInt();
     int numOfCategory = console.nextInt();
     int money = 0; 
     String answer = "";
      
     for (int i=0;i < numOfCategory; i++){
         int stuff = console.nextInt();
         int numOfStuff = console.nextInt();
         
         money += stuff * numOfStuff;
         
         if (money == totalMoney){
             answer = "Yes";
         }
         else{
             answer = "No";
         }
     }
         System.out.println(answer);
      
  }
}