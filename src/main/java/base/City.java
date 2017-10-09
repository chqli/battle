package base;

import java.util.EnumMap;

public class City {
  private EnumMap<Direction, Wall> walls;

  public City() {
    this.walls = new EnumMap<>(Direction.class);
    walls.put(Direction.E, new Wall(Direction.E, 0));
    walls.put(Direction.N, new Wall(Direction.N, 0));
    walls.put(Direction.W, new Wall(Direction.W, 0));
    walls.put(Direction.S, new Wall(Direction.S, 0));
  }

  public boolean attemptAttack(Direction dir, int strength) {
    Wall wall = walls.get(dir);
    return wall.attemptAttack(strength);
  }
}
