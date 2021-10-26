package edu.bu.met.cs665.factories;

import edu.bu.met.cs665.burgers.LaMancha;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BurgerImpTest {

  @Test
  public void create() {
    assertTrue(BurgerImp.getInstance().create("La Mancha") instanceof LaMancha);
  }
}
