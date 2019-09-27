package test;

import static org.junit.Assert.*;

import com.cc3002.breakout.logic.brick.IBrick;
import com.cc3002.breakout.logic.brick.NullBrick;

import org.junit.Before;
import org.junit.Test;



public class NullBrickTest {
  
  private transient IBrick brick;
  
  @Before
  
  public void setUp() throws Exception {
        
    brick = new NullBrick();
  }

  @Test
  public void isStonetest() {
    assertFalse(brick.isStoneBrick());
  }
  
  @Test
  public void isSoftBricktest() {
    assertFalse(brick.isSoftBrick());
  }
  
  @Test
  
  public void simpleStringTest() {
    
    assertEquals(" ",brick.toString());
  }
}
