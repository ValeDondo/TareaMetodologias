package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cc3002.breakout.logic.bonus.IBonus;
import com.cc3002.breakout.logic.bonus.ScoreBonus;

public class ScoreBonusTest {
  
  
  private transient IBonus score; 
  
  @Before
  public void setUp() {
    score = new ScoreBonus(5);
  }

  @Test
  public void constructorTest() {
    assertEquals(5,score.getBonus());
  }
  
  @Test
  public void isDiscountTest() {
    assertFalse(score.isDiscount());
  }
  
  @Test
  public void isExtraBonusTest() {
    assertTrue(score.isExtraBonus());
  }
   
  @Test
   
   public void isReachedTest() {
    score.reached();
    assertTrue(score.getReached());
   
  }


}
