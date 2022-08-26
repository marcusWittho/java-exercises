package com.exercise;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GerenciamentoVotacaoTest {

  // Onde encontrei como testar o sysout
  // https://www-baeldung-com.translate.goog/java-testing-system-out-println?_x_tr_sl=auto&_x_tr_tl=pt&_x_tr_hl=pt-BR
  private final PrintStream standardOut = System.out;
  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
  
  @BeforeEach
  public void setUp() {
    System.setOut(new PrintStream(outputStreamCaptor));
  }
  
  @AfterEach
  public void tearDown() {
    System.setOut(standardOut);
  }

  @Test
  @DisplayName("1 - Verifica se ocorre o cadastro de novos candidatos.")
  void testCadastrarPessoaCandidata() {
    GerenciamentoVotacao gerenciamento = new GerenciamentoVotacao();
    gerenciamento.cadastrarPessoaCandidata("Candidato_1", 1);
    
    assertTrue(gerenciamento.pessoasCandidatas
          .get(0).getNome().compareTo("Candidato_1") == 0);
  }
  
  @Test
  @DisplayName("2 - Verifica se o número do candidato já está sendo utilizado.")
  void testNumeroRepetidoDeCandidato() {
    GerenciamentoVotacao gerenciamento = new GerenciamentoVotacao();
    gerenciamento.cadastrarPessoaCandidata("Candidato_1", 1);
    gerenciamento.cadastrarPessoaCandidata("Candidato_2", 1);
    
    String outputText = "Número pessoa candidata já utilizado!";

    assertEquals(outputText, outputStreamCaptor.toString().trim());
  }
  
  @Test
  @DisplayName("3 - Verifica se ocorre o cadastro de novos eleitores.")
  void testCadastrarPessoaEleitora() {
    GerenciamentoVotacao gerenciamento = new GerenciamentoVotacao();
    gerenciamento.cadastrarPessoaEleitora("Eleitor_1", "111");
    
    assertTrue(gerenciamento.pessoasEleitoras
        .get(0).getCpf().compareTo("111") == 0);
  }
  
  @Test
  @DisplayName("4 - Verifica se o cpf informado já foi cadastrado.")
  void testCpfRepetido() {
    GerenciamentoVotacao gerenciamento = new GerenciamentoVotacao();
    gerenciamento.cadastrarPessoaEleitora("Eleitor_1", "111");
    gerenciamento.cadastrarPessoaEleitora("Eleitor_2", "111");
    
    String text = "Pessoa eleitora já cadastrada!";
    
    assertEquals(text, outputStreamCaptor.toString().trim());
  }
  
  @Test
  @DisplayName("5 - Verifica se a pessoa eleitora já votou.")
  void testVotoComputado() {
    GerenciamentoVotacao gerenciamento = new GerenciamentoVotacao();
    gerenciamento.cadastrarPessoaCandidata("Candidato_1", 1);
    gerenciamento.cadastrarPessoaEleitora("Eleitor_1", "111");
    gerenciamento.votar("111", 1);
    gerenciamento.votar("111", 1);
    
    String text = "Pessoa eleitora já votou!";
    
    assertEquals(text, outputStreamCaptor.toString().trim());
  }
  
  @Test
  @DisplayName("6 - Verifica o resultado.")
  void testMostrarResultado() {
    GerenciamentoVotacao gerenciamento = new GerenciamentoVotacao();
    gerenciamento.cadastrarPessoaCandidata("Candidato_1", 1);
    gerenciamento.cadastrarPessoaCandidata("Candidato_2", 2);

    gerenciamento.cadastrarPessoaEleitora("Eleitor_1", "111");
    gerenciamento.cadastrarPessoaEleitora("Eleitor_2", "222");

    gerenciamento.votar("111", 1);
    gerenciamento.votar("222", 2);
    
    gerenciamento.mostrarResultado();
    
    assertTrue(outputStreamCaptor.toString().trim().contains("Candidato_1"));
  }
}
