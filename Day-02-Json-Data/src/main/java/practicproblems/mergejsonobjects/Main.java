package practicproblems.mergejsonobjects;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        String json1 = "{ \"name\": \"John Doe\", \"age\": 25 }";
        String json2 = "{ \"email\": \"johndoe@example.com\", \"city\": \"New York\" }";

        try {
            // create obj mapper
            ObjectMapper objectMapper = new ObjectMapper();

            // create json nodes
            JsonNode jsonNode1 = objectMapper.readTree(json1);
            JsonNode jsonNode2 = objectMapper.readTree(json2);

            // create a empty obj node
            ObjectNode objectNode=objectMapper.createObjectNode();

            // merge the json objects
            objectNode.setAll((ObjectNode) jsonNode1);
            objectNode.setAll((ObjectNode) jsonNode2);

            // convert object to string
            String jsonData=objectNode.toPrettyString();
            System.out.println(jsonData);
        }catch (JsonProcessingException e){
            System.out.println(e.getMessage());
        }
    }
}
