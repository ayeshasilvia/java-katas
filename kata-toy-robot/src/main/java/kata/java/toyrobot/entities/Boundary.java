package kata.java.toyrobot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Boundary {

    private int minX;
    private int maxX;
    private int minY;
    private int maxY;
}
