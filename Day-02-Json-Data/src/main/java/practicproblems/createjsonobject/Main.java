package practicproblems.createjsonobject;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String path="src/main/java/practicproblems/createjsonobject/file.json";
        Student student = new Student("John Doe", 20, Arrays.asList("Math", "Science", "English"));

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Convert object to JSON and write to a file
            objectMapper.writeValue(new File(path), student);
            System.out.println("JSON file created successfully!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
