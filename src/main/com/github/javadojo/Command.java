package com.github.javadojo;

public abstract class Command {

    protected Path currentdirection;

    public Command(Path currentDirection) {
        this.currentdirection = currentDirection;
        
    }

    public Path currentdirection() {
        return currentdirection;
    }
    
    
}
