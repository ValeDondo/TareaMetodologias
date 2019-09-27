package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cc3002.breakout.logic.bonus.HeartDiscount;
import com.cc3002.breakout.logic.bonus.IBonus;

public class HeartDiscountTest {
  private transient IBonus heart ;
  
  @Before
  
  public void setUp()  {
    
    heart = new HeartDiscount(-1);
  }

  @Test
  public void constructorTest() {
    assertEquals(-1,heart.getBonus());
  }
  
  @Test
  public void isDiscountTest() {
    assertTrue(heart.isDiscount());
  }
  
  @Test
  public void isExtraBonusTest() {
    assertFalse(heart.isExtraBonus());
  }
  
  @Test
  
  public void isReachedTest() {
   
    heart.reached();
    assertTrue(heart.getReached());
  
  }

}
