package practicproblems.covertlisttojsonarray;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
    @JsonProperty("name")
    private String name;

    @JsonProperty("age")
    private int age;

    @JsonProperty("grade")
    private String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters (Jackson needs them)
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGrade() { return grade; }
}
