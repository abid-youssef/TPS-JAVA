import java.util.ArrayList;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private ArrayList<Course> courses;
    public Student(int id,String fname,String lname,ArrayList<Course>course) {
        this.studentId=id;
        this.firstName=fname;
        this.lastName=lname;
        this.courses=course;
    }

    public int getStudentId() {
        return studentId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public ArrayList<course> getCourses(){
        return courses;
    }
    public void enroll(Course course){
        courses.add(course);
    }
}
