package advanceproblems.mergecsvfiles;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String student1="src/main/java/advanceproblems/mergecsvfiles/student1.csv";
        String student2="src/main/java/advanceproblems/mergecsvfiles/student2.csv";
        String file="src/main/java/advanceproblems/mergecsvfiles/file.csv";
        Map<String, String[]> map =new HashMap<>();
        List<String> list=new ArrayList<>();
        try{
            CSVReader reader1=new CSVReader(new FileReader(student1));
            CSVReader reader2=new CSVReader(new FileReader(student2));
            CSVWriter writer=new CSVWriter(new FileWriter(file));

            // reading file 1
            String[] line;
            while ((line=reader1.readNext())!=null){
                map.put(line[0], line);
            }

            // reading file 2
            while ((line=reader2.readNext())!=null){
                if(map.containsKey(line[0])){
                    list.addAll(Arrays.asList(map.get(line[0])));
                    list.add(line[1]);
                    list.add(line[2]);
                    writer.writeNext(list.toArray(new String[0]));
                    writer.flush();
                    list.clear();
                }
            }
            System.out.println("merging completed...!");
        }catch (IOException e){
            System.out.println(e.getMessage());
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
