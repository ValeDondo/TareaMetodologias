package test;

import com.cc3002.breakout.facade.HomeworkTwoFacade;
import com.cc3002.breakout.logic.bonus.IBonus;
import com.cc3002.breakout.logic.level.ILevel;
import org.junit.Before;



import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class HomeworkTwoFacadeTest {

  private transient HomeworkTwoFacade game;
  private transient ILevel level;

  /**
   * inicializar variables.
   */
  @Before

  public void setUp() {
    game = new HomeworkTwoFacade();
    level = game.newLevelWithSoftAndStoneBricks("nivel 1", 32, 1);
    game.setCurrentLevel(level);
  }

  /**
   * Test constructor.
   */

  @Test

  public void constructorTest() {

    HomeworkTwoFacade games = new HomeworkTwoFacade();

    assertNotNull(games);

  }

  @Test

  public void earnedScoreTest() {
    assertEquals(0, game.earnedScore());
  }

  @Test

  public void setCurrentLevelTest() {
    game.setCurrentLevel(level);
    assertEquals("nivel 1",game.getCurrentLevel().getName());
  
  }

  @Test

  public void lossOfHeartTest() {
    assertEquals(3, game.getNumberOfHearts());
    assertEquals(2, game.lossOfHeart());
    assertEquals(1, game.lossOfHeart());
    assertEquals(0, game.lossOfHeart());

  }

  @Test


  /**
   * TEST .
   */
  public void newLevelWithFoftAndStoneBricksTest() {
    ILevel nivel = game.newLevelWithSoftAndStoneBricks("Nivel1", 5, 0.5);
    assertNotNull(nivel);
    assertEquals(5, nivel.numberOfBricks());
    assertEquals("Nivel1", nivel.getName());
  }

  @Test
  public void newBonusesTes() {
    assertEquals(3, game.newBonuses(3, 0.4).size());
  }

  @Test

  public void hasCurrentLevelTest() {

    assertFalse(game.getCurrentLevel().isNull());
    assertTrue(game.hasCurrentLevel());



  }

  @Test

  public void registerBonusesTest() {
    List<IBonus> bonus = game.newBonuses(14, 0.5);
    game.registerBonuses(bonus);
    assertEquals(bonus, level.getBonus());

  }

  @Test

  public void getNumberOfHeartsTest() {
    assertEquals(3, game.getNumberOfHearts());
    game.lossOfHeart();
    assertEquals(2, game.getNumberOfHearts());
    game.lossOfHeart();
    assertEquals(1, game.getNumberOfHearts());
    game.lossOfHeart();
    assertEquals(0, game.getNumberOfHearts());


  }

  @Test
  public void hasNextLevelTest() {

    assertFalse(game.hasNextLevel());
  }

  @Test
  public void getLevelNameTest() {
    assertEquals(level.getName(), game.getLevelName());
  }

  @Test

  public void getRequiredPointsTest() {
    long puntos = Math.round(0.7 * level.getPuntaje());
    assertEquals(puntos, game.getRequiredPoints());

  }

  @Test

  public void spawnBricksTest() {
    
    String string = System.lineSeparator() + "################" + System.lineSeparator()
        + "################" + System.lineSeparator();
    // String string2= "\n****************\n****************\n";

    assertTrue(string.equals(game.spawnBricks(level)));

    // assertTrue(string2.equals(game.spawnBricks(level)));
  }


  @Test

  public void getBricks() {
    ILevel newLevel = game.getCurrentLevel();

    assertEquals(newLevel.getBricks(), game.getBricks());
  }

  @Test

  public void newExtraScoreTest() {
    IBonus bonus = game.newExtraScore();
    assertNotNull(bonus);
  }

  @Test

  public void newExtraHearTest() {
    IBonus bonus = game.newExtraHeart();
    assertNotNull(bonus);
  }

  @Test

  public void newScoreDiscountTest() {
    IBonus bonus = game.newScoreDiscount();
    assertNotNull(bonus);
  }

  @Test

  public void newHeartDiscountTest() {
    IBonus bonus = game.newHeartDiscount();
    assertNotNull(bonus);
  }

  @Test

  public void getCurrentLevelTest() {

    assertEquals(level, game.getCurrentLevel());
  }

  @Test

  public void setNextLevelTest() {
    level.setNextLevel(level);

    assertEquals(level, game.getCurrentLevel());
  }
  
  @Test
  public void numberOfbricksTest() {
    assertEquals(32, game.numberOfBricks());
  }
  
  
 
  
 
}
