package com.github.javadojo;


public class DefaultPrinter implements MarsRoverPrinter {

    @Override
    public String print(PathMarsRover paths, String lineSeparator) {
        return paths.print(lineSeparator);
    }

}
