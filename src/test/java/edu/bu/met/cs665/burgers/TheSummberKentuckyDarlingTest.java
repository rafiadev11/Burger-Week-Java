package edu.bu.met.cs665.burgers;

import edu.bu.met.cs665.PrepareBurger;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.Arrays;

import static org.hamcrest.core.StringContains.containsString;

public class TheSummberKentuckyDarlingTest extends TestCase {

  BurgerBuilder burgerBuilder;

  public void setUp() {
    this.burgerBuilder = new TheSummerKentuckyDarling();
    PrepareBurger prepareBurger = new PrepareBurger(this.burgerBuilder);
    prepareBurger.build();
  }

  public void testAddBuns() {
    Assert.assertThat(burgerBuilder.getBurger().getBuns(), containsString("brioche"));
  }

  public void testAddMeat() {
    Assert.assertThat(burgerBuilder.getBurger().getMeat(), containsString("ground beef patty"));
  }

  public void testAddCheese() {
    assertNull(burgerBuilder.getBurger().getCheese());
  }

  public void testAddVeggies() {
    assertTrue(Arrays.asList(burgerBuilder.getBurger().getVeggies()).contains("cilantro pesto"));
  }

  public void testAddSauces() {
    assertNull(burgerBuilder.getBurger().getSauces());
  }

  public void testCost() {
    assertEquals(10.99, burgerBuilder.getBurger().getPrice());
  }
}
