package com.cc3002.breakout.logic.update;

import com.cc3002.breakout.logic.brick.IBrick;

import java.util.Observer;



/**
 * clase.
 * @author vale.
 *
 */

public class BrickUpdate implements IUpdate {

  final transient IBrick brick;
  
  public BrickUpdate(IBrick brick) {
    this.brick = brick;
  }
  
  public Object getUpdate(Observer obj) {
    return null;
  }

  

  public boolean isLevelupdate() {
    
    return false;
  }
  
  public IBrick getBrick() {
    return this.brick;
  }
  
  public boolean isBrickupdate() {
    
    return true;
  }

  public boolean isBonusUpdate() {
   
    return false;
  }

  public void print() {
    
    System.out.println(this.brick.bricks());
  }

  public int puntosaSumar() {
    
    return this.brick.getScore();
  }

}
