package com.exercise;

/**
 * Classe abstrata Funcionario.
 */
public abstract class Funcionario {

  private String nome;
  private String cpf;
  protected double salarioBruto;
  
  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public double getSalarioBruto() {
    return salarioBruto;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setSalarioBruto(double salarioBruto) {
    this.salarioBruto = salarioBruto;
  }
  
  public abstract double calcularSalarioLiquido();
}
