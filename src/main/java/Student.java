public class Student {
    private int id_student;

    @Override
    public String toString() {
        return "Student{" +
                "id_student=" + id_student +
                ", first_name='" + first_name + '\'' +
                ", secound_name='" + secound_name + '\'' +
                ", third_name='" + third_name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    private String first_name;
    private String secound_name;
    private String third_name;
    private String group;

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecound_name() {
        return secound_name;
    }

    public void setSecound_name(String secound_name) {
        this.secound_name = secound_name;
    }

    public String getThird_name() {
        return third_name;
    }

    public void setThird_name(String third_name) {
        this.third_name = third_name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student(int id_student, String first_name, String secound_name, String third_name, String group) {
        this.id_student = id_student;
        this.first_name = first_name;
        this.secound_name = secound_name;
        this.third_name = third_name;
        this.group = group;
    }
}
