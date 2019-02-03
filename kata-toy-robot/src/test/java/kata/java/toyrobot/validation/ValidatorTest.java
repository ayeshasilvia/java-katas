package kata.java.toyrobot.validation;

import kata.java.toyrobot.entities.Boundary;
import kata.java.toyrobot.entities.Direction;
import kata.java.toyrobot.entities.State;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {
    private Boundary boundary;

    @Before
    public void setup(){
        boundary = new Boundary(5, 5);
    }

    @Test
    public void checkValidatorWithOutOfBoundaryState() {
        State state = new State(5, 6, Direction.NORTH);
        assertFalse(Validator.validate(boundary, state));
    }

    @Test
    public void checkValidatorWithInsideBoundaryState() {
        State state = new State(4, 4, Direction.NORTH);
        assertTrue(Validator.validate(boundary, state));
    }
}