package cardgamegroup6;
/**
 * @author Rich Smith at ZenOfProgramming.com
 */
import java.util.Scanner;

public class Play1
{
   public Play1 ()
   {

   }

   /**
    * @param args
    */
   public static void main (String[] args)
   {
      CardGameGroup6 sl = new CardGameGroup6();

      System.out.println("Card Game \n Player Options");
      System.out.println("1. Start Game \n  \n2. Exit Game");
      System.out.print("Please provide your option : ");

      int play = 1;

      while (play != 0) {
         Scanner in = new Scanner(System.in);
         play = in.nextInt();

         switch (play) {
            case 1:
               System.out.println("Provide the Number of Players( should be greater than 1 and less than 4) : ");
               in = new Scanner(System.in);
               play = in.nextInt();
               sl.playGame(play);

               sl.displayWinners();
               break;

            case 2:
               System.exit(0);
         }

         System.out.println();
         System.out.println("Card Game \n Select User Options");
         System.out.println("1. Start Game \n2. Exit Game");
         System.out.print("Please provide your option : ");
      }
   }
}
