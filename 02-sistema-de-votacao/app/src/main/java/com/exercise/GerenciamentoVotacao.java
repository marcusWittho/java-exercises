package com.exercise;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por gerenciar cadastros e votação.
 */
public class GerenciamentoVotacao {

  List<PessoaCandidata> pessoasCandidatas = new ArrayList<>();
  List<PessoaEleitora> pessoasEleitoras = new ArrayList<>();
  List<String> cpfComputado = new ArrayList<>();
  private int totalVotos;
  private boolean infoExists;
  
  /**
   * Método responsável por cadastrar peossas candodatas.
   */
  public void cadastrarPessoaCandidata(String nome, int numero) {
    infoExists = false;
    
    for (PessoaCandidata candidata : pessoasCandidatas) {
      if (candidata.getNumero() == numero) {
        System.out.println("Número pessoa candidata já utilizado!");
        infoExists = false;
      }
    }
    
    if (!infoExists) {
      PessoaCandidata pessoaCandidata = new PessoaCandidata(nome, numero);
      pessoasCandidatas.add(pessoaCandidata);
    }
  }
  
  /**
   * Método responsável por cadastrar pessoas eleitoras.
   */
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    infoExists = false;
    
    for (PessoaEleitora eleitora : pessoasEleitoras) {
      if (eleitora.getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
        infoExists = true;
      }
    }
    
    if (!infoExists) {
      PessoaEleitora pessoaEleitora = new PessoaEleitora(nome, cpf);
      pessoasEleitoras.add(pessoaEleitora);
    }
  }
  
  /**
   * Método responsável por computar os votos.
   */
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    infoExists = false;
    
    for (String cpf : cpfComputado) {
      if (cpf.equals(cpfPessoaEleitora)) {
        System.out.println("Pessoa eleitora já votou!");
        infoExists = true;
      }
    }
    
    if (!infoExists) {
      for (PessoaCandidata candidata : pessoasCandidatas) {
        if (candidata.getNumero() == numeroPessoaCandidata) {
          candidata.receberVoto();
        }
      }
      
      cpfComputado.add(cpfPessoaEleitora);
      totalVotos += 1;
    }
  }
  
  /**
   * Método responsável por mostrar o resultado da eleição.
   */
  public void mostrarResultado() {
    DecimalFormat df = new DecimalFormat("#0.0#%");
    
    if (totalVotos == 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    } else {
      for (PessoaCandidata candidata : pessoasCandidatas) {
        StringBuilder sb = new StringBuilder();
        
        String result = sb.append("Nome: ")
            .append(candidata.getNome())
            .append(" - ")
            .append(candidata.getVotos())
            .append(" votos ( ")
            .append(df.format((float) candidata.getVotos() / (float) totalVotos))
            .append(" )")
            .toString();
        
        System.out.println(result);
      }
      
      System.out.println("Total de votos: " + totalVotos);
    }
  }
}
