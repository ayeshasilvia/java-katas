package kata.java.toyrobot.commands;

import kata.java.toyrobot.State;


public class MoveCommand implements Command {

    public State execute(State currentState) {
        switch (currentState.getDirection()){
            case WEST:
                return new State(currentState.getXCoordinate()-1, currentState.getYCoordinate(), currentState.getDirection());
            case EAST:
                return new State(currentState.getXCoordinate()+1, currentState.getYCoordinate(), currentState.getDirection());
            case NORTH:
                return new State(currentState.getXCoordinate(), currentState.getYCoordinate()+1, currentState.getDirection());
            case SOUTH:
                return new State(currentState.getXCoordinate(), currentState.getYCoordinate()-1, currentState.getDirection());
            default:
                return currentState;
        }

    }
}
