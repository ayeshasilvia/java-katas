package kata.java.toyrobot.commands;


import kata.java.toyrobot.entities.State;

public class ReportCommand implements Command {

    public State execute(State currentState) {
        System.out.println(currentState);
        return currentState;
    }
}
