package intermediateproblems.sortcsvrecord;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path="src/main/java/intermediateproblems/sortcsvrecord/file.csv";
        String path2="src/main/java/intermediateproblems/sortcsvrecord/file2.csv";

        try {

            // read csv file
            CSVReader reader= new CSVReader(new FileReader(path));
            List<String[]> list= new ArrayList<>();
            String[] header=reader.readNext();
            String[] line;
            while ((line=reader.readNext())!=null){
                list.add(line);
            }

            // sort csv file
            list.sort(Comparator.comparing(a -> a[1]));

            // write the sorted data in file 2
            CSVWriter writer=new CSVWriter(new FileWriter(path2));
            writer.writeNext(header);
            writer.writeAll(list);
            writer.flush();

            System.out.println("file sorting is completed!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
