package kata.java.toyrobot.commands;

import kata.java.toyrobot.State;

public class LeftCommand implements Command {

    public State execute(State currentState) {
        return new State(currentState.getXCoordinate(), currentState.getYCoordinate(), currentState.getDirection().rotateLeft());
    }
}
