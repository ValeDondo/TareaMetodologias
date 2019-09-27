package com.cc3002.breakout.logic.bonus;



import java.util.Observable;



/**
 * clase abstracta.
 * 
 * @author vale.
 *
 */

public abstract class Bonus extends Observable implements IBonus {
  
  int bonus;
  boolean isreached;
  /**
   * constructor.
   */
  
  
  /** Contructor de Bonus.
   * 
   * @param bonos.
   */
 
  public Bonus(int bonos) {
   
    this.bonus = bonos;
    
  }  
  /**
    * si alcanza el nivel.
    */
  
  public void reached() {
    
    this.isreached = true;
    notifyObservers();
  }



  public int getBonus() {
    
    return this.bonus;
  }
  
  
}
