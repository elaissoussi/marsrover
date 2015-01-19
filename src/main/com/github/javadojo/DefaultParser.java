package com.github.javadojo;

import java.util.ArrayList;
import java.util.List;

public class DefaultParser implements MarsRoverParser {

    @Override
    public List<Command> parseCommands(String operations) {
        List<Command> commands = new ArrayList<Command>();
        Command lastCommand = CommandFactory.createCommand(operations.charAt(0), new WestEastDirection());
        for (int currentComandIndex = 1; currentComandIndex < operations.length(); currentComandIndex++) {
            Command newCommand = CommandFactory.createCommand(operations.charAt(currentComandIndex), lastCommand);
            commands.add(newCommand);
            lastCommand = newCommand;

        }
        return commands;
    }
}
