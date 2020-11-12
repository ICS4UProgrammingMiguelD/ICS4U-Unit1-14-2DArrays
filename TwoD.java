import java.util.Random;
import java.util.Scanner;
/**.
* Class TArrays.

* @author  Miguel Duarte
* @version 1.0
* @since   2020-11-11
*/
public class TwoD {
  /**
  *.
  */
  public static void main(String[] args) {
    
    Random rand = new Random();
    
    // Declare variables
    int counter = 0;
    int average = 0;
    int sum = 0;
    int row = 0;
    int column = 0;
    
    // Create the 2D Array
    int[][] array = new int[4][6];
    
    // Fill the array with the random numbers
    for (column = 0; column < 4; column++) {
      for (row = 0; row < 6; row++) {
        array[column][row] = rand.nextInt(100);
        
        System.out.print(array[column][row] + " ");
      }
      System.out.println();
    }
    
    // Calculate the average
    average = sum + array[column][row];
    counter++;
    
    System.out.println("The average is:" + sum / average);
  }
}