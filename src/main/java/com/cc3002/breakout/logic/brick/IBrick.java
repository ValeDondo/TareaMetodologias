package com.cc3002.breakout.logic.brick;
/**
 * interface.
 * @author vale
 *
 */

public interface IBrick {
  int hit();
  
  int looseLife();

  boolean isSoftBrick();
  
  boolean isStoneBrick();
  
  int puntajeBrick();
  
  int getScore();
  
  int remainingHits();
  
  boolean isDestroyed();
  
  public String bricks();
}