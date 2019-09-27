package com.cc3002.breakout.logic;



import com.cc3002.breakout.logic.bonus.HeartBonus;

import com.cc3002.breakout.logic.bonus.HeartDiscount;

import com.cc3002.breakout.logic.bonus.IBonus;

import com.cc3002.breakout.logic.bonus.ScoreBonus;
import com.cc3002.breakout.logic.bonus.ScoreDiscount;





import com.cc3002.breakout.logic.brick.IBrick;
import com.cc3002.breakout.logic.brick.StoneBrick;
import com.cc3002.breakout.logic.level.ILevel;
import com.cc3002.breakout.logic.level.Level;

import com.cc3002.breakout.logic.update.BrickUpdate;
import com.cc3002.breakout.logic.update.IUpdate;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;



/**
 * clase game.
 * 
 * @author vale.
 *
 */

public class Game extends Observable implements Observer {


  public transient ILevel nivel;
  public transient Player player;
  public transient ILevel nxtLevel;
  public transient NextLevel next = new NextLevel();
  public transient Console imprimir = new Console();
  public transient ArrayList<ILevel> niveles = new ArrayList<ILevel>();

  /**
   * Clase game. constructor.
   * @param probability 
   * @param number 
   * @param levelName 
   * 
   */

  public Game(String levelName, int number, double probability) {

    Level nivel = new Level(levelName, number, probability);
    this.nivel = nivel;
    nivel.addObserver(this);
    this.player = new Player();
  }

  /**
   * Crea bonus.
   * 
   * @param number.
   * @param probability.
   * @return lsita.
   */

  public List<IBonus> newBonuses(final int number, final double probability) {

    List<IBonus> lista = new ArrayList<IBonus>();

    for (int i = 0; i < number; i++) {
      float number1 = (float) Math.random();
      if (number1 > probability) { // crear bonus

        if (number1 > 0.5) {
          ScoreBonus bonus = new ScoreBonus(5);
          bonus.addObserver(this);
          lista.add(bonus);

        } else {
          HeartBonus bonus = new HeartBonus(1);
          bonus.addObserver(this);
          lista.add(bonus);
        }
      } else {


        if (number1 > 0.5) {
          HeartDiscount heart = new HeartDiscount(-3);
          heart.addObserver(this);
          lista.add(heart);

        } else {
          ScoreDiscount score = new ScoreDiscount(-1);
          score.addObserver(this);
          lista.add(score);
        }



      }

    }



    return lista;

  }

  public boolean hasNextLevel() {
    return nivel.getHasNextLevel();

  }

  /**
   * setea el siguiente nivel.
   *level. 
   * @return.
   */

  public ILevel nextLevelFrom(ILevel level) {
    ILevel nxtLevel;
    nxtLevel = (ILevel) (nivel.getHasNextLevel() ? level.getHasNextLevel() : level);
    return nxtLevel;
  }

  /**
   * las notificaciones de game.
   */

  public void update(Observable objeto, Object arg) {

    IUpdate arg1 = (IUpdate) arg;


    if (arg1.isBrickupdate()) {

      BrickUpdate argumento2 = (BrickUpdate) arg1;

      imprimir.print(arg1);
      notifyObservers();
      this.player.modify(argumento2.getBrick().getScore());
      this.next.toNextLevel();
    }
    if (arg1.isLevelupdate()) {
      notifyObservers();
    }
    if (arg1.isBonusUpdate()) {
      
      imprimir.print(arg1);
      notifyObservers();

    }

  }

  public long numberOfBricks() {
    return this.nivel.numberOfBricks();
  }

  public List<IBrick> getBricks() {

    return this.nivel.getBricks();
  }

  public boolean getHasNextLevel() {

    return this.nivel.getHasNextLevel();
  }

  public String getName() {

    return this.nivel.getName();
  }

  public double getPuntaje() {

    return this.getPuntaje();
  }

  public void setCurrentLevel(final ILevel newlevel) {
    niveles.add(newlevel);
    this.nivel = newlevel;
  }

  /**
   * setea el siguiente nivel.
   */

  public void setNextLevel() {
    this.nivel = this.nextLevelFrom(this.nivel);


  }

  /**
   * tiene nivel actual. @return.
   */

  public void addPuntos(int puntos) {


    this.player.modify(puntos);
  }

  public long getRequiredPoints() {
    return Math.round(this.nivel.getPuntaje() * 0.7);

  }


  public void setConsole(PrintStream consola) {
    this.imprimir.setStream(consola);
  }

  public void autoSwitchtoNextLevel() {
    notifyObservers();
  }

  public Console getConsole() {
    return this.imprimir;
  }

  
   
   
}
