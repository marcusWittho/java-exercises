package com.exercise;

import java.io.File;
import java.io.IOException;

/**
 * Classe que faz o gerenciamento das senhas.
 */
public class PasswordManager {

  public static final Integer QTTY_PASSWORDS = 10;
  public static final String DESTINATION_FOLDER = "./passwords";
  
  /**
   * Método gera 10 senhas e as salva em seus respectivos arquivos.
   */
  public void manager() {
    
    GeneratePassword generatePass = new GeneratePassword();
    WriteFile writeFile = new WriteFile();

    File fileSource = new File(DESTINATION_FOLDER);
    
    if (!fileSource.exists()) {
      fileSource.mkdir();
    }
    
    for (int i = 0; i < QTTY_PASSWORDS; i++) {
      
      File file = new File(fileSource + File.separator + "file_" + i + ".txt");
      
      String password = generatePass.newPassword(i);
      
      try {
        writeFile.fileWriter(password, file);
      } catch (IOException err) {
        err.printStackTrace();
      }
    }
  }
}
