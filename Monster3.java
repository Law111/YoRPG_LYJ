/*
  class Monster -- Represents random incarnations of
  the adventurer's natural enemy in Ye Olde RPG
**/

public class Monster3 extends Monster {

  /**
     default constructor
     pre:  instance vars are declared
     post: initializes instance vars.
  **/
  public Monster3() {
     _strength = 15 + (int)( Math.random() * 45 ); // [15,60)
     _defense = 30;
  }


}//end class Monster
