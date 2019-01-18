package kata.java.toyrobot.commands;

import kata.java.toyrobot.entities.State;

public interface Command {

    State execute(State currentState);
}
