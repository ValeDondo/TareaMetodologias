package test;

import static org.junit.Assert.*;

import com.cc3002.breakout.logic.brick.IBrick;
import com.cc3002.breakout.logic.update.BrickUpdate;

import org.junit.Before;
import org.junit.Test;



public class BrickUpdateTest {

  private transient BrickUpdate up;
  private transient IBrick brick;
  
  
  @Before
  public void setUp() throws Exception {
    up = new BrickUpdate(brick);
  }

  @Test
  public void isBrickUpdatetest() {
    assertTrue(up.isBrickupdate());
  }

  @Test
  public void isBonusUpdatetest() {
    assertFalse(up.isBonusUpdate());
  }
  
  @Test
  public void isLevelUpdatetest() {
    assertFalse(up.isLevelupdate());
  }
  
  @Test
  
  public void getBrickTest() {
    assertEquals(brick,up.getBrick());
  }
}
