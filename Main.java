import java.util.Scanner;
/**
 * Asks the user for a positive integer than calculates sum from 1 to that number.
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for a postive integer
    System.out.println("Please enter a postive integer:");

    // declare and initialize the variable
    int posInt = input.nextInt();

    // create a variable to keep track of the number
    int count = 1;
    
    // the accumulator to add the count into
    int sum = 0;

    // using a loop to count up to the users integer
    while( count <= posInt ){
      // add the numbers as we go into sum
      sum = sum + count;
      // increase the value of count by 1
      count = count + 1; 
    }
    System.out.println("The sum from 1 - " + posInt + " is " + sum);




    
  }
}
