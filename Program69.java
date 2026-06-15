import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program69 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "Flutter");
        map.put(4, "Dart");
        List<Integer> keyList = new ArrayList(map.keySet());
        List<String> valeList = new ArrayList(map.values());
        System.out.println("Key List: " + keyList);
        System.out.println("Value List: " + valeList);
    }
}
