package com.cc3002.breakout.logic.brick;
/**
 * 
 * @author vale.
 *
 */

public class NullBrick extends AbstractBrick {

  public NullBrick() {
    vida = 0;
    puntaje = 0;
  }
  
  
 
  
  /**
  * pregunta si es soft.
  */

  public boolean isSoftBrick() {
    
    return false;
  }
  /**
   * pregunta si es stone.
   */
  
  public boolean isStoneBrick() {
  
    return false;
  }


  @Override

public String toString() {
    return " ";
  }
 


}
