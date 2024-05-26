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
        math1.setAnswer(String.valueOf(47_023));
        int[] math1Options = {4_723, 47_023, 470_023, 4_702_023 };
        math1.setAnswerOptions(math1Options);
        SubjectQuestion[] questions = {math1};
        return questions;
    }

    public static Student createStudent(){
       return new Student("Josh", "Manky");
    }
}
