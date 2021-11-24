/*
  class Ninja -- Represents random incarnations of
  the adventurer's natural enemy in Ye Olde RPG
**/

public class Ninja extends Monster {

  /**
     default constructor
     pre:  instance vars are declared
     post: initializes instance vars.
  **/
  public Ninja() {
     _strength = 15 + (int)( Math.random() * 35 ); // [15,50)
     _defense = 30;
  }


}//end class Monster
