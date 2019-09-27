package test;

import static org.junit.Assert.*;

import com.cc3002.breakout.logic.level.ILevel;
import com.cc3002.breakout.logic.level.NullLevel;

import org.junit.Before;
import org.junit.Test;



public class NullLevelTest {
  private transient ILevel nulo;
  
  @Before
  
  public void setUp() throws Exception {
    nulo = new NullLevel();
  }

  @Test
  public void isNulltest() {
    assertTrue(nulo.isNull());
  }

  @Test
  
  public void isLevelTest() {
    assertFalse(nulo.isLevel());
  }
  
  @Test
  
  public void  getProxTest() {

    assertNull(nulo.getProx());
  }
  
  @Test
  public void getHasNextLevelTest() {

    assertFalse(nulo.getHasNextLevel());
  }

 


  @Test 
  

  public void getNameTest() {
    
    assertNull(nulo.getName());
  }

  
  @Test
  public void numberOfBricksTest() {
 
    assertEquals(0,nulo.numberOfBricks());
  }
  
  @Test
  
  public void getPuntajeTest() {
   
    assertEquals(0,nulo.getPuntaje());
  }

  

  
  @Test
  
  public void getBonus() {
   
   assertNull(nulo.getBonus());
  }
  @Test
  
  public void getRequired() {
  
    assertEquals(0,nulo.getRequired());
  }

}
