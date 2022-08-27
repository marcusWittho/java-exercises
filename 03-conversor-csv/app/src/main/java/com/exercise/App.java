/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.exercise;

import java.io.File;
import java.io.IOException;

public class App {

  public static void main(String[] args) throws IOException {
    
    File entriesFolder = new File("./entradas");
    File outputFolder = new File("./saidas");
    
    new App().converterPasta(entriesFolder, outputFolder);
  }
  
  public void converterPasta(File entriesFolder, File outputFolder) {
    
    Reader reader = new Reader();
    Writer writer = new Writer();
    
    if (!outputFolder.exists()) {
      outputFolder.mkdir();
    }
    
    for (File file : entriesFolder.listFiles()) {
      writer.fileWriter(outputFolder, file.getName(), reader.fileReader(file));
    }
  }
}
