package com.ozerov.lesson01.interfaces;

public interface Participant extends Runner, Jumper {
    String getName();

    int getMaxDistance();

    int getMaxHeight();
}
