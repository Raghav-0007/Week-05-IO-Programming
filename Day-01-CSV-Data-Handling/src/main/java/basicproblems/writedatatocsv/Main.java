package basicproblems.writedatatocsv;

import com.opencsv.CSVWriter;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String path="src/main/java/basicproblems/writedatatocsv/file.csv";
        // using buffered writer
//        try(BufferedWriter writer=new BufferedWriter(new FileWriter(path))){
//            writer.write("ID,Name,Department,Salary\n");
//            writer.write("104,Alice Williams,Finance,62000\n");
//            writer.write("105,Bob Johnson,Sales,58000\n");
//            System.out.println("CSV file written successfully!");

        // using CSV writer
        try(CSVWriter writer=new CSVWriter(new FileWriter(path))){
            String[] header = {"ID", "Name", "Department", "Salary"};
            String[] emp1 = {"104", "Alice Williams", "Finance", "62000"};
            String[] emp2 = {"105", "Bob Johnson", "Sales", "58000"};
            String[] emp3 = {"500","Eva","Engineering","70000"};
            String[] emp4 = {"300","Charlie","Finance","62000"};
            String[] emp5 = {"400","David","Marketing","58000"};
            writer.writeNext(header);
            writer.writeNext(emp1);
            writer.writeNext(emp2);
            writer.writeNext(emp3);
            writer.writeNext(emp4);
            writer.writeNext(emp5);
            System.out.println("CSV file written successfully using OpenCSV!");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
