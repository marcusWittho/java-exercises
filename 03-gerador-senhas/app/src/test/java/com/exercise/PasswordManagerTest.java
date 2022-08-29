package com.exercise;

import static org.junit.jupiter.api.Assertions.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PasswordManagerTest {
  
  public static void fileReader(File file, String password) throws IOException {
    FileReader reader = null;
    BufferedReader buffer = null;
    
    try {
      reader = new FileReader(file);
      buffer = new BufferedReader(reader);

      String content = buffer.readLine();
      assertEquals(content, password);
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

  @Test
  @DisplayName("1 - Verifica se os arquivos com as respectivas senhas são criados.")
  void testPasswordManager() throws IOException {
    
    WriteFile writer = new WriteFile();
    
    File fileSource = new File("./passwordTest");
    fileSource.deleteOnExit();
    
    if (!fileSource.exists()) {
      fileSource.mkdir();
    }
    
    for (int i = 0; i < 10; i++) {
      
      File file = new File(fileSource + File.separator + "file_" + i + ".txt");
      file.deleteOnExit();
      
      String passwordTest = "password_" + i;
      
      try {
        writer.fileWriter(passwordTest, file);
      } catch (IOException err) {
        err.printStackTrace();
      }
      
      if (file.exists()) {
        fileReader(file, passwordTest);
      } 
    }
  }
}
