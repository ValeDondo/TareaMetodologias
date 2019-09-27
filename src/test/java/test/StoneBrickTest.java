package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cc3002.breakout.logic.brick.StoneBrick;

public class StoneBrickTest {

  private transient StoneBrick ladrillo;
  
  @Before

  public void setUp() {
    ladrillo = new StoneBrick();
  }
  
  /**
   * Test getScore.
   */
  @Test
  public void getScoreTest() {
    assertEquals(50,ladrillo.getScore());
  }
  /**
   * Test is soft.
   */
 
  
  @Test
 
  public void isSoftBrickTest() {
    assertFalse(ladrillo.isSoftBrick());
  }
  /**
  * Test is Stone.
  */
 
  @Test
  public void isStoneBrickTest() {
    assertTrue(ladrillo.isStoneBrick());
  }
  /**
   * Test puntaje Brick.
   */
  
  @Test
   
  public void puntajeBrickTest() {
  
    assertEquals(50,ladrillo.puntajeBrick());
  }
  /**
   * Test isAlive().
   */
  
  
  @Test
 
  
  public void isAliveTest() {
    assertTrue( ladrillo.isAlive());
    assertEquals(0,ladrillo.hit());
    assertTrue(ladrillo.isAlive());
    assertEquals(0,ladrillo.hit());
    assertTrue(ladrillo.isAlive());
   

  }

  @Test
  /**
   * Test hit().
   */
  public void hitTest() {
    System.out.println(ladrillo.getLife());
    assertEquals(0,ladrillo.hit());
    assertEquals(0,ladrillo.hit());
    assertEquals(50,ladrillo.hit());
  }
  
  @Test
  /** 
   * Test looseLife.
   */
  
  public void looseLifeTest() {
    
    assertEquals(2,ladrillo.looseLife());
    assertEquals(1,ladrillo.looseLife());
    assertEquals(0,ladrillo.looseLife());
    assertEquals(0,ladrillo.looseLife());
  }
  
  @Test
  
  public void simpleStringTest() {
    
    assertEquals("#",ladrillo.toString());
  }
}
