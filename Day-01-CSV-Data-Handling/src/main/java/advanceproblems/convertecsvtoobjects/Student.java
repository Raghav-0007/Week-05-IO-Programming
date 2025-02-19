package advanceproblems.convertecsvtoobjects;

public class Student {
    private String id;
    private String name;
    private String email;
    private String phone;

    public String getId() {
        return id;
    }

    public Student(String id, String name, String email, String phone){
        this.id=id;
        this.name=name;
        this.email=email;
        this.phone=phone;
    }


}
