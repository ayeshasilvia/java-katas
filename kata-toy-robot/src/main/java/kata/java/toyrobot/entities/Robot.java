package kata.java.toyrobot.entities;

import kata.java.toyrobot.commands.Command;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class Robot {
    private UUID id;
    private State currentState;
    private Boundary boundary;
    private Command lastCommand;
}
