public class Main {
    public static void main(String[] args){
    //create a student
        Student student = new Student("Josh", "Manky");
        SubjectQuestion math1 = new SubjectQuestion("Math");
        math1.setQuestion("Which of the following is the correct number for 47 thousand, 23.");
        math1.setAnswer(String.valueOf(47_023));
        int[] math1Options = {4_723, 47_023, 470_023, 4_702_023 };
        math1.setAnswerOptions(math1Options);
        System.out.println(student.getUserName());
        System.out.println(math1.getQuestion());
        math1.presentAnswerOptions();


    }
}
