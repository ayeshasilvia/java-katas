package kata.java.toyrobot.commands;

import kata.java.toyrobot.entities.Direction;
import kata.java.toyrobot.entities.State;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RightCommandTest {

    private Command rightCommand;

    @Before
    public void setup()
    {
        rightCommand = new RightCommand();
    }

    @Test
    public void execute() {
        State currentState = new State(1, 4, Direction.EAST);
        State actual = rightCommand.execute(currentState);
        assertEquals(new State(1, 4, Direction.SOUTH), actual);
    }
}