package com.cc3002.breakout.logic.bonus;

import com.cc3002.breakout.logic.update.BonusUpdate;





/**
 * ScoreDiscount class.
 * @author vale
 *
 */

public class ScoreDiscount extends Bonus {
   
  boolean isreached;
 
  public ScoreDiscount(int bonos) {
    super(bonos);
   
  }
  /**
   * Nivel alcanzado.
   */
  
  public void reached() {
    
    this.isreached = true;
    notifyObservers();
  }

  public boolean isDiscount() {
   
    return true;
  }

  public boolean isExtraBonus() {
    
    return false;
  }

  public int getBonus() {
   
    return this.bonus;
  }

  
  
  public boolean getReached() {
    
    return this.isreached;
  }
  
  /**
   * envia mensaje.
   */
  
  public void print2(BonusUpdate bonusUpdate) {
   
    bonusUpdate.printScoreDiscount();
    
  }

}
