import java.util.Timer;
import java.util.TimerTask;

public final class Utility {

    public static int findIndex(int target, int[] arr){
        for(int index = 0; index < arr.length; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }

    public static int findIndex(char target, char[] arr){
        for(int index = 0; index < arr.length; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }

    public static SubjectQuestion[] createSubjectQuestions(){
        SubjectQuestion math1 = new SubjectQuestion("Math");
        math1.setQuestion("Which of the following is the correct number for 47 thousand, 23.");
        math1.setAnswer(47_023);
        int[] math1Options = {4_723, 47_023, 470_023, 4_702_023 };
        math1.setAnswerOptions(math1Options);

        SubjectQuestion math2 = new SubjectQuestion("Math");
        math2.setQuestion("How many inches make a yard?");
        math2.setAnswer(36);
        int[] math2Options = {6,12,24,36 };
        math2.setAnswerOptions(math2Options);
        SubjectQuestion[] questions = {math1, math2};
        return questions;
    }

    public static Student createStudent(){
       return new Student("Josh", "Manky");
    }


    public static void keepTime(){
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            int i = 90;
            @Override
            public void run(){
                if(i>=0){
                    String time = String.format("%02d:%02d", i /60, i%60);
                    System.out.print("\r\033[K" + "Time remaining: " +time);
                    System.out.print("\r");
                    i--;

                } else {
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0,1000);
    }
}
