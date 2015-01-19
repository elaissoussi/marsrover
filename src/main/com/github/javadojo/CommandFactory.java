package com.github.javadojo;

public class CommandFactory {

    public static Command createCommand(char commandChar) {
        if (commandChar == 's')
            return new DriveStraightLine();
        return null;
    }

}
