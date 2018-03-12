
package com.example.robotconnection;

public class MoveConnectionRobot {
	public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY)
			throws RobotConnectionException {
		boolean con = false;
		for (int i = 0; !con && (i < 3); i++) {
			try (RobotConnection connection = robotConnectionManager.getConnection()) {
				connection.moveRobotTo(toX, toY);
				con = true;
			} catch (RobotConnectionException e) {
			}
		}
		if (!con) {
			throw new RobotConnectionException("3 connection failed");
		}
	}
}
