package com.exercise;

/**
 * Classe Pessoa Eleitora.
 */
public class PessoaEleitora extends Pessoa {

  private String cpf;

  /**
   * Construtor da classe Pessoa Eleitora.
   */
  public PessoaEleitora(String nome, String cpf) {
    super();
    this.nome = nome;
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
