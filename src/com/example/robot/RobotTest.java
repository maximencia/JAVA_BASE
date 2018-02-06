package com.example.robot;

/**
 * Created by Maxim.Rumyantsev on 12/19/2017.
 */
import static org.junit.Assert.*;
import static com.example.robot.robot_class.Robot;
import static com.example.robot.robot_class.Direction;
import static com.example.robot.robot_class.moveRobot;
import static com.example.robot.robot_class.GetRandom;


/**
 * Created by vrs on 24/09/16.
 *
 * Add JUnit jar to the classpath
 * 1. File -> Project Structure -> Modules -> Dependencies
 * 2. Click + (Add) -> JARs or directories
 * 3. Add IntelliJ dir/Contents/lib -> junit 4
 * 4. (Optionally for OS X) Add IntelliJ dir/Contents/lib -> hamcrest-core
 *
 */
import static org.junit.Assert.*;

/**
 * Created by vrs on 24/09/16.
 *
 * Add JUnit jar to the classpath
 * 1. File -> Project Structure -> Modules -> Dependencies
 * 2. Click + (Add) -> JARs or directories
 * 3. Add IntelliJ dir/Contents/lib -> junit 4
 * 4. (Optionally for OS X) Add IntelliJ dir/Contents/lib -> hamcrest-core
 *
 */
public class RobotTest {
    @org.junit.Test
    public void getDirection() throws Exception {
        Robot bender = new Robot(0, 0, Direction.UP);
        assertEquals(Direction.UP, bender.getDirection());
    }

    @org.junit.Test
    public void getX() throws Exception {
        Robot robo = new Robot(0, 0, Direction.UP);
        assertEquals(0, robo.getX());
    }

    @org.junit.Test
    public void getY() throws Exception {
        Robot robo = new Robot(0, 0, Direction.UP);
        assertEquals(0, robo.getY());
    }

    @org.junit.Test
    public void turnLeft() throws Exception {
        Robot robo = new Robot(0, 0, Direction.DOWN);
        robo.turnLeft();
        assertEquals(Direction.RIGHT, robo.getDirection());
    }

    @org.junit.Test
    public void turnRight() throws Exception {
        Robot robo = new Robot(0, 0, Direction.RIGHT);
        robo.turnRight();
        assertEquals(Direction.DOWN, robo.getDirection());
    }

    @org.junit.Test
    public void stepForward() throws Exception {
        Robot robo = new Robot(0, 0, Direction.RIGHT);
        robo.stepForward();
        assertEquals(1, robo.getX());
    }

    @org.junit.Test
    public void moveRobotZeroToUpperRight() throws Exception {
        Robot robo = new Robot(0, 0, Direction.UP);
        moveRobot(robo, 3, 3);
        assertEquals(robo.getX(), 3);
        assertEquals(robo.getY(), 3);
        assertEquals(Direction.UP, robo.getDirection());
    }
//
    @org.junit.Test
    public void moveRobotZeroToUp() throws Exception {
        Robot robo = new Robot(0, 0, Direction.UP);
        moveRobot(robo, 3, 0);
        assertEquals(robo.getX(), 3);
        assertEquals(robo.getY(), 0);
        assertEquals(Direction.RIGHT, robo.getDirection());
    }
//
    @org.junit.Test
    public void moveRobotZeroToLowerLeft() throws Exception {
        Robot robo = new Robot(0, 0, Direction.UP);
        moveRobot(robo, -3, -3);
        assertEquals(robo.getX(), -3);
        assertEquals(robo.getY(), -3);
        assertEquals(Direction.DOWN, robo.getDirection());
    }

    @org.junit.Test
    public void moveRobotSamePosition() throws Exception {
        Robot android = new Robot(-10, -5, Direction.DOWN);
        moveRobot(android, -10, -5);
        assertEquals(android.getX(), -10);
        assertEquals(android.getY(), -5);
        assertEquals(Direction.DOWN, android.getDirection());
    }

    @org.junit.Test
    public void moveRobotZeroToLowerRight() throws Exception {
        Robot robo = new Robot(0, 0, Direction.UP);
        moveRobot(robo, 1, -3);
        assertEquals(robo.getX(), 1);
        assertEquals(robo.getY(), -3);
        assertEquals(Direction.DOWN, robo.getDirection());

    }

    @org.junit.Test
    public void moveRobotLeftStrictly() throws Exception {
        Robot robo = new Robot(10, 5, Direction.RIGHT);
        moveRobot(robo, 0, 5);
        assertEquals(robo.getX(), 0);
        assertEquals(robo.getY(), 5);
        assertEquals(Direction.LEFT, robo.getDirection());
    }

    @org.junit.Test
    public void moveRobotRightStrictly() throws Exception {
        Robot robo = new Robot(0, 5, Direction.DOWN);
        moveRobot(robo, 10, 5);
        assertEquals(robo.getX(), 10);
        assertEquals(robo.getY(), 5);
        assertEquals(Direction.RIGHT, robo.getDirection());
    }

    @org.junit.Test
    public void moveRobotUpStrictly() throws Exception {
        Robot robo = new Robot(0, 5, Direction.DOWN);
        moveRobot(robo, 0, 15);
        assertEquals(robo.getX(), 0);
        assertEquals(robo.getY(), 15);
        assertEquals(Direction.UP, robo.getDirection());
    }

    @org.junit.Test
    public void moveRobotDownStrictly() throws Exception {
        Robot robo = new Robot(0, 15, Direction.LEFT);
        moveRobot(robo, 0, 5);
        assertEquals(robo.getX(), 0);
        assertEquals(robo.getY(), 5);
        assertEquals(Direction.DOWN, robo.getDirection());
    }
    @org.junit.Test
    public void moveRobotZeroZerToZeroZero() throws Exception {
        Robot robo = new Robot(0, 0, Direction.RIGHT);
        moveRobot(robo, 0, 0);
        //assertEquals(robo.getX(), 0);
        //assertEquals(robo.getY(), 0);
        assertEquals(Direction.RIGHT, robo.getDirection());
    }
    @org.junit.Test
    public void moveRobotRandom() throws Exception {
        Robot robo = new Robot(GetRandom(20),GetRandom(20), Direction.RIGHT);
        moveRobot(robo, 0, 0);
        assertEquals(robo.getX(), 0);
        assertEquals(robo.getY(), 0);
    }
}
