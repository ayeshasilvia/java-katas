import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.List;

@Data
@AllArgsConstructor
public class Item {
    private String code;
    private List<HashMap<Integer, Double>> packs;
}
