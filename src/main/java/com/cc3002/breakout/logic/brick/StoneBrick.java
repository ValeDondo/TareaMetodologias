package com.cc3002.breakout.logic.brick;

/**
 * clase StoneBrick.
 * @author vale
 *
 */

public class StoneBrick extends AbstractBrick {

 
  public StoneBrick() {
    vida = 3;
    puntaje = 50;
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
  
    return true;
  }


  @Override

public String toString() {
    return "#";
  }
 

 

}
