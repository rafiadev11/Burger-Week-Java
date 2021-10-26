package edu.bu.met.cs665;

import java.util.Arrays;

/**
 * This class describes the setters and getters for the burgers.
 *
 * @author Rachid Rafia
 * @version 1.0
 */
public class Burger {
  private String buns;
  private String meat;
  private String cheese;
  private String[] veggies;
  private String[] sauces;
  private double price;

  /**
   * set the burger bun.
   *
   * @param buns String
   */
  public void setBuns(String buns) {
    this.buns = buns;
  }

  /**
   * set the burger meat.
   *
   * @param meat String
   */
  public void setMeat(String meat) {
    this.meat = meat;
  }

  /**
   * set the burger cheese.
   *
   * @param cheese String
   */
  public void setCheese(String cheese) {
    this.cheese = cheese;
  }

  /**
   * set the burger veggies.
   *
   * @param veggies Array
   */
  public void setVeggies(String[] veggies) {
    this.veggies = veggies;
  }

  /**
   * set the burger sauces.
   *
   * @param sauces Array
   */
  public void setSauces(String[] sauces) {
    this.sauces = sauces;
  }

  /**
   * set the burger price.
   *
   * @param price double
   */
  public void setPrice(double price) {
    this.price = price;
  }

  /**
   * get burger buns.
   *
   * @return buns String
   */
  public String getBuns() {
    return buns;
  }

  /**
   * get burger cheese.
   *
   * @return cheese String
   */
  public String getCheese() {
    return cheese;
  }

  /**
   * get burger meat.
   *
   * @return meat String
   */
  public String getMeat() {
    return meat;
  }

  /**
   * get burger sauces.
   *
   * @return sauces Array
   */
  public String[] getSauces() {
    return sauces;
  }

  /**
   * get burger veggies.
   *
   * @return veggies Array
   */
  public String[] getVeggies() {
    return veggies;
  }

  /**
   * get burger price.
   *
   * @return price double
   */
  public double getPrice() {
    return price;
  }

  /**
   * get order summary.
   *
   * @return order summary String
   */
  public String orderSummary() {
    return "Order Summary:\n"
        + " Buns: "
        + this.getBuns()
        + "\n"
        + " Meat: "
        + this.getMeat()
        + "\n"
        + " Cheese: "
        + this.getCheese()
        + "\n"
        + " Veggies: "
        + Arrays.toString(this.getVeggies())
        + "\n"
        + " Sauces: "
        + Arrays.toString(this.getSauces())
        + "\n"
        + "------------------"
        + "\n"
        + "Cost: $"
        + this.getPrice()
        + "\n"
        + "------------------";
  }
}
