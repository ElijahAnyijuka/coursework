package kids1;


/**
 * ANIJUKA ELIJAH
 * 2021/A/KIT/O712/F
 */
import java.util.Scanner; 
import java.util.*;
import java.util.Random;
class kidsgame {

    private static final Random r = new Random();
    private static final int NUMBER = r.nextInt(10) + 1;
    private static int guess = 0;

    public static void main(String[] args) {  
        Scanner player = new Scanner(System.in);
           ; 
            while ( guess != NUMBER ) {
            
            System.out.println("Guess a number between 1 and 10");
            guess = player.nextInt();
            if ( guess > NUMBER ) {
                System.out.println("Too high");
            } else if ( guess < NUMBER ) {
                System.out.println("Too low");
            } else {
                System.out.println("That's right!");
                System.exit(0);
            }
        }
  }
}