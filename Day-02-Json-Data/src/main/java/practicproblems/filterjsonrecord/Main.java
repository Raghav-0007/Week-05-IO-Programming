package practicproblems.filterjsonrecord;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        String path="src/main/java/practicproblems/filterjsonrecord/file.json";
        ObjectMapper objectMapper = new ObjectMapper();

        // Read JSON file into a List<Student>
        List<Student> students = objectMapper.readValue(new File(path), new TypeReference<List<Student>>() {});

        // Filter students where age > 25
        List<Student> filteredStudents = students.stream()
                .filter(student -> student.age > 25)
                .toList();

        // Print filtered results
        filteredStudents.forEach(System.out::println);
    }
}
