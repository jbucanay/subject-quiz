import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args){
    //create a student
//        Utility.keepTime();
        System.out.println(Utility.createStudent().getUserName());
        SubjectQuestion[] questions = Utility.createSubjectQuestions();
        int i = questions.length -1;
        int score = 0;
        while(i >= 0){
            System.out.println(questions[i].getQuestion());
            boolean takeQuestion = questions[i].presentAnswerOptions();

            if(takeQuestion){
                score++;
            }
            i--;
        }
        System.out.printf("You got %d out of %s questions", score, questions.length);
    }
}
