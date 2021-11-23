/*
  class Monster -- Represents random incarnations of
  the adventurer's natural enemy in Ye Olde RPG
**/

public class Monster2 extends Monster {

  /**
     default constructor
     pre:  instance vars are declared
     post: initializes instance vars.
  **/
  public Monster2() {
     _hitPts = 90;
     _strength = 25 + (int)( Math.random() * 45 ); // [25,70)
  }


}//end class Monster
