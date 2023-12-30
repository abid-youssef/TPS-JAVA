public class Course {
    private int courseId;
    private String courseName;
    private Instructor instructor;
    public course(int id,String name,Instructor instructor){
        this.courseId=id;
        this.courseName=name;
        this.instructor=instructor;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public String getCourseName() {
        return courseName;
    }
    public Instructor getInstructor(){
        return instructor;
    }
}
