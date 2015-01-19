package com.github.javadojo;

import java.util.ArrayList;
import java.util.List;

public class PathMarsRover {

    private static final String MARS_ROVER_LANDED = "X";
    private static final String CURRENT_POSITION = "*";
    List<Path> paths = new ArrayList<Path>();

    public PathMarsRover(List<Command> commands) {
        for (Command currentCommand : commands) {
            Path path = currentCommand.currentdirection();
            paths.add(path);
        }
    }

    public String print(String lineSeparator) {
        List<String> pathsString = new ArrayList<String>();

        pathsString.add(MARS_ROVER_LANDED);
        for (Path path : paths) {
            path.print(pathsString, lineSeparator);
        }

        pathsString.add(CURRENT_POSITION);
        pathsString.add(lineSeparator);
        return String.join("", pathsString);
    }
}
