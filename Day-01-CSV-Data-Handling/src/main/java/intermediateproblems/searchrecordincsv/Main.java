package intermediateproblems.searchrecordincsv;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String path="src/main/java/basicproblems/writedatatocsv/file.csv";

        // read csv file
        try(CSVReader reader=new CSVReader(new FileReader(path))){
            String name="David";
            String[] line;

            // find the given employee details
            while ((line=reader.readNext())!=null){
                if(name.equals(line[1])){
                    System.out.println(Arrays.toString(line));
                }
            }
        }catch (IOException | CsvValidationException e){
            System.out.println(e.getMessage());
        }
    }
}
