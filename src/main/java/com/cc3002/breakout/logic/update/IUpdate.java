package com.cc3002.breakout.logic.update;



/**
 * interface Update.
 * @author vale
 *
 */

public interface IUpdate {
  

  boolean isLevelupdate();

  boolean isBrickupdate();

  boolean isBonusUpdate();
  
  void print();

  int puntosaSumar();

}
