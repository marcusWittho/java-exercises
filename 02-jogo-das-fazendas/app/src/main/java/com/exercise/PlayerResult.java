package com.exercise;

/**
 * Classe PlayerResult.
 */
public class PlayerResult {

  private String playerName;
  private Farm[] farms;

  /**
   * Método construtor da classe PlayerResult.
   */
  public PlayerResult(String playerName, Farm[] farms) {
    super();
    this.playerName = playerName;
    this.farms = farms;
  }
  
  /**
   * Método responsável por calcular a pontuação dos jogadores.
   */
  public double score() {
    double total = 0;
    
    for (Farm farm : farms) {
      total += farm.area();
    }
    
    return Math.round(total);
  }

  public String getPlayerName() {
    return playerName;
  }

  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }
}
