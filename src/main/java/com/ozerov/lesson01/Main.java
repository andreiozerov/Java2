package com.ozerov.lesson01;

import com.ozerov.lesson01.interfaces.Obstacle;
import com.ozerov.lesson01.interfaces.Participant;

public class Main {
    public static final int CAT_MAX_DISTANCE = 800;
    public static final int CAT_MAX_HEIGHT = 1;
    public static final int MAN_MAX_DISTANCE = 5_000;
    public static final int MAN_MAX_HEIGHT = 2;
    public static final int ROBOT_MAX_DISTANCE = 10_000;
    public static final int ROBOT_MAX_HEIGHT = 5;
    public static final int TRACK_DISTANCE = 1_000;
    public static final int WALL_HEIGHT = 2;
    public static final String DISQUALIFIED = " отстранен от дальнейших соревнований.";
    public static final String NOT = " не";
    public static final String PASSED_THE_OBSTACLE = " прошел препятствие ";
    public static final String POINT = ".";
    public static final String PREPARING_TO_OVERCOME_OBSTACLE = " готовится к преодолению препятствия ";
    public static final String SEPARATOR = "-------------------------------------------";

    public static void main(String[] args) {
        Cat cat = new Cat(CAT_MAX_DISTANCE, CAT_MAX_HEIGHT);
        Man man = new Man(MAN_MAX_DISTANCE, MAN_MAX_HEIGHT);
        Robot robot = new Robot(ROBOT_MAX_DISTANCE, ROBOT_MAX_HEIGHT);
        RunningTrack runningTrack = new RunningTrack(TRACK_DISTANCE);
        Wall wall = new Wall(WALL_HEIGHT);

        Participant[] participants = {man, cat, robot};
        Obstacle[] obstacles = {runningTrack, wall};

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                System.out.println(SEPARATOR);
                if (!passingAnObstacle(participant, obstacle)) {
                    System.out.println(participant.getName() + DISQUALIFIED);
                    break;
                }
            }
        }
    }

    private static boolean passingAnObstacle(Participant participant, Obstacle obstacle) {
        String participantName = participant.getName();
        String obstacleName = obstacle.getName();
        System.out.println(participantName + PREPARING_TO_OVERCOME_OBSTACLE + obstacleName + POINT);
        obstacle.action(participant);

        boolean result = obstacle.isAnObstaclePassing(participant);
        if (result) {
            System.out.println(participant.getName() + PASSED_THE_OBSTACLE + obstacleName + POINT);
        } else {
            System.out.println(participant.getName() + NOT + PASSED_THE_OBSTACLE + obstacleName + POINT);
        }
        return result;
    }
}
