package com.cc3201.breakout.gui;

import com.almasb.ents.Entity;
import com.almasb.fxgl.app.FXGL;
import com.almasb.fxgl.app.ServiceType;
import com.almasb.fxgl.parser.EntityFactory;
import com.almasb.fxgl.physics.CollisionHandler;

public class BallBrickHandler extends CollisionHandler{


  public BallBrickHandler() {
    super(EntityType.BRICK, EntityType.BALL);
}

@Override
protected void onCollisionBegin(Entity bonus, Entity player) {
    bonus.removeFromWorld();

   

    FXGL.getService(ServiceType.AUDIO_PLAYER).playSound("discountReached.wav");
}




}

