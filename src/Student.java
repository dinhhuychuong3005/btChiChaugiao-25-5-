public class Student extends Person {
    private String school;
    private int id;


    public Student(String school,int id) {
        this.school = school;
        this.id = id;
    }

    public Student(int id, int age, String name, String gender, String address, String school) {
        super(age, name, gender, address);
        this.school = school;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                super.toString() +
                ", school=" + school +
                '}';
    }
}
