package edu.bu.met.cs665.facades;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.StringContains.containsString;

public class BurgerFacadeTest {

  @Test
  public void orderSummary() {
    BurgerFacade burgerFacade = new BurgerFacade();
    burgerFacade.createBurger("Smokey Bear");
    Assert.assertThat(burgerFacade.orderSummary(), containsString("House-smoked beef"));
  }
}