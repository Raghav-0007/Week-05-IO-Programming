package basicproblems.countrows;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String path="src/main/java/basicproblems/countrows/file.csv";
        int count=-1;
        try(CSVReader reader=new CSVReader(new FileReader(path))){
            String[] line;
            while ((line=reader.readNext())!=null){
                count++;
                System.out.println(Arrays.toString(line));
            }
            System.out.println(count);
        }catch (IOException | CsvValidationException e){
            System.out.println(e.getMessage());
        }
    }
}
