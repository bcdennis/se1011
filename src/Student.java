public class Student {
    private int studentId;
    private String name;
    private int age;
    private Student buddy;

    public Student(int id, String aName, int anAge) {
        this.studentId = id;
        this.setName(aName);
        this.setAge(anAge);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setBuddy(Student buddy) {
        this.buddy = buddy;
    }

    public boolean equals(Object object) {
        Student otherStudent = (Student)object;
        return otherStudent.getStudentId() == this.getStudentId();

    }

    public String toString() {
        return name + " is " + age + " years old." + " Their student id is: " + studentId + ". They are friends with " + buddy;
    }
}