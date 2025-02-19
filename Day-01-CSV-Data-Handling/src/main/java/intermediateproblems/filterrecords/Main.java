package intermediateproblems.filterrecords;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String path="src/main/java/intermediateproblems/filterrecords/file.csv";
        try(CSVReader reader=new CSVReader(new FileReader(path))){
            String[] line;
            reader.readNext();
            while ((line=reader.readNext())!=null){
                int marks=Integer.parseInt(line[3]);
                if(marks>=80){
                    System.out.println(Arrays.toString(line));
                }
            }
        }catch (IOException | CsvValidationException e){
            System.out.println(e.getMessage());
        }
    }
}
