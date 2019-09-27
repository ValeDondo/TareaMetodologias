package com.cc3201.breakout.gui;

import com.almasb.ents.AbstractControl;
import com.almasb.ents.Entity;
import com.cc3002.breakout.logic.brick.IBrick;


public class BrickControl extends AbstractControl {
  private IBrick brick;
 
  public  BrickControl(IBrick brick){
     this.brick = brick;
  }
  
  public void onUpdate(Entity arg0, double arg1) {
   
    
  }

}
