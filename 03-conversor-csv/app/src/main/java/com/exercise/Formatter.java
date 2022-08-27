package com.exercise;

import java.text.ParseException;
import javax.swing.text.MaskFormatter;

/**
 * Classe Formatter.
 */
public class Formatter {

  /**
   * Método responsável por formatar a string recebida por parâmetro.
   */
  public String stringFormatter(String string) {
    String[] infos = string.split(",");
    String name = infos[0];
    String[] date = infos[1].split("/");
    String cpf = infos[3];
    
    if (name.compareTo("Nome completo") != 0) {
      infos[0] = name.toUpperCase();
    }
    
    if (date.length == 3) {
      String newDateFormat = String.join("-", date[2], date[1], date[0]);
      infos[1] = newDateFormat;
    }
    
    String newCpfFormat = "";
    MaskFormatter mf = null;
    
    if (cpf.length() == 11) {
      try {
        mf = new MaskFormatter("###.###.###-##");
        mf.setValueContainsLiteralCharacters(false);
        newCpfFormat = mf.valueToString(cpf);
        infos[3] = newCpfFormat;
      } catch (ParseException err) {
        err.printStackTrace();
      }      
    }
    
    String newStringFormat = String.join(",", infos[0], infos[1], infos[2], infos[3]);
    
    return newStringFormat;
  }
}
