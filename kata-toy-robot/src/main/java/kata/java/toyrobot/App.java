package kata.java.toyrobot;

import kata.java.toyrobot.commands.ReportCommand;
import kata.java.toyrobot.entities.Boundary;
import kata.java.toyrobot.entities.Robot;
import kata.java.toyrobot.input.InputParser;
import kata.java.toyrobot.input.InputReader;
import kata.java.toyrobot.process.RobotCommandProcessor;

import java.util.ResourceBundle;
import java.util.UUID;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ResourceBundle config = ResourceBundle.getBundle("application");

    public static void main( String[] args )
    {
        Robot robot = new Robot(UUID.randomUUID(), null, createBoundary(), null);
        new InputReader().readInput(args[0]).stream()
                .map(new InputParser())
                .map(c -> new RobotCommandProcessor().apply(robot, c))
                .filter(robot1 -> robot1.getLastCommand() instanceof ReportCommand)
                .forEach(robot1 -> System.out.println(robot1.getCurrentState() == null ? robot1.getId() +
                        " Not placed yet!" : robot1.getCurrentState()));
    }


    private static int readConfig(String key)
    {
        return Integer.parseInt(config.getString(key));
    }

    public static Boundary createBoundary(){
        return new Boundary(readConfig("minX"), readConfig("maxX"), readConfig("minY"),
                readConfig("maxY"));
    }
}
