package kata.java.toyrobot.input;

import kata.java.toyrobot.entities.Direction;
import kata.java.toyrobot.entities.State;
import kata.java.toyrobot.commands.*;

import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputParser implements Function<String, Command> {

    private static final String PLACE = "PLACE";
    private static final Pattern PLACE_REGEX = Pattern.compile(PLACE + " (\\d+),(\\d+),(EAST|WEST|NORTH|SOUTH)");
    private static final String MOVE = "MOVE";
    private static final String LEFT = "LEFT";
    private static final String RIGHT = "RIGHT";
    private static final String REPORT = "REPORT";

    @Override
    public Command apply(String inputString){

        if (inputString.startsWith("PLACE"))
            return getPlaceCommand(inputString);

        switch (inputString){
            case MOVE:
                return new MoveCommand();
            case LEFT:
                return new LeftCommand();
            case RIGHT:
                return new RightCommand();
            case REPORT:
                return new ReportCommand();
            default:
                System.out.println("Unknown command");
        }

        return null;
    }

    private Command getPlaceCommand(String commandString) {
        Matcher matcher = PLACE_REGEX.matcher(commandString);
        if (matcher.matches()) {
            return new PlaceCommand(
                    new State(Integer.parseInt(matcher.group(1)),
                    Integer.parseInt(matcher.group(2)),
                    Direction.valueOf(matcher.group(3))
            ));
        }
        return null;
    }
}
