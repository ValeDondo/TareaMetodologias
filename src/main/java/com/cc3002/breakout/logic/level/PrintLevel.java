package com.cc3002.breakout.logic.level;

import com.cc3002.breakout.logic.brick.IBrick;

import java.util.List;


/**
 * 
 * @author vale.
 *
 */

public class PrintLevel {

  /**
   * Funcion para imprimir el nivel actual. 
   *  level. 
   *  @return.
   */

  public String getStringLevel(ILevel level) {
    StringBuilder builder = new StringBuilder();
    List<IBrick> bricks = level.getBricks();

    for (int i = 0; i < bricks.size(); i++) {
      IBrick brick = bricks.get(i);
      if (i % 16 == 0) {
        builder.append(System.lineSeparator());
      }
      builder.append(brick.toString());
    }
    builder.append(System.lineSeparator());

    return builder.toString();

  }
}
