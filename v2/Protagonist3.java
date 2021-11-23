/**
  class Protagonist -- protagonist of Ye Olde RPG
  **/

public class Protagonist3 extends Protagonist {

    /**
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      **/
    public Protagonist3() {
         _strength = 55;
         _defense = 70;
    }


    /**
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      **/
    public Protagonist3( String name ) {
        this();
        _name = name;
    }

    public static String about(){
      return "Knight: - damage, + defense";
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
