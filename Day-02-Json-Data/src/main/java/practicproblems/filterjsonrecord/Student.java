package practicproblems.filterjsonrecord;

class Student {
    public String name;
    public int age;
    public String grade;

    public Student() {} // Default constructor (needed for Jackson)

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", grade='" + grade + "'}";
    }
}

