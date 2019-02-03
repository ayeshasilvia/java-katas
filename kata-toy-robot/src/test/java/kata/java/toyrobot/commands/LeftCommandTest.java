package kata.java.toyrobot.commands;


import kata.java.toyrobot.entities.Direction;
import kata.java.toyrobot.entities.State;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeftCommandTest {

    private Command leftCommand;

    @Before
    public void setup()
    {
        leftCommand = new LeftCommand();
    }

    @Test
    public void execute() {
        State currentState = new State(1, 4, Direction.EAST);
        State actual = leftCommand.execute(currentState);
        assertEquals(new State(1, 4, Direction.NORTH), actual);
    }
}