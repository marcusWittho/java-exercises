package com.exercise;

/**
 * Classe FuncionarioPessoaJuridica. 
 */
public class FuncionarioPessoaJuridica extends Funcionario {

  @Override
  public double calcularSalarioLiquido() {

    return salarioBruto * 0.90;
  }
}
