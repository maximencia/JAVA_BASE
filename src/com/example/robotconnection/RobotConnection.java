package com.example.robotconnection;

import com.example.robotconnection.RobotConnectionException;

/**

 */
public interface RobotConnection extends AutoCloseable {
    @Override
    void close() throws RobotConnectionException;

    void moveRobotTo(int x, int y) throws RobotConnectionException;
}
