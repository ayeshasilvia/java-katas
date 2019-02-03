package kata.java.toyrobot.entities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StateTest {

    private State state;

    @Before
    public void setup(){
        state = new State(1, 3, Direction.EAST);
    }

    @Test
    public void allArgsConstructorInstantiatesCorrectly(){
        assertEquals(1, state.getXCoordinate());
        assertEquals(3, state.getYCoordinate());
        assertEquals(Direction.EAST, state.getDirection());
    }

    @Test
    public void setXCoordinateWorks(){
        state.setXCoordinate(4);
        assertEquals(4, state.getXCoordinate());
    }

    @Test
    public void setYCoordinateWorks(){
        state.setYCoordinate(4);
        assertEquals(4, state.getYCoordinate());
    }

    @Test
    public void setDirectionWorks(){
        state.setDirection(Direction.NORTH);
        assertEquals(Direction.NORTH, state.getDirection());
    }

}
