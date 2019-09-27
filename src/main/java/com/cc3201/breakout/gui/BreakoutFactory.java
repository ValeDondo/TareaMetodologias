package com.cc3201.breakout.gui;

import com.almasb.ents.Entity;
import com.almasb.fxgl.parser.EntityFactory;
import com.almasb.fxgl.entity.Entities;
import com.almasb.fxgl.entity.EntityView;
import com.almasb.fxgl.entity.GameEntity;
import com.almasb.fxgl.entity.component.CollidableComponent;
import com.almasb.fxgl.physics.BoundingShape;
import com.almasb.fxgl.physics.HitBox;
import com.almasb.fxgl.physics.PhysicsComponent;
import com.cc3002.breakout.logic.brick.IBrick;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import org.jbox2d.dynamics.BodyType;
import org.jbox2d.dynamics.FixtureDef;
public class BreakoutFactory  extends EntityFactory {

  public BreakoutFactory() {
    super('0');
    
  }
 /**
  * 
  * @param x.
  * @param y.
  * 
  */
 
  public static Entity newBall(double x, double y) {
    GameEntity bola = new GameEntity();
    bola.getTypeComponent().setValue(EntityType.BALL);
    bola.getPositionComponent().setValue(x, y);
    bola.getBoundingBoxComponent().addHitBox(new HitBox("BODY", BoundingShape.circle(5)));
     
    bola.getMainViewComponent().setView(new Circle(7, Color.DARKBLUE));
     
    final PhysicsComponent bolaPhysics = new PhysicsComponent();
    bolaPhysics.setBodyType(BodyType.DYNAMIC);
     
    FixtureDef def = new FixtureDef();
    def.setDensity(0.5f);
    def.setRestitution(1.0f);
     
    bolaPhysics.setFixtureDef(def);
    bolaPhysics.setOnPhysicsInitialized(new Runnable() {
     
      public void run() {
          bolaPhysics.setLinearVelocity(5 * 60, -5 * 60);
      }
    });
     
    bola.addComponent(bolaPhysics);
    bola.addComponent(new CollidableComponent(true));
    bola.addControl(new BallControl());
     
    return bola;
   
  }
  /**
    * construye new bat.
    * @param x.
    * @param y.
    */
  
  public static Entity newBat(double xpos , double ypos) {
     
    GameEntity carrito = new GameEntity();
     
    carrito.getPositionComponent().setValue(xpos,ypos);
    carrito.getMainViewComponent().setView(new EntityView(new Rectangle(200, 25, Color.CRIMSON)),true);
    PhysicsComponent carritoPhysics = new PhysicsComponent();
    carritoPhysics.setBodyType(BodyType.KINEMATIC);
    carrito.addComponent(carritoPhysics);
    carrito.addComponent(new CollidableComponent(true));
    carrito.addControl(new BatControl());
     
    return carrito;
    
    
    

  }
  /**
    * construye.
    * @param brick.
    * @param xposition.
    * @param yposition.
    */
   
  public static Entity newBrick(IBrick brick, double xposition,double yposition){
     
    final GameEntity ladrillo = new GameEntity();
       
    final PhysicsComponent brickPhysics = new PhysicsComponent();
       
    brickPhysics.setBodyType(BodyType.STATIC);
       
    final FixtureDef def = new FixtureDef();
       
    def.setFriction(0);
    def.setDensity(0);
    def.setRestitution(0);
    brickPhysics.setFixtureDef(def);
       
       
    ladrillo.getTypeComponent().setValue(EntityType.BRICK);
    ladrillo.getPositionComponent().setValue(xposition * 101,yposition * 26);
       
       
    if (brick.isSoftBrick()) {
      ladrillo.getMainViewComponent()
        .setView(new EntityView(new Rectangle(100,25,Color.AQUA)),true);  
    } else 
      if (brick.isStoneBrick()) {
        ladrillo.getMainViewComponent()
          .setView(new EntityView(new Rectangle(100,25,Color.BEIGE)),true);
      }
        
    ladrillo.addComponent(brickPhysics);
    ladrillo.addComponent(new CollidableComponent(true));
       
   
   
    return ladrillo;
  }
}