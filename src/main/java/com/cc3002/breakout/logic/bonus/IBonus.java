package com.cc3002.breakout.logic.bonus;

import com.cc3002.breakout.logic.update.BonusUpdate;




/**
 * inferface.
 * @author vale
 *
 */

public interface IBonus {
  
  
 
  void reached();
  
  boolean getReached();
  
  boolean isDiscount();
  
  boolean isExtraBonus();
  
  int  getBonus();

  void print2(BonusUpdate bonusUpdate);

  
    
}
