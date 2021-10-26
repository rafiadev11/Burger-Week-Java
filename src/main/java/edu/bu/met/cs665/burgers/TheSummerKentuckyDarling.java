package edu.bu.met.cs665.burgers;

/**
 * This class builds The Summer Kentucky Darling burger.
 *
 * @author Rachid Rafia
 * @version 1.0
 */
public class TheSummerKentuckyDarling extends BurgerBuilder {

  /** Set burger buns. */
  @Override
  public void addBuns() {
    burger.setBuns("brioche bun");
  }

  /** Set burger meat. */
  @Override
  public void addMeat() {
    burger.setMeat("ground beef patty");
  }

  /** Set burger cheese. */
  @Override
  public void addCheese() {
    burger.setCheese(null);
  }

  /** Set burger veggies. */
  @Override
  public void addVeggies() {
    burger.setVeggies(new String[] {"cilantro pesto", "heirloom cherry tomato"});
  }

  /** Set burger sauces. */
  @Override
  public void addSauces() {
    burger.setSauces(null);
  }

  /** Set burger price. */
  @Override
  public void cost() {
    burger.setPrice(10.99);
  }
}
