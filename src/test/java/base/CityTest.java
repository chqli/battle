package base;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CityTest {

  @Test
  public void attemptAttackLowerAndThenHigher() {
    City city = new City();
    assertThat(city.attemptAttack(Direction.E, 8), is(true));
    assertThat(city.attemptAttack(Direction.E, 8), is(false));
  }
}