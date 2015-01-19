package com.github.javadojo;

public class TurnLeft extends Command {

    public TurnLeft(Path currentDirection) {
         
        super(currentDirection instanceof WestEastDirection ? new NorthSouth() : new WestEastDirection());
    }

    public TurnLeft(Command lastCommand) {
        super(lastCommand.currentdirection instanceof WestEastDirection ? new NorthSouth() : new WestEastDirection());
    }

}
