package com.github.javadojo;

public class PathFactory {

    public static Path createPath(Command currentCommand) {
        if (currentCommand instanceof DriveStraightLine)
            return new WestEastDirection();
        return null;
    }

}
