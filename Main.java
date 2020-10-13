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

    int[] num = new int[10];

    for(int i = 0; i < num.length; i++){
      num[i] = input.nextInt();
    }

    int highestNum = num[0];

    for(int i = 0; i < num.length; i++){
      if(num[i] > highestNum){
        highestNum = num[i];
      }
    }
    System.out.println("The largest number is " + highestNum);
  }
}
