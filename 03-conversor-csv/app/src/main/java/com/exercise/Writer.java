package com.exercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Classe Writer.
 */
public class Writer {

  /**
   * Método responsável por escrever em determinado arquivo.
   */
  public void fileWriter(File pastaDeSaidas, String fileName, String toWrite) {
    FileWriter writer = null;
    BufferedWriter buffer = null;
    
    try {
      writer = new FileWriter(pastaDeSaidas + "/" + fileName);
      buffer = new BufferedWriter(writer);
      
      buffer.write(toWrite.toString());
      buffer.flush();
    } catch (IOException err) {
      err.printStackTrace();
    } finally {
      try {
        writer.close();
        buffer.close();
      } catch (Exception err) {
        err.printStackTrace();
      }
    }
  }
}
