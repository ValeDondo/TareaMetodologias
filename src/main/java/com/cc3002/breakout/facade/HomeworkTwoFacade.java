package com.cc3002.breakout.facade;

import com.cc3002.breakout.logic.Game;

import com.cc3002.breakout.logic.Player;

import com.cc3002.breakout.logic.bonus.HeartBonus;

import com.cc3002.breakout.logic.bonus.HeartDiscount;

import com.cc3002.breakout.logic.bonus.IBonus;

import com.cc3002.breakout.logic.bonus.ScoreBonus;

import com.cc3002.breakout.logic.bonus.ScoreDiscount;

import com.cc3002.breakout.logic.brick.IBrick;

import com.cc3002.breakout.logic.level.ILevel;

import com.cc3002.breakout.logic.level.Level;

import com.cc3002.breakout.logic.level.PrintLevel;

import java.io.PrintStream;

import java.util.List;


import java.util.Observer;

/**
 * fachada.
 * 
 * @author vale.
 *
 */

public class HomeworkTwoFacade {
  Player jugador;
  PrintLevel imprimeNivel;

  Observer observer;
  Game game;

  /**
   * constructor.
   */

  public HomeworkTwoFacade() {
    jugador = new Player();
    Game game;
    imprimeNivel = new PrintLevel();

  }

  public ILevel newLevelWithSoftAndStoneBricks(String levelName, int number, double probability) {
    game = new Game(levelName, number, probability);
    return game.nivel;

  }

  public long numberOfBricks() {
    return game.numberOfBricks();
  }

  public List<IBrick> getBricks() {
    return game.getBricks();

  }

  public boolean hasNextLevel() {
    return game.getHasNextLevel();

  }

  public String getLevelName() {
    return game.getName();

  }

  public long getRequiredPoints() {
    return game.getRequiredPoints();

  }

  public int getNumberOfHearts() {
    return jugador.getLife();

  }

  public int lossOfHeart() {
    return jugador.lossOfHearts();

  }

  public long earnedScore() {
    return jugador.getPuntaje();

  }

  public ILevel getCurrentLevel() {
    return this.game.nivel;

  }

  public void setCurrentLevel(final ILevel newlevel) {
    game.setCurrentLevel(newlevel);
  }

  /**
   * 
   * @param nivel.
   * @return string.
   */

  public String spawnBricks(final ILevel nivel) {
    return imprimeNivel.getStringLevel(nivel);
  }

  /**
   * setea un nuevo nivel.
   */

  public void setNextLevel() {
    game.setNextLevel();


  }

  /**
   * List. Meted.
   * 
   * @param number numero.
   * @param probability probabilidad.
   * @return list.
   */

  public List<IBonus> newBonuses(final int number, final double probability) {

    return game.newBonuses(number, probability);

  }

  /**
   * asigna los bonus a un nivel.
   * 
   * @param bonuses.
   */

  public void registerBonuses(final List<IBonus> bonuses) {
    game.nivel.setBonus(bonuses);
  }

  public void setGameConsoleOutput(final PrintStream printStream) {
      
    game.setConsole(printStream);
  }

  public void autoSwitchToNextLevel() {
    game.autoSwitchtoNextLevel();
  }

  /**
   * entrega si esta en el nivel.
   * 
   * @return boolean.
   */

  public boolean hasCurrentLevel() {

    return game.nivel != null;

  }

  /**
   * entrega nuevo bonos.
   */


  public IBonus newExtraScore() {


    return new ScoreBonus(5);

  }

  /**
   * entrega nuevas vidas.
   * 
   * @return IBonus.
   */

  public IBonus newExtraHeart() {

    return new HeartBonus(1);

  }


  /**
   * descuenta puntos.
   * 
   * @return IBonus.
   */

  public IBonus newScoreDiscount() {

    return new ScoreDiscount(-3);

  }

  /**
   * Descuenta vidas.
   * 
   * @return IBounus.
   */


  public IBonus newHeartDiscount() {
    IBonus bonus = new HeartDiscount(-1);
    
    return bonus;


  }

}
