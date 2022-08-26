package com.exercise;

/**
 * Classe Pessoa Candidata.
 */
public class PessoaCandidata extends Pessoa {

  private int numero;
  private int votos;

  /**
   * Contrutor da classe PessoaCandidata.
   */
  public PessoaCandidata(String nome, int numero) {
    super();
    this.nome = nome;
    this.numero = numero;
    this.votos = 0;
  }

  public int getNumero() {
    return numero;
  }

  public int getVotos() {
    return votos;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }
  
  public void receberVoto() {
    this.votos += 1;
  }
}
