import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(25) +1;
        int userNumber = 0; 
        int moves = 5;
        System.out.println("find my number, it goes from 1-25 mehehehehehe");
          while(userNumber != secretNumber && moves != 0) {
            System.out.println("put your number");
            userNumber = scanner.nextInt();
            moves = moves -1;
            System.out.println("you have " + moves + " moves left");
                      if (userNumber < secretNumber) {
          System.out.println("the number you inputted is BIGGER than the number im thinking of MUAHAHAHA");
        } else if (userNumber > secretNumber ) {
          System.out.println("the number you inputted is less than the number im thinking of... 67676767");
        }
          if(userNumber == secretNumber) {
            System.out.println("WOW YOU ARE CORRECT NOW YOU HAVE BIG BRAIN");
        }
        else {
            System.out.println("NICE TRY, TRY AGAIN");
        }  
      }
      if(moves == 0) {
         System.out.println("THE SECRET NUMBER WAS " + secretNumber + ". i cant believe you didnt guess that");
      }
    }
  }