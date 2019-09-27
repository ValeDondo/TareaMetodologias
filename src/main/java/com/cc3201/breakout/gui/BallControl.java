package com.cc3201.breakout.gui;

import com.almasb.ents.AbstractControl;
import com.almasb.ents.Entity;
import com.almasb.fxgl.physics.PhysicsComponent;

public class BallControl extends AbstractControl {
  
  private PhysicsComponent ball;
  
  @Override
  
  public void onAdded(Entity entity) {
      
    ball = entity.getComponentUnsafe(PhysicsComponent.class);
  }
 
  /**
  * asigna limite de velocidad. 
  */
  
  public void onUpdate(Entity arg0, double arg1) {
     
    limitVelocity();
    
  }

  private void limitVelocity() {
    
    //hace nada;
    
  }

}
