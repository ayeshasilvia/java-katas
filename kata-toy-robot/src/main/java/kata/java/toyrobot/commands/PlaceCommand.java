package kata.java.toyrobot.commands;

import kata.java.toyrobot.entities.State;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlaceCommand implements Command {

    private State state;

    public State execute(State currentState) {
        return this.state;
    }
}
