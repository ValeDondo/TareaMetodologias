package com.cc3201.breakout.gui;

import com.almasb.ents.Entity;
import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.audio.Music;
import com.almasb.fxgl.entity.Entities;
import com.almasb.fxgl.entity.GameEntity;
import com.almasb.fxgl.entity.component.CollidableComponent;
import com.almasb.fxgl.entity.component.TypeComponent;
import com.almasb.fxgl.input.ActionType;
import com.almasb.fxgl.input.Input;
import com.almasb.fxgl.input.InputMapping;
import com.almasb.fxgl.input.OnUserAction;
import com.almasb.fxgl.input.UserAction;
import com.almasb.fxgl.parser.EntityFactory;
import com.almasb.fxgl.settings.GameSettings;
import com.cc3002.breakout.facade.HomeworkTwoFacade;
import com.cc3002.breakout.logic.Game;
import com.cc3002.breakout.logic.brick.IBrick;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;
/**
 * interfaz.
 * @author vale.
 *
 */

public class Myfxgapp extends GameApplication {
  private GameEntity player;
  
  private IntegerProperty pixelsMoved;
  
  private HomeworkTwoFacade game;
  
  
  
  @Override
  
  protected void initAssets() {
    
  }

  @Override
  protected void initGame() {
   
    
    game = new HomeworkTwoFacade(); 
    

    initBackground();
    initScreenBounds();
    initNivel();
   
    initBrick();
    
    initBall();
    initPlayerBat();
    
    
    
  }
  
  
  
    
  private void initNivel() {
     
    game.newLevelWithSoftAndStoneBricks("Nivel1", 32, 0.6);
    
     
  }
  
  private void initBrick() {
    int contx = 0;
    int conty = 0;
    
    for ( IBrick brick : game.getBricks()) {
     
      Entity bricks = BreakoutFactory.newBrick(brick,contx,conty);
      contx++;
      if ( contx == 16) {
        conty++;
        contx = 0;
      }
      
      getGameWorld().addEntity(bricks);
    }
   
    
    
  }
  
  private void initScreenBounds() {
    Entity walls = Entities.makeScreenBounds(150);
    walls.addComponent(new TypeComponent(EntityType.WALL));
    walls.addComponent(new CollidableComponent(true));

    getGameWorld().addEntity(walls);
 }
  
  private BatControl playerBat;

  private void initPlayerBat() {
    Entity bat = BreakoutFactory.newBat(500,350);
    getGameWorld().addEntity(bat);

    playerBat = bat.getControlUnsafe(BatControl.class);
  }

  @Override
  protected void initInput() {
    Input input = getInput(); // get input service
    
    input.addInputMapping(new InputMapping("left", KeyCode.A));
    input.addInputMapping(new InputMapping("right",KeyCode.D));
    
    
  } 
  
  @OnUserAction(name = "left", type = ActionType.ON_ACTION)
  
  public void left() {
    playerBat.left();
 
  }
  
  @OnUserAction(name = "left", type = ActionType.ON_ACTION_END)
  
  public void stopBat() {
    
    playerBat.stop();
  }
  /**
   * right.
   */
  
  @OnUserAction(name = "right", type = ActionType.ON_ACTION)
  
  public void right() {
    
    playerBat.right();
  
  }
  
  /**
   * right.
   */
  
@OnUserAction(name = "right", type = ActionType.ON_ACTION_END)
  
  public void stopBat2() {
    
    playerBat.stop();
  }
 
  @Override
  protected void initPhysics() {
   
    getPhysicsWorld().setGravity(0, 0);
    
    getPhysicsWorld().addCollisionHandler(new BallBrickHandler());
    
  }
  
  @Override
  protected void initUI() {
    Text textPixels = new Text();
  
    getGameScene().addUINode(textPixels); 

  }

  @Override
  protected void onUpdate(double arg0) {
    // TODO Auto-generated method stub

  }

  @Override
  protected void initSettings(GameSettings arg0) {
    arg0.setWidth(1000);
    arg0.setHeight(400);
    arg0.setTitle("BreakOut");
    arg0.setVersion("0.1");
    arg0.setIntroEnabled(false); // turn off intro
    arg0.setMenuEnabled(false);
    
    
  

  }
 
  private void initBall() {
    getGameWorld().addEntity(BreakoutFactory.newBall(getWidth() / 2 - 5, getHeight() / 2 - 5));
}


   
  private void initBackground() {
    
    GameEntity bg = new GameEntity();
    bg.getMainViewComponent().setView(new Rectangle(getWidth(), getHeight(), Color.LIGHTCORAL));

    getGameWorld().addEntity(bg);
}

  
  public static void main(String[] args) {
    launch(args);
   
  }

}
