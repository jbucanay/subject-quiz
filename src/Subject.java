public abstract class Subject {
    private String subjectName;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectName(){
        return this.subjectName;
    }
}
