package com.github.javadojo;

import java.util.List;

public class WestEastDirection implements Path {

    @Override
    public void print(List<String> pathsString, String lineSeparator) {
        pathsString.add("-");
    }

}
