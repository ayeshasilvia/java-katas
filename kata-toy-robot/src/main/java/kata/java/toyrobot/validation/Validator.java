package kata.java.toyrobot.validation;

import kata.java.toyrobot.entities.Boundary;
import kata.java.toyrobot.entities.State;

public class Validator {

    public static boolean validate(Boundary boundary, State state)
    {
        if (state.getXCoordinate() >= boundary.getMinX() && state.getXCoordinate() <= boundary.getMaxX()
                && state.getYCoordinate() >= boundary.getMinY() && state.getYCoordinate() <= boundary.getMaxY())
            return true;
        else return false;
    }
}
