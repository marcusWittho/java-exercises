package com.exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Classe Reader.
 */
public class Reader {

  /**
   * Método responsável pela leitura do arquivo recebido por parâmetro.
   */
  public String fileReader(File file) {
    String content = "";
    
    Formatter formatter = new Formatter();
    
    FileReader reader = null;
    BufferedReader buffer = null;
    
    if (file.exists()) {
      try {
        reader = new FileReader(file);
        buffer = new BufferedReader(reader);
        
        String clientInfo = buffer.readLine();
        
        while (clientInfo != null) {
          content += formatter.stringFormatter(clientInfo) + "\n";
          clientInfo = buffer.readLine();
        }
      } catch (IOException err) {
        err.printStackTrace();
      } finally {
        try {
          reader.close();
          buffer.close();
        } catch (Exception err) {
          err.printStackTrace();
        }
      }
    }
    
    return content;
  }
}
