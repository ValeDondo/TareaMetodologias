package com.cc3002.breakout.logic.level;

import com.cc3002.breakout.logic.bonus.IBonus;
import com.cc3002.breakout.logic.brick.IBrick;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author vale.
 *
 */

public class NullLevel implements ILevel {
  private final List<IBrick> bricks;
  
  public NullLevel() {
    bricks = new ArrayList<IBrick>();
  }

  public ILevel getProx() {

    return null;
  }

  public boolean getHasNextLevel() {

    return false;
  }

  public boolean isLevel() {

    return false;
  }



  public boolean isNull() {

    return true;
  }

  public String getName() {
    
    return null;
  }

  public List<IBrick> getBricks() {
    
    return bricks;
  }

  public long numberOfBricks() {
 
    return 0;
  }

  public int getPuntaje() {
   
    return 0;
  }

  public void setNextLevel(ILevel level) {
   //no hace nada;

  }

  public void setRequiredPoints(int points) {
    
    //no hace nada
  }

  public void setBonus(List<IBonus> bonus) {
    // hace nada
  }

  public List<IBonus> getBonus() {
   
    return null;
  }

  public int getRequired() {
  
    return 0;
  }

}
