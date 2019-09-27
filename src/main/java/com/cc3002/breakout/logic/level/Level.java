package com.cc3002.breakout.logic.level;

import com.cc3002.breakout.logic.bonus.IBonus;
import com.cc3002.breakout.logic.brick.IBrick;

import com.cc3002.breakout.logic.brick.SoftBrick;

import com.cc3002.breakout.logic.brick.StoneBrick;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;




/**
 * Clase Leve.
 * @author vale.
 *
 */

public class Level extends Observable implements Observer, ILevel {
  private final String name;
  private int puntaje;
  private ILevel nivelprox = new NullLevel();
  List<IBrick> lista = new ArrayList<IBrick>();
  boolean hasNxtLevel;
  List<IBonus> lista1 = new ArrayList<IBonus>() ;
  int required;
  /**
    * setea una lista de bonos para un nivel.
    * @param bonus.
    */
  
  public void setBonus(List<IBonus> bonus) {
     
    this.lista1 = bonus;
     
  }
  
  public List<IBonus> getBonus() {
    
    return lista1;
  } 
  /**
   * nivel. 
   * @param levelName.
   * @param number.
   * @param probability.
   */
  
  public Level(String levelName) {
    
    this.name = levelName;
    this.hasNxtLevel = false;
  }
  /**
   * constructor level.
   * @param levelName.
   * @param number.
   * @param probability.
   */
  
  public  Level(String levelName,int number, double probability) {
    this.hasNxtLevel = false;
    this.name = levelName;
    for (int i = 0; i < number;i++) {
      float number1 = (float) Math.random();
      if (number1 > probability) {
        
        SoftBrick brick = new SoftBrick();
       
        brick.addObserver(this);
      
        lista.add(brick);
        this.puntaje += brick.getScore();
      } else {
        StoneBrick brick = new StoneBrick();
        brick.addObserver(this);
        lista.add(brick);
        this.puntaje += brick.getScore();
      }
     
    }
    
  }
  /**
    * retorna nombre.
    */
  
  public String getName() {
    return name;
  }
  /**
   * retorna puntaje.
   */
  
  public int getPuntaje() {
    return puntaje ;
  }
  /**
   * retorna una lista de ladrillos.
   */
  
  public List<IBrick> getBricks() {
    
    return lista;
  }
  
  /**
   * retorna numero de ladrillos.
   */
  
  public long numberOfBricks() {
   
    return lista.size();
  }
 
  public void setNextLevel(ILevel level) {
    nivelprox = level;
    this.hasNxtLevel = true;
  }
  
  
  
  public void setRequiredPoints(int points) {
        
    this.required = points;
  }
  /**
   * update ellevel.
   */
  
  public void update(Observable objeto, Object arg) {
    
    
    this.puntaje += ( (IBrick)arg ).getScore();
    setChanged();
    notifyObservers(arg);
   
  }
  
  public ILevel getProx() {
    
    return this.nivelprox;
  }
  
  public boolean getHasNextLevel() {
    
    return hasNxtLevel;
  }

  public boolean isLevel() {
    
    return true;
  }

  public int getRequired() {
   
    return this.required;
  }

  public boolean isNull() {
    
    return false;
  }
 
  

 
 
 

}
