package advanceproblems.convertecsvtoobjects;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path="src/main/java/advanceproblems/convertecsvtoobjects/file.csv";
        List<Student> students=new ArrayList<>();

        try(CSVReader reader=new CSVReader(new FileReader(path))){
            String[] line;

            // for skip the header
            reader.readNext();

            // for read the csv file
            while ((line=reader.readNext())!=null){
                String id=line[0];
                String name=line[1];
                String email=line[2];
                String phone=line[3];
                students.add(new Student(id, name, email, phone));
            }

            // print the student ids
            for(Student student: students){
                System.out.println(student.getId());
            }
        }catch (IOException | CsvValidationException e){
            System.out.println(e.getMessage());
        }
    }
}
