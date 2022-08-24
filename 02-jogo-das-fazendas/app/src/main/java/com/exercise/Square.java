package com.exercise;

/**
 * Classe Square.
 */
public class Square implements Farm {

  private double side;

  /**
   * Método construtor da classe Square.
   */
  public Square(double side) {
    super();
    this.side = side;
  }

  @Override
  public double area() {
    return Math.pow(side, 2);
  }
}
