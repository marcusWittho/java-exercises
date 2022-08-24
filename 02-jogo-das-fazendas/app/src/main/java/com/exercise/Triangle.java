package com.exercise;

/**
 * Classe Triangle.
 */
public class Triangle extends Polygon {

  private double base;
  private double height;
  
  /**
   * Método construtor da classe Triangle.
   */
  public Triangle(double base, double height) {
    super(base, height);
    this.base = base;
    this.height = height;
  }

  @Override
  public double area() {
    return (this.base * this.height) / 2;
  }
}
