package edu.bu.met.cs665.burgers;

/**
 * This class builds the Smokey Bear burger.
 *
 * @author Rachid Rafia
 * @version 1.0
 */
public class SmokeyBear extends BurgerBuilder {

  /** Set burger buns. */
  @Override
  public void addBuns() {
    burger.setBuns("Regular Burger Buns");
  }

  /** Set burger meat. */
  @Override
  public void addMeat() {
    burger.setMeat("House-smoked beef");
  }

  /** Set burger cheese. */
  @Override
  public void addCheese() {
    burger.setCheese("muenster cheese");
  }

  /** Set burger veggies. */
  @Override
  public void addVeggies() {
    burger.setVeggies(new String[] {"two beer-battered onion rings"});
  }

  /** Set burger sauces. */
  @Override
  public void addSauces() {
    burger.setSauces(new String[] {"steak sauce", "horseradish cream"});
  }

  /** Set burger price. */
  @Override
  public void cost() {
    burger.setPrice(8.99);
  }
}
