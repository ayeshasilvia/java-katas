import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pack implements Comparable<Pack>{
    private Integer size;
    private double cost;

    @Override
    public String toString() {
        return size + " $" + cost;
    }

    @Override
    public int compareTo(Pack o) {
        if (o == null)
        {
            return 0;
        }
        return o.getSize().compareTo(this.getSize());
    }
}
