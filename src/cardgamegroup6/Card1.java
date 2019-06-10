package cardgamegroup6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Rich Smith at ZenOfProgramming.com
 */
public class Card1 implements Comparable<Card1>
{
   private static final int DECK_SIZE = 52;

   private Card1 ()
   {
   }

   public enum CARDNUMBER
   {
      TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);

      private final int order;

      private CARDNUMBER (int order)
      {
         this.order = order;
      }

      /**
       * Returns the ordinal position of the enum
       *
       * @return int ord
       */
      public int getOrder ()
      {
         return order;
      }
   }

   public enum CARDTYPE
   {
      CLUB, DIAMOND, HEARTS, SPADE
   }

   private CARDNUMBER cdNumber;
   private CARDTYPE cdType;

   public CARDNUMBER getCdNumber ()
   {
      return cdNumber;
   }

   public CARDTYPE getCdType ()
   {
      return cdType;
   }

   public static List<Card1> getPackOfCards ()
   {
      List<Card1> cardList = new ArrayList<Card1>();

      for (CARDTYPE types : CARDTYPE.values()) {
         for (CARDNUMBER cNums : CARDNUMBER.values()) {
            Card1 cd = new Card1();
            cd.cdNumber = cNums;
            cd.cdType = types;
            cardList.add(cd);
         }
      }
      return cardList;
   }

   public static void shuffleCards (List<Card1> cards)
   {
      ArrayList<Integer> deck = new ArrayList<Integer>();

      for (int i = 0; i < DECK_SIZE; ++i) {
         deck.add(i);
      }

      Collections.shuffle(deck);
   }

   @Override
   public int compareTo (Card1 j)
   {
      if (this.getCdNumber() == j.getCdNumber()) {
         return 0;
      }
      else if (this.getCdNumber().getOrder() > j.getCdNumber().getOrder()) {
         return 1;
      }
      else {
         return -1;
      }
   }

   @Override
   public String toString ()
   {
      return "CARD [cdNumber=" + cdNumber + ", cdType=" + cdType + "]";
   }
}
