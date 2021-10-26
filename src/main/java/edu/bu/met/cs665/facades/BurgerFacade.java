package edu.bu.met.cs665.facades;

import edu.bu.met.cs665.PrepareBurger;
import edu.bu.met.cs665.burgers.BurgerBuilder;
import edu.bu.met.cs665.factories.BurgerImp;

/**
 * This class is a facade that is responsible for interacting with the burger builder classes.
 *
 * @author Rachid Rafia
 * @version 1.0
 */
public class BurgerFacade {

  BurgerBuilder burgerBuilder;

  /**
   * create the burger builder class based on user selection.
   *
   * @param burger String
   */
  public void createBurger(String burger) {
    this.burgerBuilder = BurgerImp.getInstance().create(burger);
    PrepareBurger prepareBurger = new PrepareBurger(this.burgerBuilder);
    prepareBurger.build();
  }

  /**
   * display all burger condiments and cost.
   *
   * @return order summary
   */
  public String orderSummary() {
    return this.burgerBuilder.getBurger().orderSummary();
  }
}
