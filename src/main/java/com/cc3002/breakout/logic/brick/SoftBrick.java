package com.cc3002.breakout.logic.brick;

/**
 * clase SoftBrick.
 * @author vale
 *
 */

public class SoftBrick extends AbstractBrick {
 
  /**
   * constructor de SoftBrick.
   */
  public SoftBrick() {
    vida = 1;
    puntaje = 10;
  
  
  }
  
  /**
   * pregunta si es soft.
   * @return boolean true si es verdad false sino.
   */
  
  public boolean isSoftBrick() {
   
    return true;
  }
  /** pregunta si es Stone.
   * @return boolean.
   */
 
  
  public boolean isStoneBrick() {
    
    return false;
  }


  public boolean isDestroyed() {
    
    return false;
  }

  @Override
 public String toString()   {
    return "*";
  }



}
