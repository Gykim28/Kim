//시간, 분, 요리시간이 입력됨
//첫번째 조건 : 분 + 요리시간 >= 60
//두번째 조건 : 시간 >= 24


import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner console = new Scanner(System.in); 
      int hour = console.nextInt();
      int minute = console.nextInt();
      int cooking = console.nextInt();
      
      int timeInMinute= hour * 60 + minute;
      int totalMinute= cooking+timeInMinute;
      
      if (totalMinute < 1440){
          System.out.println(totalMinute/60+" "+(totalMinute%60));
      }
      else{
          System.out.println((totalMinute-1440)/60+" "+((totalMinute-1440)%60));
      }
    }
}