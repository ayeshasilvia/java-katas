package kata.java.toyrobot.entities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectionTest {

    @Test
    public void rotateLeftWorksOnEast()
    {
        assertEquals(Direction.NORTH, Direction.EAST.rotateLeft());
    }

    @Test
    public void rotateLeftWorksOnWest()
    {
        assertEquals(Direction.SOUTH, Direction.WEST.rotateLeft());
    }

    @Test
    public void rotateLeftWorksOnNorth()
    {
        assertEquals(Direction.WEST, Direction.NORTH.rotateLeft());
    }

    @Test
    public void rotateLeftWorksOnSouth()
    {
        assertEquals(Direction.EAST, Direction.SOUTH.rotateLeft());
    }

    @Test
    public void rotateRightWorksOnEast()
    {
        assertEquals(Direction.SOUTH, Direction.EAST.rotateRight());
    }

    @Test
    public void rotateRightWorksOnWest()
    {
        assertEquals(Direction.NORTH, Direction.WEST.rotateRight());
    }

    @Test
    public void rotateRightWorksOnNorth()
    {
        assertEquals(Direction.EAST, Direction.NORTH.rotateRight());
    }

    @Test
    public void rotateRightWorksOnSouth()
    {
        assertEquals(Direction.WEST, Direction.SOUTH.rotateRight());
    }
}
