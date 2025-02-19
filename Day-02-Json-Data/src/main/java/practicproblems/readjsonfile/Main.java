package practicproblems.readjsonfile;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Main {
        public static void main(String[] args) {
            String path="src/main/java/practicproblems/readjsonfile/file.json";

            try {
                // Create ObjectMapper instance
                ObjectMapper objectMapper = new ObjectMapper();

                // Read JSON file into JsonNode
                JsonNode rootNode = objectMapper.readTree(new File(path));

                // Extract specific fields
                String name = rootNode.get("name").asText();
                String email = rootNode.get("email").asText();

                // Print extracted fields
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
