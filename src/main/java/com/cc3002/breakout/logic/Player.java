package com.cc3002.breakout.logic;

import com.cc3002.breakout.logic.brick.IBrick;

/**
 * player.
 * @author vale
 *
 */

public class Player {
  private int life;
  private int puntaje;

  /**
   * Constructor de Player. Inicializa los valores en 3 y 0.
   * 
   */
  public Player() {
    life = 3;
    puntaje = 0;
  }

  /**
   * Construye Player con dos parametros.
   * 
   * @param vida life.
   * @param score puntaje.
   */
  public Player(int vida, int score) {
    this.life = vida;
    this.puntaje = score;
  }
  
  /**
   * funcion que golpea al brick.
   * @param brick.
   * @return int.
   */
  public int hit(IBrick brick1) {
    
    
    return this.puntaje += brick1.hit() ;
    
  }

  /**
   * Obtiene la vida del Player.
   * 
   * @return life.
   */


  public int getLife() {
    return life;
  }
 
  public int getPuntaje() {
    return puntaje;
  }

  /**
   * Le quita vidas al jugador.
   */

  public int lossOfHearts() {
    int vida = this.life - 1;
    this.life = vida;
    return vida;
  }
  /**
   * modifica a player.
   * @param puntaje.
   * @return.
   */
  
  public int modify(int puntaje) {
     
    return this.puntaje += puntaje;
  
  }

}
