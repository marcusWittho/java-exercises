package com.exercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GeneratePasswordTest {

  public static final String[] PASSWORDS = {"A5$2B55S", "B55SCFFG", "CFFGD&54", "D&54EEDF",
      "EEDFFEGG", "FEGGG15E", "G15EH123", "H123I81F", "I81FJWEF", "JWEF####"};

  @Test
  @DisplayName("1 - Verifica a geração de senhas.")
  void testGeneratePassword() {
    GeneratePassword generatePassword = new GeneratePassword();
    
    for (int i = 0; i < 10; i++) {
      assertEquals(PASSWORDS[i], generatePassword.newPassword(i));
    }
  }
}
