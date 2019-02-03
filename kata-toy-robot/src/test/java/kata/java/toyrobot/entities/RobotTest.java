package kata.java.toyrobot.entities;

import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertNotNull;

public class RobotTest {

    private Robot robot;

    @Before
    public void setup(){
        robot = new Robot(UUID.randomUUID(), new State(1, 2, Direction.NORTH));
    }

    @Test
    public void allArgsConstructorInstantiatesCorrectly(){
        assertNotNull(robot.getId());
        assertNotNull(robot.getState());
        assertEquals(1, robot.getState().getXCoordinate());
        assertEquals(2, robot.getState().getYCoordinate());
        assertEquals(Direction.NORTH, robot.getState().getDirection());
    }

    @Test
    public void setState(){
        State newState = new State(3, 4, Direction.EAST);
        robot.setState(newState);
        assertEquals(newState, robot.getState());
    }
}
