package com.exercise;

/**
 * Classe Circle.
 */
public class Circle implements Farm {

  private static double PI;
  private double radius;
  
  /**
   * Método construtor da classe Circle.
   */
  public Circle(double radius) {
    super();
    PI = 3.14;
    this.radius = radius;
  }

  @Override
  public double area() {
    return PI * Math.pow(this.radius, 2);
  }
}
