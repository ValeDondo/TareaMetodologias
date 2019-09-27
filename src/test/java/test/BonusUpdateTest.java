package test;

import static org.junit.Assert.*;

import com.cc3002.breakout.logic.bonus.IBonus;
import com.cc3002.breakout.logic.update.BonusUpdate;


import org.junit.Before;
import org.junit.Test;



public class BonusUpdateTest {
  private transient BonusUpdate up;
  private transient IBonus brick;
  
  
  @Before
  public void setUp() throws Exception {
    up = new BonusUpdate(brick);
  }

  @Test
  public void isBrickUpdatetest() {
    assertFalse(up.isBrickupdate());
  }

  @Test
  public void isBonusUpdatetest() {
    assertTrue(up.isBonusUpdate());
  }
  
  @Test
  public void isLevelUpdatetest() {
    assertFalse(up.isLevelupdate());
   
  }
 
  @Test
 
 public void getBonus() {
   
    assertEquals(brick,up.getBonus());
 
  }
 
}
