import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<String> students = Arrays.asList("Amit", "Ashish", "Sunita", "Vanita", "Anita");

        List<String> filteredList = students.stream()
                .parallel()
                .filter(student -> student.contains("V"))
                .toList();
        System.out.println(filteredList);
    }
}
