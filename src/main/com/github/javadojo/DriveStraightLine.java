package com.github.javadojo;


public class DriveStraightLine extends Command {

    public DriveStraightLine(Path currentDirection) {
        super(currentDirection);
    }

    public DriveStraightLine(Command lastCommand) {
        super(lastCommand.currentdirection);
    }

}
