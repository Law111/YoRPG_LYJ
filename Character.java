public class Character {
    int _hitPts;
    int _strength;
    int _defense;
    double _attack;

  public boolean isAlive() {
    return _hitPts > 0;
  }

  public int getDefense() {
    return _defense;
  }

  public void addHP(int hp) {
    _hitPts += hp;
  }

  public void lowerHP(int dmg){
    _hitPts -= dmg;
  }

  public int attack(Character opponent){
    int mod = (int) (Math.random() * 21);
    int dmg = (int) (_strength * _attack + mod) - opponent.getDefense();
    if ( dmg < 0 )
        dmg = 0;

    opponent.lowerHP( dmg );

    return dmg;
  }
}
