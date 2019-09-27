package test;

import com.cc3002.breakout.logic.level.ILevel;
import com.cc3002.breakout.logic.level.Level;
import com.cc3002.breakout.logic.update.LevelUpdate;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class LevelUpdateTest {

  private transient LevelUpdate up;
  private transient ILevel level = new Level("Nivel1");
  
  @Before
  public void setUp() throws Exception {
    up = new LevelUpdate(level);
  }

  @Test
  public void isLevelUpdateTest() {
    assertTrue(up.isLevelupdate());
   
  }
  
  @Test
  
  public void isBonusUpdateTest() {
    
    assertFalse(up.isBonusUpdate());
  }

  @Test
  
  public void isBrickUpdateTest() {
    
    assertFalse(up.isBrickupdate());
  }
  
  @Test
  
  public void getLevelTest() {
    
    assertEquals(level,up.getLevel());
  }
}
