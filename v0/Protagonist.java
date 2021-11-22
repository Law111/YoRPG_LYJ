public class Protagonist{
  private int health;
  private int str; // modifier for damage rolls
  private int precision; //modifier for attack rolls
  private String heroName;
  private int ac; // Armor Class. Used to determine if attack misses.
  private boolean special;

  public Protagonist(String name){
    heroName = name;
    str = modifier();
    precision = modifier();
    health = 100 + modifier();
    ac = 14 + modifier();
  }

  public String getName(){
    return heroName;
  }

  public boolean getSpecial(){
    return special;
  }

  public int rollDie(int sideNum){
    return (int) (Math.random() * sideNum) + 1;
  }

  public int modifier(){
    return (int) (Math.random() * 6);
  }

  public boolean isAlive(){
    return health > 0;
  }

  public void takeDamage(int d){ //used in Monster
    health -= d;
  }

  public int getAC(){ //used in Monster
    return ac;
  }

  public void specialize(){
    special = true;
  }

  public void normalize(){
    special = false;
  }

  public int attack(Monster m){
    int damage = 0;
    // regular attack
    if (!special){
      // attack roll. 1d20 + precision. Greater than opponent AC = hit.
      if (rollDie(20) + precision > m.getAC()){
        damage = rollDie(8) + str; //dmg roll. 1d8 + str
      }
    // special attack
    } else{
      // attack roll. 1d20 + precision. Greater than opponent AC = hit.
      if (rollDie(20) + precision > m.getAC()){
        damage = (rollDie(8) + rollDie(8) + str) ; //dmg roll. 2d8 + str
      }
    }
    m.takeDamage(damage); // monster takes damage after hit
    return damage; // used to show amount of damage dealt
  }

}
