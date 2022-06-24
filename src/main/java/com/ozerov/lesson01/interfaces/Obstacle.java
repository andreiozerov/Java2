package com.ozerov.lesson01.interfaces;

public interface Obstacle {
    void action(Participant participant);

    boolean isAnObstaclePassing(Participant participant);

    String getName();
}
