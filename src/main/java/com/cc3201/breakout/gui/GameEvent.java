package com.cc3201.breakout.gui;

import javafx.event.Event;
import javafx.event.EventType;

public class GameEvent extends Event {

  
  private static final long serialVersionUID = -4399815299034287818L;

  public static final EventType<GameEvent> ANY =
          new EventType<GameEvent>(Event.ANY, "GAME_EVENT");

  public static final EventType<GameEvent> BRICK_GOT_HIT =
          new EventType<GameEvent>(ANY, "BRICK_GOT_HIT");

  public static final EventType<GameEvent> ENEMY_KILLED =
          new EventType<GameEvent>(ANY, "ENEMY_KILLED");

  public static final EventType<GameEvent> ENEMY_REACHED_END =
          new EventType<GameEvent>(ANY, "ENEMY_REACHED_END");

  public GameEvent(EventType<? extends Event> eventType) {
      super(eventType);
  }
}
