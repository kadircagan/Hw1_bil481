import java.util.ArrayList;
public class App {
    public String getGreeting() {
        return "Hello world.";
      }
         public static int subtraction(int a, int b, ArrayList<Integer> arrlist) {
        
        if (arrlist == null) return false;
       
         for (Integer num : arrlist) { 		      
             if(num == a)
                  b=b-a;
      }
      
        return b;
      }
      
    }
