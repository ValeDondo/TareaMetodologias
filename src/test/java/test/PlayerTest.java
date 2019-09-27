package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cc3002.breakout.logic.Player;
import com.cc3002.breakout.logic.brick.IBrick;
import com.cc3002.breakout.logic.brick.SoftBrick;
import com.cc3002.breakout.logic.brick.StoneBrick;

public class PlayerTest {
  /**
   * Test constructor.
   */
  private transient Player jugador;

  @Before

  public void setUp() {
    jugador = new Player(3, 0);
  }

  /**
   * Test getLife().
   */
  @Test
  public void getLifeTest() {
    assertEquals(3, jugador.getLife());

  }

  @Test
  /**
   * Test lossOfHeats().
   */
  public void lossOfHeartsTest() {
    int life = jugador.getLife() - 1;
    assertEquals(life, jugador.lossOfHearts());
    assertEquals(jugador.getLife(), life);

  }
  
  @Test
  
  public void getPuntaje() {
    final IBrick  brick1 = new SoftBrick();
    final IBrick brick2 = new StoneBrick();
    assertEquals(0,jugador.getPuntaje());
    jugador.hit(brick1);
    assertEquals(10,jugador.getPuntaje());
    jugador.hit(brick2);
    assertEquals(10,jugador.getPuntaje());
    jugador.hit(brick2);
    jugador.hit(brick2);
    assertEquals(60,jugador.getPuntaje());
    
  }
  
  @Test
  
  public void hitTest() {
    final IBrick brick1 = new SoftBrick();
    final IBrick  brick2 = new StoneBrick();
    assertEquals(0,jugador.getPuntaje());
    jugador.hit(brick1);
    assertEquals(10,jugador.getPuntaje());
    jugador.hit(brick2);
    assertEquals(10,jugador.getPuntaje());
    jugador.hit(brick2);
    jugador.hit(brick2);
    assertEquals(60,jugador.getPuntaje());
  }
  
  @Test
  
  public void modifyTest() {
    
    assertEquals(10,jugador.modify(10));
  }
}
