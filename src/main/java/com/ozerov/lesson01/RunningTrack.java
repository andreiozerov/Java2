package com.ozerov.lesson01;

import com.ozerov.lesson01.interfaces.Obstacle;
import com.ozerov.lesson01.interfaces.Participant;

public class RunningTrack implements Obstacle {
    private String name = "Беговая дорожка";
    private int distance;

    public RunningTrack(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void action(Participant participant) {
        participant.run();
    }

    @Override
    public boolean isAnObstaclePassing(Participant participant) {
        return (participant.getMaxDistance() > distance);
    }
}
