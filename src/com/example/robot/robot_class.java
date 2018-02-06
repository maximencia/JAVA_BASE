package com.example.robot;

/**
 * Created by Maxim.Rumyantsev on 12/19/2017.
 */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.math.*;
import java.util.Arrays;
import java.util.Random;

public class robot_class {
    public static void main(String[] args) {

        Robot robot = new Robot(GetRandom(20),GetRandom(20), Direction.DOWN);
        moveRobot(robot, -10, 20);
    }

    public static int GetRandom(int max)
    { Random r = new Random();
    return r.nextInt(max) - r.nextInt(max) + 10;
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot (int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {return dir;}

        public int getX() {return x;}

        public int getY() {return y;}

        public void turnLeft() {
            if      (dir == Direction.UP)    {dir = Direction.LEFT;}
            else if (dir == Direction.DOWN)  {dir = Direction.RIGHT;}
            else if (dir == Direction.LEFT)  {dir = Direction.DOWN;}
            else if (dir == Direction.RIGHT) {dir = Direction.UP;}
        }

        public void turnRight() {
            if      (dir == Direction.UP)    {dir = Direction.RIGHT;}
            else if (dir == Direction.DOWN)  {dir = Direction.LEFT;}
            else if (dir == Direction.LEFT)  {dir = Direction.UP;}
            else if (dir == Direction.RIGHT) {dir = Direction.DOWN;}
        }

        public void stepForward() {
            if (dir == Direction.UP)    {y++;}
            if (dir == Direction.DOWN)  {y--;}
            if (dir == Direction.LEFT)  {x--;}
            if (dir == Direction.RIGHT) {x++;}
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        // перенос начало координат
        int xx,yy;
        xx=toX-robot.getX();
        yy=toY-robot.getY();
        System.out.print("ROBOT now in getX="+robot.getX()+"   getY="+robot.getY()+"\n");
        System.out.print("Point to go toX="+toX+"   toY="+toY+"\n");
        System.out.print("New point xx="+xx+"   yy="+yy+"\n");


        if (xx>0) {
            while (robot.getDirection() != Direction.RIGHT)
            {robot.turnLeft();}
            for (int i = 1; i <= xx; i++){
                robot.stepForward();
                System.out.print("ROBOT now in getX="+robot.getX()+"   getY="+robot.getY()+"\n");
            };
            System.out.println(robot.getDirection());
        }
        if (xx<0)  {
            while (robot.getDirection() != Direction.LEFT)
            {robot.turnLeft();}
            for (int i = 1; i <= Math.abs(xx); i++){
                robot.stepForward();
                System.out.print("ROBOT now in getX="+robot.getX()+"   getY="+robot.getY()+"\n");
            };
            System.out.println(robot.getDirection());
        }

        if (yy>0) {
            //смотрим наверх
            while (robot.getDirection() != Direction.UP)
            {robot.turnLeft();}
            for (int i = 1; i <= yy; i++){
                robot.stepForward();
                System.out.print("ROBOT now in getX="+robot.getX()+"   getY="+robot.getY()+"\n");
            };
            System.out.println(robot.getDirection());
        }
        if (yy<0)  {
            while (robot.getDirection() != Direction.DOWN)
            {robot.turnLeft();}
            for (int i = 1; i <= Math.abs(yy); i++){
                robot.stepForward();
                System.out.print("ROBOT now in getX="+robot.getX()+"   getY="+robot.getY()+"\n");
            };
            System.out.println(robot.getDirection());
        }
        System.out.print("ROBOT now in getX="+robot.getX()+"   getY="+robot.getY()+"\n");
        System.out.print("ROBOT direction="+robot.getDirection()+"\n");




        //перенесем робота в начало координат

    }

}