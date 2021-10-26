package edu.bu.met.cs665;

import edu.bu.met.cs665.facades.BurgerFacade;

public class Main {

  /**
   * A simulation of building a burger.
   *
   * @param args not used
   */
  public static void main(String[] args) {
    // select a burger
    System.out.println("Select a burger?");
    System.out.println("--------------------------");
    System.out.println("1. La Mancha");
    System.out.println("2. Smokey Bear");
    System.out.println("3. The Summer Kentucky Darling");
    System.out.println("4. The Lumberjack");
    System.out.println("--------------------------");

    // User selects a burger
    System.out.println("You selected 2 (Smokey Bear)");
    System.out.println();

    // Build the burger
    BurgerFacade burgerFacade = new BurgerFacade();
    burgerFacade.createBurger("Smokey Bear");

    // Display order summary
    System.out.println(burgerFacade.orderSummary());
  }
}
