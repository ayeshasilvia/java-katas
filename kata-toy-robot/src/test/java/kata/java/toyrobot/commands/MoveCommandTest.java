package kata.java.toyrobot.commands;

import kata.java.toyrobot.entities.Direction;
import kata.java.toyrobot.entities.State;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoveCommandTest {

    private Command moveCommand;

    @Before
    public void setup()
    {
        moveCommand = new MoveCommand();
    }

    @Test
    public void executeSucceedsWhenFacingEast() {
        State currentState = new State(1, 4, Direction.EAST);
        State actual = moveCommand.execute(currentState);
        assertEquals(new State(2, 4, Direction.EAST), actual);
    }

    @Test
    public void executeSucceedsWhenFacingWest() {
        State currentState = new State(0, 4, Direction.WEST);
        State actual = moveCommand.execute(currentState);
        assertEquals(new State(-1, 4, Direction.WEST), actual);
    }

    @Test
    public void executeSucceedsWhenFacingNorth() {
        State currentState = new State(1, 4, Direction.NORTH);
        State actual = moveCommand.execute(currentState);
        assertEquals(new State(1, 5, Direction.NORTH), actual);
    }

    @Test
    public void executeSucceedsWhenFacingSouth() {
        State currentState = new State(1, 4, Direction.SOUTH);
        State actual = moveCommand.execute(currentState);
        assertEquals(new State(1, 3, Direction.SOUTH), actual);
    }
}