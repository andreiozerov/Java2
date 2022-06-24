package com.ozerov.lesson01;

import com.ozerov.lesson01.interfaces.Participant;

public class Robot implements Participant {
    private final String name = "Робот";
    private final int maxDistance;
    private final int maxHeight;

    public Robot(int maxDistance, int maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    @Override
    public void jump() {
        System.out.println(this.name + " прыгает.");
    }

    @Override
    public void run() {
        System.out.println(this.name + " бежит.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxDistance() {
        return maxDistance;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }
}
