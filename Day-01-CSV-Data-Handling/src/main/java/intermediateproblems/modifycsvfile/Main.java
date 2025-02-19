package intermediateproblems.modifycsvfile;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String file="src/main/java/intermediateproblems/modifycsvfile/file.csv";
        String file2="src/main/java/intermediateproblems/modifycsvfile/file2.csv";

        try{
            CSVReader reader=new CSVReader(new FileReader(file));
            CSVWriter writer=new CSVWriter(new FileWriter(file2));

            // reading csv file
            String[] line;

            // read and update the data
            while ((line=reader.readNext())!=null){
                if(line[2].equals("IT")){
                    double salary=Double.parseDouble(line[3]);
                    salary*=1.1;
                    line[3]=Double.toString(salary);
                    writer.writeNext(line);
                    writer.flush();
                    continue;
                }
                writer.writeNext(line);
                writer.flush();
            }
        }catch (IOException | CsvValidationException e){
            System.out.println(e.getMessage());
        }
    }
}
