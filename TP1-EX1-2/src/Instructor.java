public class Instructor {
    private int instructorId;
    private String firstName;
    private String lastName;
    public Instructor(int id,String firstName,String lastName){
        this.firstName=firstName;
        this.instructorId=id;
        this.lastName=lastName;
    }
    public int getInstructorId(){
        return instructorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
