package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cc3002.breakout.logic.Player;
import com.cc3002.breakout.logic.brick.SoftBrick;

public class SoftBrickTest {
  
  private transient SoftBrick ladrillo;
  
  @Before

  public void setUp() {
    ladrillo = new SoftBrick();
  }
  
  /**
   * Test getScore.
   */
  @Test
  public void getScoreTest() {
    assertEquals(10,ladrillo.getScore());
  }
  /**
   * Test is soft.
   */
 
  
  @Test
 
  public void isSoftBrickTest() {
    assertTrue(ladrillo.isSoftBrick());
  }
  /**
  * Test is Stone.
  */
 
  @Test
  public void isStoneBrickTest() {
    assertFalse(ladrillo.isStoneBrick());
  }
  /**
   * Test puntaje Brick.
   */
  
  @Test
   
  public void puntajeBrickTest() {
  
    assertEquals(10,ladrillo.puntajeBrick());
  }
  /**
   * Test isAlive().
   */
  
  
  @Test
 
  
  public void isAliveTest() {
    assertTrue( ladrillo.isAlive());
    assertEquals(10,ladrillo.hit());
    assertFalse(ladrillo.isAlive());

  }

  @Test
  /**
   * Test hit().
   */
  public void hitTest() {
   
    assertEquals(10,ladrillo.hit());
    assertEquals(0,ladrillo.hit());
  }
  
  @Test
  /** 
   * Test looseLife.
   */
  
  public void looseLifeTest() {
    
    assertEquals(0,ladrillo.looseLife());
    assertEquals(0,ladrillo.looseLife());
  }
  
  @Test
  
  public void simpleStringTest() {
    
    assertEquals("*",ladrillo.toString());
  }
}
