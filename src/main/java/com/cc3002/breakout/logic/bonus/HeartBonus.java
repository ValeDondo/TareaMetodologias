package com.cc3002.breakout.logic.bonus;

import com.cc3002.breakout.logic.update.BonusUpdate;





/**
 * heartbonus.
 * @author vale
 *
 */

public class HeartBonus extends Bonus {
  boolean isreached;
  
  /* Contructor de HeartBonus.
   * 
   */
  
  public HeartBonus(int bonos) {
    super(bonos);
  
  }
 
  /**
   * si alcanza el nivel y notifica a observadores.
   */

  public void reached() {
    
    this.isreached = true;
    notifyObservers();
  }

  public boolean isDiscount() {
    
    return false;
  }

  public boolean isExtraBonus() {
    
    return true;
  }

  public int getBonus() {
    
    return this.bonus;
  }



 


  public boolean getReached() {
    
    return this.isreached;
  }
  /**
   * avisa para imprimir bonus.
   */
  
  public void print2(BonusUpdate bonusUpdate) {
    
    bonusUpdate.printHeartBonus();
    
  }

 

}
