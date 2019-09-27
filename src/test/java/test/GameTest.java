package test;

import static org.junit.Assert.*;

import com.cc3002.breakout.facade.HomeworkTwoFacade;
import com.cc3002.breakout.logic.Game;
import com.cc3002.breakout.logic.level.Level;

import org.junit.Before;
import org.junit.Test;



public class GameTest {


  private transient Game game;
  private transient Level nivel;

  /**
   * test de game.
   */

  @Before

  public void setUp() {

    game = new Game("f",1,0);
    nivel = new Level("nivel 1",1,0);
  }

  @Test

  public void constructorTest() {
    
    assertNotNull(game);
  }

  @Test
  public void setLevelTest() {
    game.setCurrentLevel(nivel);
    assertEquals(nivel, game.nivel);
  }
  
  @Test
  public void nextLevelTest() {
    assertFalse(game.hasNextLevel());
  }
  
  @Test
  public void getRequiredPointsTest() {
    assertEquals(game.getRequiredPoints(), 7);
  }
  
  
  
  public void bricksTest() {
    assertEquals(game.numberOfBricks(), nivel.getBricks().size());
  }
  
  @Test

  public void newBonusesTest() {

    assertNotNull(game.newBonuses(10, 0.5));
    assertEquals(10, game.newBonuses(10, 0.4).size());
  }

  @Test

  public void setnextlevelTest() {
    game.setNextLevel();
    assertNotNull(game.nivel);
    
  }
  
 
}
