/*
  class Monster -- Represents random incarnations of
  the adventurer's natural enemy in Ye Olde RPG
**/

public class Monster3 extends Character {

  /**
     default constructor
     pre:  instance vars are declared
     post: initializes instance vars.
  **/
  public Monster3() {
     _hitPts = 120;
     _strength = 10 + (int)( Math.random() * 45 ); // [10,55)
     _defense = 30;
     _attack = 1;
  }


}//end class Monster
