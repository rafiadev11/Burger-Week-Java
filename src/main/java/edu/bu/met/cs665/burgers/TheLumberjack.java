package edu.bu.met.cs665.burgers;

/**
 * This class builds The Lumberjack burger.
 *
 * @author Rachid Rafia
 * @version 1.0
 */
public class TheLumberjack extends BurgerBuilder {

  /** Set burger buns. */
  @Override
  public void addBuns() {
    burger.setBuns("Regular Burger Buns");
  }

  /** Set burger meat. */
  @Override
  public void addMeat() {
    burger.setMeat("Five-ounce house ground beef");
  }

  /** Set burger cheese. */
  @Override
  public void addCheese() {
    burger.setCheese("House beer cheese");
  }

  /** Set burger veggies. */
  @Override
  public void addVeggies() {
    burger.setVeggies(null);
  }

  /** Set burger sauces. */
  @Override
  public void addSauces() {
    burger.setSauces(null);
  }

  /** Set burger price. */
  @Override
  public void cost() {
    burger.setPrice(6.99);
  }
}
