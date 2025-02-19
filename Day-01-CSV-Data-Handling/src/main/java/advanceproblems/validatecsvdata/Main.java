package advanceproblems.validatecsvdata;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String path="src/main/java/advanceproblems/validatecsvdata/file.csv";
        String regex1="[a-zA-Z\\d._-]+@[a-zA-Z-]+\\.[a-zA-Z]{2,}";
        String regex2="\\d{10}";
        Pattern pattern1=Pattern.compile(regex1);
        Pattern pattern2=Pattern.compile(regex2);
        Matcher matcher1, matcher2;

        try(CSVReader reader=new CSVReader(new FileReader(path))){
            String[] line;

            // for skip header
            reader.readNext();

            // check the validation for each row
            while ((line=reader.readNext())!=null){
                matcher1=pattern1.matcher(line[2]);
                matcher2=pattern1.matcher(line[2]);
                if(!matcher1.matches() || !matcher2.matches()){
                    System.out.println("invalid email or phone number");
                    System.out.println(Arrays.toString(line));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
}
}
