package kata.java.toyrobot.commands;

import kata.java.toyrobot.State;

public interface Command {

    State execute(State currentState);
}
