package com.ozerov.lesson01;

import com.ozerov.lesson01.interfaces.Obstacle;
import com.ozerov.lesson01.interfaces.Participant;

public class Wall implements Obstacle {
    private String name = "Стена";
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void action(Participant participant) {
        participant.jump();
    }

    @Override
    public boolean isAnObstaclePassing(Participant participant) {
        return (participant.getMaxDistance() > height);
    }
}
