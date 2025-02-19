package practicproblems.validatejson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String userPath="src/main/java/practicproblems/validatejson/user.json";
        try {
            ObjectMapper objectMapper=new ObjectMapper();
            User user=objectMapper.readValue(new File(userPath), User.class);
            System.out.println("Valid JSON: " + user.name + ", Age: " + user.age);
        } catch (IOException e) {
            System.out.println("Invalid JSON: " + e.getMessage());
        }
    }
}
