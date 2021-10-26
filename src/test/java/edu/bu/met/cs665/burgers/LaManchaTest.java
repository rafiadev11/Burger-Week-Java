package edu.bu.met.cs665.burgers;

import edu.bu.met.cs665.PrepareBurger;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.Arrays;

import static org.hamcrest.core.StringContains.containsString;

public class LaManchaTest extends TestCase {

  BurgerBuilder burgerBuilder;

  public void setUp() {
    this.burgerBuilder = new LaMancha();
    PrepareBurger prepareBurger = new PrepareBurger(this.burgerBuilder);
    prepareBurger.build();
  }

  public void testAddBuns() {
    Assert.assertThat(burgerBuilder.getBurger().getBuns(), containsString("brioche"));
  }

  public void testAddMeat() {
    Assert.assertThat(burgerBuilder.getBurger().getMeat(), containsString("Kentucky beef patty"));
  }

  public void testAddCheese() {
    Assert.assertThat(burgerBuilder.getBurger().getCheese(), containsString("aged Manchego"));
  }

  public void testAddVeggies() {
    assertTrue(Arrays.asList(burgerBuilder.getBurger().getVeggies()).contains("lettuce"));
  }

  public void testAddSauces() {
    assertTrue(
        Arrays.asList(burgerBuilder.getBurger().getSauces()).contains("house-made Romesco sauce"));
  }

  public void testCost() {
    assertEquals(7.99, burgerBuilder.getBurger().getPrice());
  }
}
