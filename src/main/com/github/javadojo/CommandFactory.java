package com.github.javadojo;

public class CommandFactory {

    public static Command createCommand(char commandChar, Path direction) {
        if (commandChar == 's')
            return new DriveStraightLine(direction);
        if (commandChar == 'l')
            return new TurnLeft(direction);
        return null;
    }

    public static Command createCommand(char commandChar, Command lastCommand) {

        if (commandChar == 's')
            return new DriveStraightLine(lastCommand);
        if (commandChar == 'l')
            return new TurnLeft(lastCommand);
        return null;
    }

}
