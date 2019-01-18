package kata.java.toyrobot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class State {

    private int xCoordinate;
    private int yCoordinate;
    private Direction direction;

    @Override
    public String toString() {
        return xCoordinate +"," + yCoordinate + "," + direction.name();
    }
}
