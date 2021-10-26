package edu.bu.met.cs665.burgers;

import edu.bu.met.cs665.PrepareBurger;
import junit.framework.TestCase;
import org.junit.Assert;

import static org.hamcrest.core.StringContains.containsString;

public class TheLumberjackTest extends TestCase {

  BurgerBuilder burgerBuilder;

  public void setUp() {
    this.burgerBuilder = new TheLumberjack();
    PrepareBurger prepareBurger = new PrepareBurger(this.burgerBuilder);
    prepareBurger.build();
  }

  public void testAddBuns() {
    Assert.assertThat(burgerBuilder.getBurger().getBuns(), containsString("Regular"));
  }

  public void testAddMeat() {
    Assert.assertThat(
        burgerBuilder.getBurger().getMeat(), containsString("Five-ounce house ground beef"));
  }

  public void testAddCheese() {
    Assert.assertThat(burgerBuilder.getBurger().getCheese(), containsString("House beer cheese"));
  }

  public void testAddVeggies() {
    assertNull(burgerBuilder.getBurger().getVeggies());
  }

  public void testAddSauces() {
    assertNull(burgerBuilder.getBurger().getSauces());
  }

  public void testCost() {
    assertEquals(6.99, burgerBuilder.getBurger().getPrice());
  }
}
