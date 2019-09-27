package com.cc3002.breakout.logic;

import com.cc3002.breakout.logic.update.IUpdate;

import java.io.PrintStream;


/**
 * 
 * @author vale.
 *
 */

public class Console {
  PrintStream print;

  public void setStream(PrintStream print) {
    this.print = print;
  }


  public void print(IUpdate arg1) {

    arg1.print();
  }

  public void printHeartDiscount() {
    print.println("Heart discount emitted.");
  }

  /**
   * printea heartbonus.
   */

  public void printHeartBonus() {

    print.println("Extra heart bonus emitted.");

  }

  /**
   * printea Score Bonus.
   */

  public void printScoreBonus() {

    print.println("Extra score bonus emitted.");

  }

  /**
   * printea socre discount.
   */

  public void printScoreDiscount() {

    print.println("Score discount emitted.");

  }



}
