package cardgamegroup6;
/**
 * @author Rich Smith at ZenOfProgramming.com
 */
public class Player implements Comparable<Player>
{
   /**
    * @param id
    */


   private int playerID;
   private String Name;
   private int points;
   private String result;

   public Player (int id)
   {
      this.playerID = id;
   }

   public int getPlayerID ()
   {
      return playerID;
   }

   public void setPlayerID (int playerID)
   {
      this.playerID = playerID;
   }

   public String getPlayerName ()
   {
      return Name;
   }

   public void setPlayerName (String Name)
   {
      this.Name = Name;
   }

   public int getPoints ()
   {
      return points;
   }

   public void setPoints (int points)
   {
      this.points = points;
   }

   public String getResult ()
   {
      return result;
   }

   public void setResult (String result)
   {
      this.result = result;
   }

   @Override
   public int hashCode ()
   {
      final int prime = 31;
      int result = 1;
      result = prime * result + playerID;
      return result;
   }

   @Override
   public boolean equals (Object obj)
   {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      Player other = (Player) obj;
      if (playerID != other.playerID) {
         return false;
      }
      return true;
   }

   @Override
   public int compareTo (Player o)
   {
      if (this.getPoints() == o.getPoints()) {
         return 0;
      }
      else if (this.getPoints() > o.getPoints()) {
         return 1;
      }
      else {
         return -1;
      }
   }
}
