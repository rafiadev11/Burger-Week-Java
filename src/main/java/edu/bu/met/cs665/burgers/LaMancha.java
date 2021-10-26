package edu.bu.met.cs665.burgers;

/**
 * This class builds La Mancha burger.
 *
 * @author Rachid Rafia
 * @version 1.0
 */
public class LaMancha extends BurgerBuilder {

  /** Set burger buns. */
  @Override
  public void addBuns() {
    burger.setBuns("local brioche bun");
  }

  /** Set burger meat. */
  @Override
  public void addMeat() {
    burger.setMeat("Kentucky beef patty");
  }

  /** Set burger cheese. */
  @Override
  public void addCheese() {
    burger.setCheese("aged Manchego cheese");
  }

  /** Set burger veggies. */
  @Override
  public void addVeggies() {
    burger.setVeggies(new String[] {"lettuce"});
  }

  /** Set burger sauces. */
  @Override
  public void addSauces() {
    burger.setSauces(new String[] {"house-made Romesco sauce"});
  }

  /** Set burger price. */
  @Override
  public void cost() {
    burger.setPrice(7.99);
  }
}
