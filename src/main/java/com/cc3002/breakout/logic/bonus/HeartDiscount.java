package com.cc3002.breakout.logic.bonus;

import com.cc3002.breakout.logic.update.BonusUpdate;





/**
 * claseHeartDiscount.
 * 
 * @author vale.
 *
 */

public class HeartDiscount extends Bonus {



  public HeartDiscount(int bonos) {
    super(bonos);

  }

  /**
   * si alcanza el nivel, notifica al Observador.
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
  
  public void print2(BonusUpdate bonus) {

    bonus.printHeartDiscount();

  }


}
