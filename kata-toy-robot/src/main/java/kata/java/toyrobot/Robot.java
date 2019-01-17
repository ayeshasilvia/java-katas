package kata.java.toyrobot;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Robot {
    private String id;
    private State currentState;
    private Boundary boundary;
}
