/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package com.exercise;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe principal.
 */
public class App {

  /**
   * Método inicial.
   */
  public static void main(String[] args) {
    int finalizar;
    int idade;
    
    List<Integer> menores = new ArrayList<>();
    List<Integer> maiores = new ArrayList<>();
    List<Integer> seniors = new ArrayList<>();
    
    Scanner scan = new Scanner(System.in);
    
    do {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Acessar o estabelecimento");
      System.out.println("2 - Finalizar sistema e mostrar relatório");
      finalizar = scan.nextInt();
      
      if (finalizar != 1 && finalizar != 2) {
        System.out.println("Entre com uma opção válida!");
        continue;
      } else if (finalizar == 2) {
        break;
      }
      
      System.out.println("Entre com a sua idade:");
      idade = scan.nextInt();
      
      if (idade <= 18) {
        menores.add(idade);
        System.out.println("Pessoa cliente menor de idade, catraca liberada!");
      } else if (idade <= 49) {
        maiores.add(idade);
        System.out.println("Pessoa adulta, catraca liberada!");
      } else {
        seniors.add(idade);
        System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
      }

    } while (finalizar != 2);
    
    scan.close();

    System.out.println("----- Quantidade -----");
    System.out.print("menores: ");
    System.out.println(menores.size());
    System.out.print("adultas: ");
    System.out.println(maiores.size());
    System.out.print("a partir de 50: ");
    System.out.println(seniors.size());
    
    DecimalFormat df = new DecimalFormat("#0.0#%");      

    int visitasTotais = menores.size() + maiores.size() + seniors.size();

    if (visitasTotais == 0) {
      df = new DecimalFormat("0.0%");      
    }
    
    double menoresPercent = menores.size();
    double maioresPercent = maiores.size();
    double seniorsPercent = seniors.size();

    System.out.println("----- Percentual -----");
    System.out.print("menores: ");
    System.out.println(df.format(menoresPercent / visitasTotais));
    System.out.print("adultas: ");
    System.out.println(df.format(maioresPercent / visitasTotais));
    System.out.print("a partir de 50: ");
    System.out.println(df.format(seniorsPercent / visitasTotais));
    
    System.out.println("TOTAL: " + visitasTotais);
  }
}
