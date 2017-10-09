package base;

public class Wall {
  private Direction direction;
  private int strength;

  public Wall(Direction direction, int strength) {
    this.direction = direction;
    this.strength = strength;
  }

  public boolean attemptAttack(int attackStrength) {
    return attackStrength >= strength;
  }

  public void raise(int s) {
    if (s > strength) {
      strength = s;
    }
  }
}
