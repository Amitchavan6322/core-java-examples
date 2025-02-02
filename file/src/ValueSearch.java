import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class ValueSearch {

    // Function to read values from the file
    public static List<String> readValuesFromFile(String filePath) throws IOException {
        List<String> values = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                values.add(line);
            }
        }
        return values;
    }

    // Function to search for values that match user input (first few characters)
    public static List<String> searchValues(List<String> values, String searchQuery) {
        return values.stream()
                .filter(value -> value.toLowerCase().startsWith(searchQuery.toLowerCase()))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        try {
            // Read values from the file
            List<String> values = readValuesFromFile(filePath);

            // Ask the user for search input
            System.out.print("Enter the first few characters to search: ");
            String searchQuery = scanner.nextLine();

            // Search and display matching values
            List<String> matchingValues = searchValues(values, searchQuery);

            if (matchingValues.isEmpty()) {
                System.out.println("No values found that match the search query.");
            } else {
                System.out.println("Matching values:");
                matchingValues.forEach(System.out::println);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
