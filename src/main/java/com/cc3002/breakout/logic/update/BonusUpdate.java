package com.cc3002.breakout.logic.update;

import com.cc3002.breakout.logic.Console;
import com.cc3002.breakout.logic.bonus.IBonus;
/**
 * 
 * @author vale.
 *
 */

public class BonusUpdate implements IUpdate {
  final transient IBonus bonus;
  Console impresora;
  
  public BonusUpdate(IBonus bonus) {
    this.bonus = bonus;
  }
  
  public IBonus getBonus() {
    return this.bonus;
  }
  
  public boolean isLevelupdate() {
   
    return false;
  }

  public boolean isBrickupdate() {
    
    return false;
  }

  public boolean isBonusUpdate() {
    
    return true;
  }

  public void print() {
    bonus.print2(this);
  }

  public int puntosaSumar() {
   
    return 0;
  }

  public void printHeartDiscount() {
    impresora.printHeartDiscount();
  }
 
  public void printHeartBonus() {
    impresora.printHeartBonus();
  } 
  
  public void printScoreBonus() {
    impresora.printScoreBonus();
  }
  
  public void printScoreDiscount() {
    
    impresora.printScoreDiscount();
  }
}
