import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args){
    //create a student
        SubjectQuestion[] questions = Utility.createSubjectQuestions();
        System.out.println(Utility.createStudent().getUserName());
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            int i = 90;
            @Override
            public void run(){
                if(i>=0){
                    String time = String.format("%02d:%02d", i /60, i%60);
                    System.out.print("\r" +time);
                    i--;

                } else {
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0,1000);
        System.out.println("Time remaining: ");
        System.out.println(questions[0].getQuestion());
        System.out.println(questions[0].presentAnswerOptions());


    }
}
