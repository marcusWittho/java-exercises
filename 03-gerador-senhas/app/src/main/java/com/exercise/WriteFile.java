package com.exercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Classe responsável por escrever o password em arquivo específico.
 */
public class WriteFile {

  /**
   * Método que escreve a senha no arquivo indicado no parâmetro.
   * 
   * @param password - receberá a senha que será escrita.
   * @param file - recebe o arquivo onde a senha será escrita.
   * @throws IOException - possível exceção durante a escrita do arquivo.  
   */
  public void fileWriter(String password, File file) throws IOException {
    
    FileWriter writer = null;
    BufferedWriter buffer = null;
    
    try {
      writer = new FileWriter(file);
      buffer = new BufferedWriter(writer);
      buffer.write(password);
      buffer.flush();
    } catch (IOException err) {
      err.printStackTrace();
    } finally {
      closeObjects(writer, buffer);
    }
  }
  
  /**
   * Método utilizado para fechar as conexões após a escrita do arquivo.
   * 
   * @param writer - recebe o FileWriter que será fechado.
   * @param buffer - recebe o BufferedWriter que será fechado.
   */
  public void closeObjects(FileWriter writer, BufferedWriter buffer) {
    try {
      writer.close();
      buffer.close();
    } catch (Exception err) {
      err.printStackTrace();
    }
  }
}
