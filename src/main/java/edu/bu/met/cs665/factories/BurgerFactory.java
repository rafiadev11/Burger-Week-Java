package edu.bu.met.cs665.factories;

import edu.bu.met.cs665.burgers.BurgerBuilder;

/**
 * Factory method that creates objects based on the selected burger.
 *
 * @author Rachid Rafia
 * @version 1.0
 */
public interface BurgerFactory {
  BurgerBuilder create(String beverageName);
}
