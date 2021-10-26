package edu.bu.met.cs665;

import edu.bu.met.cs665.burgers.BurgerBuilder;

/**
 * This class acts as the director. It sets the bugerbuilder class and builds the burger.
 *
 * @author Rachid Rafia
 * @version 1.0
 */
public class PrepareBurger {
  private final BurgerBuilder burgerBuilder;

  /**
   * instantiate the burger builder class.
   *
   * @param burgerBuilder Object
   */
  public PrepareBurger(BurgerBuilder burgerBuilder) {
    this.burgerBuilder = burgerBuilder;
  }

  /** build the burger. */
  public void build() {
    this.burgerBuilder.addBuns();
    this.burgerBuilder.addMeat();
    this.burgerBuilder.addVeggies();
    this.burgerBuilder.addCheese();
    this.burgerBuilder.addSauces();
    this.burgerBuilder.cost();
  }
}
