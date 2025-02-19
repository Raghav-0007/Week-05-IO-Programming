package practicproblems.convertobjecttojson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022);
        String path="src/main/java/practicproblems/convertobjecttojson/car.json";

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Convert Car object to JSON and write to a file
            objectMapper.writeValue(new File(path), car);
            // Convert Car object to JSON string and print
            String jsonString = objectMapper.writeValueAsString(car);
            System.out.println("Car JSON: " + jsonString);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
