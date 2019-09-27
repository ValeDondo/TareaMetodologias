package com.cc3002.breakout.logic.brick;

import com.cc3002.breakout.logic.update.BrickUpdate;

import java.util.Observable;




/**
 * clase abstracta.
 * 
 * @author vale.
 *
 */

public abstract class AbstractBrick extends Observable implements IBrick {
  protected transient int puntaje;
  protected transient int vida;

  /**
   * vida.
   */

  public int remainingHits() {

    return vida;

  }

  /**
   * obtiene el puntaje del brick.
   */

  public int getScore() {

    return this.puntaje;

  }

  /**
   * funcion de golpear ladrillo.
   * 
   * @return int.
   */
  public String bricks() {
    String brick;
    if (this.isSoftBrick()) {
      brick = "Soft brick destroyed and gained 10 points.";

    } else {

      brick = "Stone brick destroyed and gained 50 points.";
    }

    return brick;
  }

  /**
 * golpea el ladrillo.
 */

  public int hit() {

    final int vida = this.vida;
    this.looseLife();
    int returnedScore = 0;
    if (this.vida < vida && this.vida == 0) {
      returnedScore = this.puntaje;
    }
    if (isDestroyed()) {
      setChanged();
      
      notifyObservers(new BrickUpdate(this));
    }
    return returnedScore;

  }

  /**
   * funcion que verifica si el ladrillo tiene vidas.
   * 
   * @return boolean.
   */

  public boolean isAlive() {
    return this.vida > 0;
  }

  /**
   * funcion reducir vida.
   * 
   * @return int.
   */

  public int looseLife() {

    int vida2 = this.vida;
    if (vida2 > 0) {
      this.vida = vida2 - 1;
      return this.vida;
    }
    return this.vida;
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

  /**
   * devuelve el puntaje.
   * 
   * @return int.
   */

  public int puntajeBrick() {

    return this.getScore();
  }

  /**
   * obtiene la vida del ladrillo.
   * 
   * @return int.
   */

  public int getLife() {
    return vida;
  }

  public boolean isDestroyed() {
    return this.remainingHits() == 0;
  }
}
