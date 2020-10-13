import java.util.Scanner;
/**
 * This program lets the user figure out which integer is the biggest amongst the numbers that user has put in
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates a scanner for user input
    Scanner input = new Scanner(System.in);

    // Asks the user to input 10 integers
    System.out.println("Please enter in 10 integers to put into the array");

    // sets up arrays
    int[] num = new int[10];

    // gets 10 numbers from the user
    for(int i = 0; i < num.length; i++){
      num[i] = input.nextInt();
    }

    // declares a variable
    int highestNum = 0;

    // sets the value of highestNum to highest number in stored variable
    for(int i = 0; i < num.length; i++){
      if(num[i] > highestNum){
        highestNum = num[i];
      }
    }
    // tells the user the highest number
    System.out.println("The largest number is " + highestNum);
  }
}
