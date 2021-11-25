/*
  class Troll -- Represents random incarnations of
  the adventurer's natural enemy in Ye Olde RPG
**/

public class Troll extends Monster {

  /**
     default constructor
     pre:  instance vars are declared
     post: initializes instance vars.
  **/
  public Troll() {
     super();
     _strength = 25 + (int)( Math.random() * 35 ); // [25,60)
  }


}//end class Monster
