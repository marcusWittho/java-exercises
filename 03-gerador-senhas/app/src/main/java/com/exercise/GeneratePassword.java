package com.exercise;

/**
 * Classe responsável por gerar passwords.
 */
public class GeneratePassword {

  /**
   * Método gera o password de acordo com o index recebido.
   * 
   * @param index - recebe um inteiro por parâmetro que corresponde ao index.
   * @return - retorna uma string que representa o password.
   */
  public String newPassword(int index) {
    
    String[] correspondence = {
        "A5$2", "B55S", "CFFG", "D&54", "EEDF", "FEGG", "G15E", "H123", "I81F", "JWEF", "####"};
    
    if (index > 9) {
      return correspondence[10] + correspondence[10];
    }
    
    return correspondence[index] + correspondence[index + 1];
  }  
}
