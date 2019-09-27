package com.cc3201.breakout.gui;

import com.almasb.ents.AbstractControl;
import com.almasb.ents.Entity;
import com.almasb.fxgl.entity.component.BoundingBoxComponent;
import com.almasb.fxgl.entity.component.PositionComponent;
import com.almasb.fxgl.physics.PhysicsComponent;

public class BatControl extends AbstractControl {

  protected PositionComponent posicion;
  protected PhysicsComponent bat;
  protected BoundingBoxComponent bbox;
  
  @Override
  public void onAdded(Entity entity) {
    bat = entity.getComponentUnsafe(PhysicsComponent.class);
    posicion = entity.getComponentUnsafe(PositionComponent.class);
    bbox = entity.getComponentUnsafe(BoundingBoxComponent.class);
  }
 
  public void onUpdate(Entity arg0, double arg1) {}
  
  /**
   * movimiento a la izquierda.
   */ 
  public void left() {
    
    if (posicion.getX() >= 5) {
      bat.setLinearVelocity(-5 * 60,0);
    } else {
      stop();
    }
  }
  /**
   * para ir a la derecha.
   */
  
  public void right() {
    
    if (posicion.getX() <= 800) {
      bat.setLinearVelocity(5 * 60 ,0);
    } else {
     
      stop();
    }
    
  }
  
  public void stop() {
   
    bat.setLinearVelocity(0,0);
  }
}
