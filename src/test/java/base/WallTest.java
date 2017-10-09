package base;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WallTest {

  @Test
  public void attackWithLowerStrength() {
    Wall wall = new Wall(Direction.E, 5);
    assertThat(wall.attemptAttack(4), is(false));
  }

  @Test
  public void attackWithHigherStrength() {
    Wall wall = new Wall(Direction.E, 5);
    assertThat(wall.attemptAttack(5), is(true));
  }

  @Test
  public void raiseWall() {
    Wall wall = new Wall(Direction.E, 5);
    assertThat(wall.attemptAttack(5), is(true));
    wall.raise(6);
    assertThat(wall.attemptAttack((5)), is(false));
  }
}
