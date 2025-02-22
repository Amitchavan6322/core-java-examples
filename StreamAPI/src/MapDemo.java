import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Amit");
        students.put(2, "Ashish");
        students.put(3, "Anita");
        students.put(4, "Sunita");
        students.put(5, "Vanita");

        Map<Integer, String> filteredMap = students.entrySet().stream()
                .parallel()
                .filter(student -> student.getValue().contains("V"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(filteredMap);
    }
}
