package edu.bu.met.cs665.burgers;

import edu.bu.met.cs665.Burger;

/**
 * This class is the builder that is responsible for setting the required methods that every burger
 * must implement.
 *
 * @author Rachid Rafia
 * @version 1.0
 */
public abstract class BurgerBuilder {
  Burger burger = new Burger();

  /** Set burger buns. */
  public abstract void addBuns();

  /** Set burger meat. */
  public abstract void addMeat();

  /** Set burger cheese. */
  public abstract void addCheese();

  /** Set burger veggies. */
  public abstract void addVeggies();

  /** Set burger sauces. */
  public abstract void addSauces();

  /** Set burger price. */
  public abstract void cost();

  /**
   * get an instance of the Burger class.
   *
   * @return burger Object
   */
  public Burger getBurger() {
    return burger;
  }
}
