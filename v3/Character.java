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

  public void lowerHP(int dmg){
    _hitPts -= dmg;
  }

  public int attack(Character opponent){
    int dmg = (int) (_strength * _attack) - opponent.getDefense();
    if ( dmg < 0 )
        dmg = 0;

    opponent.lowerHP( dmg );

    return dmg;
  }
}
