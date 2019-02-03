package kata.java.toyrobot.commands;

import kata.java.toyrobot.entities.Direction;
import kata.java.toyrobot.entities.State;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaceCommandTest {

    private Command placeCommand;
    private State state;

    @Before
    public void setup()
    {
        state = new State(1, 4, Direction.EAST);
        placeCommand = new PlaceCommand(state);
    }

    @Test
    public void execute() {
        State actual = placeCommand.execute(new State(1, 1, Direction.SOUTH));
        assertEquals(state, actual);
    }
}