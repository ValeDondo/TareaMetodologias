package test;

import static org.junit.Assert.*;

import com.cc3002.breakout.logic.bonus.HeartBonus;

import com.cc3002.breakout.logic.bonus.IBonus;
import org.junit.Before;
import org.junit.Test;



public class HeartBonusTest {
  private transient IBonus bonus;

  @Before
  public void setUp()  {
    
    bonus = new HeartBonus(1);
  }

  @Test
  public void constructorTest() {
    assertEquals(1,bonus.getBonus());
  }
  
  @Test
  public void isDiscountTest() {
    assertFalse(bonus.isDiscount());
  }
  
  @Test
  public void isExtraBonusTest() {
    assertTrue(bonus.isExtraBonus());
  }
  
  @Test
  
  public void isReachedTest() {
   
    bonus.reached();
    assertTrue(bonus.getReached());
  
  }

}
