package com.github.javadojo;

import java.util.ArrayList;
import java.util.List;

/**
 * The Mars rover is programmed to drive around Mars.
 * Its programming is very simple. The commands are the following:
 * <dl>
 *     <dt>s</dt>
 *     <dd>drive in a straight line</dd>
 *     <dt>r</dt>
 *     <dd>turn right</dd>
 *     <dt>l</dt>
 *     <dd>turn left</dd>
 * </dl>
 *
 * Note that the Mars rover always land at the <code>X</code> and starts by facing east.
 * 
 * The Mars rover can send a 2D string representation of its path back to Mission Control. The following character are
 * used with the following meanings:
 * <dl>
 *     <dt>X</dt>
 *     <dd>where the Mars rover landed</dd>
 *     <dt>*</dt>
 *     <dd>current position of the Mars rover</dd>
 *     <dt>-</dt>
 *     <dd>path in the west-east direction</dd>
 *     <dt>|</dt>
 *     <dd>path in the north-south direction</dd>
 *     <dt>+</dt>
 *     <dd>a place where the Mars rover turned or a crossroad</dd>
 *     <dt>S</dt>
 *     <dd>a place where a sample was taken</dd>
 * </dl>
 */
public class MarsRover {

    static final String LINE_SEPARATOR = System.getProperty("line.separator");
    List<Command> commands = new ArrayList<Command>();

    public MarsRover(String operations) {
        MarsRoverParser parser = new DefaultParser();
        commands = parser.parseCommands(operations);
    }

    public String path() {
        MarsRoverPrinter printer = new DefaultPrinter();
        PathMarsRover paths=new PathMarsRover(commands);
        return printer.print(paths,LINE_SEPARATOR);
    }

    public MarsRover turnLeft() {
        throw new IllegalStateException("Not implemented");
    }

    public MarsRover turnRight() {
        throw new IllegalStateException("Not implemented");
    }

    public MarsRover moveForward() {
        throw new IllegalStateException("Not implemented");
    }

    public MarsRover takeSample() {
        throw new IllegalStateException("Not implemented");
    }
}
