package com.cc3002.breakout.logic.bonus;

import com.cc3002.breakout.logic.update.BonusUpdate;





/**
 * clase ScoreBonus.
 * @author vale
 *
 */

public class ScoreBonus extends Bonus {
  
  boolean isreached;
 
  /**
   * scorebonus.
   * @param bonos.
   */
  
  public ScoreBonus(int bonos) {
    
    super(bonos);
    
  }
  /**
  * Nivale alcanzado.
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
   * envia mensaje.
   */
  
  public void print2(BonusUpdate bonusUpdate) {
     
    bonusUpdate.printScoreBonus();
    
  }

}
