/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package myDemoApp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import java.util.Arrays;


class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test
   public void testFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 3, 4));
      assertTrue(App.subtraction(array, 3 , 9));
    }

    @Test
    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(App.subtraction(array, 5, 10));
    }

    @Test
    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      assertFalse(App.subtraction(array, 1,20));
    }

    @Test
    public void testNull() {
      assertFalse(App.subtraction(null, 1,0));
    }

}
