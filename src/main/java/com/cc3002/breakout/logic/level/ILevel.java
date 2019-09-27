package com.cc3002.breakout.logic.level;

import com.cc3002.breakout.logic.bonus.IBonus;
import com.cc3002.breakout.logic.brick.IBrick;

import java.util.List;

 
/**
 * interface.
 * @author vale
 *
 */

public interface ILevel {
   
  ILevel getProx();
  
  boolean getHasNextLevel();
  
  String getName();

  List<IBrick> getBricks();

  long numberOfBricks();

  int getPuntaje();
  
  void setNextLevel(ILevel level);

  void setRequiredPoints(int points);

  void setBonus(List<IBonus> bonus);
  
  List<IBonus> getBonus();

  boolean isLevel();
  
  public int getRequired();
 
  public boolean isNull();
}
