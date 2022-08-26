package com.exercise;

/**
 * Classe FuncionarioPessoaFisica.
 */
public class FuncionarioPessoaFisica extends Funcionario {

  @Override
  public double calcularSalarioLiquido() {
    
    return salarioBruto * 0.80;
  }
}
