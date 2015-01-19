package com.github.javadojo;

import java.util.ArrayList;
import java.util.List;

public class DefaultParser implements MarsRoverParser {

    @Override
    public List<Command> parseCommands(String operations) {
        List<Command> commands = new ArrayList<Command>();
        for (int currentComandIndex = 0; currentComandIndex < operations.length(); currentComandIndex++) {
            Command newCommand = CommandFactory.createCommand(operations.charAt(currentComandIndex));
            commands.add(newCommand);
            
        }
        return commands;
    }

}
