public class Student extends User {
    public Student(String firstName, String lastName){
        super(firstName, lastName);
    }
    @Override
    public String getUserName(){
        return String.format("Student id: %s", this.getUserId());
    }
}
