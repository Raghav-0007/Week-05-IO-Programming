package basicproblems.readcsvfile;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path="src/main/java/basicproblems/readcsvfile/file.csv";

        // using buffered reader
//        try(BufferedReader reader=new BufferedReader(new FileReader(path))) {
//            String line;
//            while ((line=reader.readLine())!=null){
//                String[] col=line.split(",");
//                System.out.println("ID: "+col[0]+"  Name: "+col[1]+"  Age: "+col[2]+"  Marks: "+col[3]);
//            }

        // using CSV reader
        try(CSVReader reader=new CSVReader(new FileReader(path))){
            String[] line;
            while ((line=reader.readNext())!=null){
                System.out.println("ID: "+line[0]+"  Name: "+line[1]+"  Age: "+line[2]+"  Marks: "+line[3]);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
