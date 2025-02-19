package advanceproblems.deleteduplicates;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String path="src/main/java/advanceproblems/deleteduplicates/file.csv";
        Set<String> set=new HashSet<>();

        // read the csv file
        try(CSVReader reader=new CSVReader(new FileReader(path))) {
            // skip header
            reader.readNext();

            String [] line;
            while ((line=reader.readNext())!=null){
                // check the duplicate data
                if(!set.add(line[0])){
                    System.out.println("duplicate data.....");
                    System.out.println(Arrays.toString(line));
                }
            }
        } catch (IOException | CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
