package com.exercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PessoaCandidataTest {

  PessoaCandidata pessoaCandidata = new PessoaCandidata("Candidata_0", 0);

  @Test
  @DisplayName("1 - Verifica os métodos getNumero e setNumero.")
  void testMetodosDoNumero() {
    pessoaCandidata.setNumero(1);
    assertEquals(1, pessoaCandidata.getNumero());
  }
  
  @Test
  @DisplayName("2 - Verifica métodos getVotos e setVotos")
  void testMetodosDoVotos() {
    pessoaCandidata.setVotos(10);
    assertEquals(10, pessoaCandidata.getVotos());
  }
  
  @Test
  @DisplayName("3 - Verifica o método receberVoto.")
  void testReceberVoto() {
    pessoaCandidata.setVotos(0);
    pessoaCandidata.receberVoto();
    assertEquals(1, pessoaCandidata.getVotos());
  }
}
