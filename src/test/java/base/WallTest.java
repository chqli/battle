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
    assertThat(wall.attemptAttack(6), is(true));
  }

  @Test
  public void shouldRaiseWallAfterAttackIfItSucceeded() {
    Wall wall = new Wall(Direction.E, 5);
    assertThat(wall.attemptAttack(6), is(true));
    assertThat(wall.attemptAttack((6)), is(false));
    assertThat(wall.attemptAttack((7)), is(true));
  }
}
