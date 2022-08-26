package com.exercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PessoaEleitoraTest {

  PessoaEleitora pessoaEleitora = new PessoaEleitora("Pessoa_0", "000");

  @Test
  @DisplayName("1 - Verifica os métodos setNome e getNome.")
  void testSetNomeGetNome() {
    pessoaEleitora.setNome("Pessoa_1");
    assertEquals("Pessoa_1", pessoaEleitora.getNome());
  }
  
  @Test
  @DisplayName("2 - Verifica os métodos setCpf e getCpf.")
  void testSetCpfGetCpf() {
    pessoaEleitora.setCpf("111");
    assertEquals("111", pessoaEleitora.getCpf());
  }
}
