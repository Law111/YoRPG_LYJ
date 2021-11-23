/**
  class Protagonist -- protagonist of Ye Olde RPG
  **/

public class Protagonist extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    private String _name = "J. Doe";
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /**
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      **/
    public Protagonist() {
         _hitPts = 160;
         _strength = 50;
         _defense = 70;
         _attack = .4;
    }


    /**
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      **/
    public Protagonist( String name ) {
        this();
        _name = name;
    }

    public static String about(){
      return "Knight";
    }

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return _name; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    //prepare a Protagonist for a special attack
    public void specialize() {
        _attack = .75;
        _defense = 20;
    }

    //revert to normal mode
    public void normalize() {
        _attack = .4;
        _defense = 40;
    }

}//end class Protagonist
