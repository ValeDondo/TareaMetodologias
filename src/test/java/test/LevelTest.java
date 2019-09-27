package test;

import static org.junit.Assert.*;

import com.cc3002.breakout.logic.level.ILevel;
import com.cc3002.breakout.logic.level.Level;

import org.junit.Before;
import org.junit.Test;


public class LevelTest {

  private transient ILevel nivel;

  @Before

  public void setUp() {
    nivel = new Level("1", 4, 0.5);
  }

  /**
   * Test del contructor deL NIVEL.
   */

  @Test

  public void constructorTest() {
    ILevel level = new Level("Nivel1", 4, 0.5);

    assertNotNull(level);
    assertEquals("Nivel1", level.getName());
    assertEquals(4, level.numberOfBricks());
  }

  @Test
  /**
   * Test number of Bricks.
   */
  public void numberOfBricksTest() {
    assertEquals(4, nivel.numberOfBricks());
  }

  /**
   * Test getBricks.
   */

  @Test

  public void getBricksTest() {
    assertNotNull(nivel.getBricks());
    for (int i = 0; i < 4; i++) {
      assertNotNull(nivel.getBricks().get(i));
    }

  }

  /**
   * Test getPuntaje.
   */

  @Test

  public void getPuntaje() {
    assertTrue(40 < nivel.getPuntaje() && nivel.getPuntaje() < 200);
  }
  
  @Test
  
  public void setRequiredPointsTest() {
   
    nivel.setRequiredPoints(8);
    assertEquals(8,nivel.getRequired());
   
  }
  
  @Test
  
  public void setNextLevelTest() {
    ILevel nivel = new Level("Nivel 2",10,0.5);
    nivel.setNextLevel(nivel);
    assertEquals(nivel,nivel.getProx());
    
  }
  
  @Test
  
   public void isLevelTest() {
    
    assertTrue(nivel.isLevel());
  }
}

