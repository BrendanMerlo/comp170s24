import java.io.FileNotFoundException;
import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class A06 {
    public static void main(String[] args) {
        Random rand = new Random();
        // Get a random number between 0 and 99
        int randomNumber = rand.nextInt(100);
        // Connect a scanner to the keyboard
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter an integer number guess or enter -1 to terminate): ");
            int userGuess = sc.nextInt();
            
            if (userGuess ==-1) {
                System.out.println("Terminating execution");
                break;
            }
            
            if (userGuess == randomNumber) {
                System.out.println("Correct number is guessed: ") + randomNumber);
                break;
            } else if (userGuess > randomNumber) {
                System.out.println("The random number is lower.");
            } else {
                System.out.println("The random number is higher.");
            }
        }
         
        // Close the scanner
        sc.close(); 
    } // method main
}
