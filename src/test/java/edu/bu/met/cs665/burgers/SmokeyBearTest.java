package edu.bu.met.cs665.burgers;

import edu.bu.met.cs665.PrepareBurger;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.Arrays;

import static org.hamcrest.core.StringContains.containsString;

public class SmokeyBearTest extends TestCase {

  BurgerBuilder burgerBuilder;

  public void setUp() {
    this.burgerBuilder = new SmokeyBear();
    PrepareBurger prepareBurger = new PrepareBurger(this.burgerBuilder);
    prepareBurger.build();
  }

  public void testAddBuns() {
    Assert.assertThat(burgerBuilder.getBurger().getBuns(), containsString("Regular"));
  }

  public void testAddMeat() {
    Assert.assertThat(burgerBuilder.getBurger().getMeat(), containsString("House-smoked beef"));
  }

  public void testAddCheese() {
    Assert.assertThat(burgerBuilder.getBurger().getCheese(), containsString("muenster"));
  }

  public void testAddVeggies() {
    assertTrue(Arrays.asList(burgerBuilder.getBurger().getVeggies()).contains("two beer-battered onion rings"));
  }

  public void testAddSauces() {
    assertTrue(
        Arrays.asList(burgerBuilder.getBurger().getSauces()).contains("steak sauce"));
  }

  public void testCost() {
    assertEquals(8.99, burgerBuilder.getBurger().getPrice());
  }
}
