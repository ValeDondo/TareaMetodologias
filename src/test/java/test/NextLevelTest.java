package test;

import static org.junit.Assert.assertNotNull;

import com.cc3002.breakout.logic.Game;
import com.cc3002.breakout.logic.NextLevel;

import org.junit.Before;
import org.junit.Test;



public class NextLevelTest {
 
  private transient NextLevel level;
 
  private transient Game juego;
  /**
   * constructor test.
   */
 
  @Before
  
  public void setUp() throws Exception {
    
    level = new NextLevel();
    juego = new Game("e",1,0);
  
  }

  
  @Test
  public void test() {
    level.setNewlevel(juego);
   
    assertNotNull(juego.nivel);
  }

}
