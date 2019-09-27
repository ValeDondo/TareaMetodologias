package com.cc3002.breakout.logic.update;

import com.cc3002.breakout.logic.level.ILevel;
/**
 * 
 * @author vale.
 *
 */

public class LevelUpdate implements IUpdate {
  final transient ILevel level;
  
  public LevelUpdate( ILevel level) {
    this.level = level;
  }

  public boolean isLevelupdate() {
    
    return true;
  }
  
  
  public ILevel getLevel() {
    return this.level;
  }
  
  
  public boolean isBrickupdate() {
  
    return false;
  }

  public boolean isBonusUpdate() {
    
    return false;
  }

  public void print() {
    System.out.println("Playing Level" + level.getName());
    
  }

  public int puntosaSumar() {
  
    return 0;
  }

}
