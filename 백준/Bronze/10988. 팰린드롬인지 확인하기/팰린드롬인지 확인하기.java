import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner console = new Scanner(System.in); 
     String str = console.next();
        int answer =0;
    int count =0;
        for(int i = 0; i < str.length(); i++){
         if (str.substring(i,i+1).equals(str.substring(str.length()-1-i,str.length()-i))){
             count++;
         }
        }
        if (count == str.length()){
            answer=1;
        }
        else{
            answer =0;
        }
        System.out.print(answer);
    }
}
    
        