/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package myDemoApp;
import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
     public static boolean subtraction(ArrayList<Integer> arrlist, int a, int b ) {
        
        if (arrlist == null) return false;
       
         for (Integer num : arrlist) { 		      
             if(num == a)
                  b=b-a;
      }
        if(b==0)
        return true;
        else 
        return false;
    }

}
