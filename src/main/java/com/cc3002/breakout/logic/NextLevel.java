package com.cc3002.breakout.logic;

import com.cc3002.breakout.logic.update.IUpdate;

import java.util.Observable;

import java.util.Observer;


/**
 * 
 * @author vale.
 *
 */

public class NextLevel implements Observer {
  private Game juego;
  private IUpdate up;
  
    
  
  /**
 * actuliza nivel.
 */
 
  public void update(Observable objeto, Object arg) {
      
    up = (IUpdate)arg;
    juego = (Game) objeto;
    if (up.isLevelupdate()) {
      toNextLevel();
       
    } else {
      addPuntos(up);
      toNextLevel();
    }
    
  }
   
  private void addPuntos(IUpdate up) {
    int puntos = up.puntosaSumar();
    juego.addPuntos(puntos);
  }
 
  public void setNewlevel(Game game) {
    this.juego = game;
  }
  
  /**
   * setea nuevo nivel.
   */
 
  public  void  toNextLevel() {
   
    if (juego.nivel.getRequired() <  juego.nivel.getPuntaje()) {
    
      juego.setNextLevel();
      
      juego.imprimir.print(up);
    }
  }
}
