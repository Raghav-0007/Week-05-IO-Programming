package practicproblems.createjsonobject;

import java.util.List;

class Student {
    public String name;
    public int age;
    public List<String> subjects;

    public Student(String name, int age, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }
}

