package com.example.robotconnection;

/**
 * Created by andrew on 16.01.17.
 */
public class RobotApp {

    public static void main(String[] args) {
        new RobotApp().moveRobot(new RobotConnectionManagerImpl(), 10, 10);
    }

    public static void moveRobot(RobotConnectionManager connectionManager, int toX, int toY){
        int tryCounter = 1;
        boolean Deal = false;
        while (!Deal  && tryCounter < 3){
            try(RobotConnection connection = connectionManager.getConnection()) {
                connection.moveRobotTo(toX, toY);
                Deal = true;
            } catch (RobotConnectionException ex){
               // System.out.println(tryCounter + " try...");
                tryCounter++;
            }
        }
        if (Deal){
            return;
        } else {
            throw new RobotConnectionException("Number of attempts is null!");
        }
    }

}
