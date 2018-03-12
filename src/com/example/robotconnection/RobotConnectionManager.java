package com.example.robotconnection;

/**

 */
public interface RobotConnectionManager {
    RobotConnection getConnection() throws RobotConnectionException;
}
