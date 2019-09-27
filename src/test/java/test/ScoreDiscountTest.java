package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cc3002.breakout.logic.bonus.IBonus;
import com.cc3002.breakout.logic.bonus.ScoreDiscount;

public class ScoreDiscountTest {

  private transient IBonus score;
  
  
  
  @Before
  public void setUp()  {
    
    score = new ScoreDiscount(-3);
  }
  
  @Test
  
  public void constructorTest() {
    assertEquals(-3,score.getBonus());
  }
  
  @Test
  public void isDiscountTest() {
    assertTrue(score.isDiscount());
  }
  
  @Test
  public void isExtraBonusTest() {
    assertFalse(score.isExtraBonus());
  
  
  }
  
  @Test
  
  public void isReachedTest() {
    score.reached();
    assertTrue(score.getReached());
   
    
  }
  
  @Test
  
  public void print2Test() {
    
    
  }

}
