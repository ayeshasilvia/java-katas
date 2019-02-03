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

    public Boundary(int maxX, int maxY){
        this.minX = 0;
        this.maxX = maxX;
        this.minY = 0;
        this.maxY = maxY;
    }
}
