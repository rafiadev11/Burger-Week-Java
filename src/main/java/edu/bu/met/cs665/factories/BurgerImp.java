package edu.bu.met.cs665.factories;

import edu.bu.met.cs665.burgers.BurgerBuilder;
import edu.bu.met.cs665.burgers.LaMancha;
import edu.bu.met.cs665.burgers.SmokeyBear;
import edu.bu.met.cs665.burgers.TheLumberjack;
import edu.bu.met.cs665.burgers.TheSummerKentuckyDarling;

/**
 * This class implements the BurgerFactory and creates objects based on the burger selected.
 *
 * <p>This class implements the singleton pattern to ensure there is only once instance of the
 * class.
 *
 * @author Rachid Rafia
 * @version 1.0
 */
public class BurgerImp implements BurgerFactory {
  private static final BurgerImp burgerImp = new BurgerImp();

  /** Declares the constructor as private. */
  private BurgerImp() {}

  /**
   * get an instance of this class.
   *
   * @return this class instance.
   */
  public static BurgerImp getInstance() {
    return burgerImp;
  }

  /**
   * return a burger class instance based on the selected burger.
   *
   * @param burgerName String.
   * @return the approriate burger class.
   */
  @Override
  public BurgerBuilder create(String burgerName) {
    switch (burgerName) {
      case "La Mancha":
        return new LaMancha();
      case "Smokey Bear":
        return new SmokeyBear();
      case "The Summer Kentucky Darling":
        return new TheSummerKentuckyDarling();
      case "The Lumberjack":
        return new TheLumberjack();
      default:
        return null;
    }
  }
}
