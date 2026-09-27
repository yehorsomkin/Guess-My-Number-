import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(25) +1;
        int userNumber = 0; 
        int moves = 5;
        int easy = 0;
        int hearts = 5;
        System.out.println("before you start, you need to pick a difficulty, 1=easy 2=medium and 3=hard");
        easy = scanner.nextInt(); 
        if(easy == 1) {
          System.out.println("you have chosen EASY difficulty. u dont want heat from hard dont u? only 1-10");
          secretNumber = random.nextInt(10) +1; 
        } else if(easy == 2) {
          System.out.println("you have chosen MEDIUM difficulty. alr i see u bro, js dont cry when u lose. 1-25");
        } else if(easy == 3) {
          System.out.println("you have chosen HARD difficulty. OH WE BACK IN BUSINESS... 1-50");
          secretNumber = random.nextInt(50) +1;
        }
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