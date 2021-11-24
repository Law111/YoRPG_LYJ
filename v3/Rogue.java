/**
  class Rogue -- protagonist of Ye Olde RPG
  **/

public class Rogue extends Protagonist {
    /**
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      **/
    public Rogue() {
         _strength = 150;
         _defense = 35;
    }


    /**
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      **/
    public Rogue( String name ) {
        this();
        _name = name;
    }

    public static String about(){
      return "Rogue: + damage, - defense";
    }

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return _name; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    //prepare a Protagonist for a special attack
    public void specialize() {
        _attack = .75;
        _defense = 10;
    }

    //revert to normal mode
    public void normalize() {
        _attack = .4;
        _defense = 20;
    }

}//end class Protagonist
