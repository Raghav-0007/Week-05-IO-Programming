package practicproblems.covertlisttojsonarray;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        // Create a list of Student objects
        List<Student> students = Arrays.asList(
                new Student("Alice", 20, "A"),
                new Student("Bob", 22, "B"),
                new Student("Charlie", 21, "A")
        );

       // Convert List to JSON Array
        String jsonArray = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(students);

        // Print JSON output
        System.out.println(jsonArray);
    }
}
