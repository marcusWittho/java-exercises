package com.exercise;

/**
 * Classe Rectangle.
 */
public class Rectangle extends Polygon {
  
  private double base;
  private double height;

  /**
   * Método construtor da classe Rectangle.
   */
  public Rectangle(double base, double height) {
    super(base, height);
    this.base = base;
    this.height = height;
  }

  @Override
  public double area() {
    return this.base * this.height;
  }
}
