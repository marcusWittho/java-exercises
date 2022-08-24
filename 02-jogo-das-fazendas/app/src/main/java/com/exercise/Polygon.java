package com.exercise;

/**
 * Classe abstrata Polygon.
 */
public abstract class Polygon implements Farm {

  private double base;
  private double height;
  
  /**
   * Método construtor da classe Polygon.
   */
  public Polygon(double base, double height) {
    super();
    this.base = base;
    this.height = height;
  }

  @Override
  public abstract double area();

  public double getBase() {
    return base;
  }
  
  public double getHeight() {
    return height;
  }
  
  public void setBase(double base) {
    this.base = base;
  }
  
  public void setHeight(double height) {
    this.height = height;
  }
}
