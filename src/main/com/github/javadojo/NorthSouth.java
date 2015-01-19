package com.github.javadojo;

import java.util.List;


public class NorthSouth implements Path {

  

    

    @Override
    public void print(List<String> pathsString, String lineSeparator) {
        pathsString.add(lineSeparator);   
        pathsString.add("|");        
    }

}
