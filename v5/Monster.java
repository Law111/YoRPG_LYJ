/*
  class Monster -- Represents random incarnations of
  the adventurer's natural enemy in Ye Olde RPG
**/

public class Monster extends Character {

  /**
     default constructor
     pre:  instance vars are declared
     post: initializes instance vars.
  **/
  public Monster() {
     _hitPts = 110;
     _strength = 20 + (int)( Math.random() * 35 ); // [20,55)
     _defense = 20;
     _attack = 0.80;
  }


}//end class Monster
