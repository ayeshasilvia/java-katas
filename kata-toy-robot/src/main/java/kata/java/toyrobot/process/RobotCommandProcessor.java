package kata.java.toyrobot.process;

import kata.java.toyrobot.entities.Robot;
import kata.java.toyrobot.entities.State;
import kata.java.toyrobot.commands.Command;
import kata.java.toyrobot.commands.PlaceCommand;
import kata.java.toyrobot.validation.Validator;

import java.util.function.BiFunction;

public class RobotCommandProcessor implements BiFunction<Robot, Command, Robot> {

    @Override
    public Robot apply(Robot robot, Command command) {
        robot.setLastCommand(command);

        if (robot.getCurrentState() != null || command instanceof PlaceCommand){

            State newState = command.execute(robot.getCurrentState());

            if (Validator.validate(robot.getBoundary(), newState))
            {
                robot.setCurrentState(newState);
            }
        }

        return robot;
    }
}
