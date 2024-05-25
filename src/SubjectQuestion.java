import java.util.Random;

public class SubjectQuestion extends Subject{
    private String question;
    private String answer;
    private int[] answerOptions = new int[5];

    public SubjectQuestion(String subjectName) {
        super(subjectName);
    }

    public void setQuestion(String question){
        this.question = question;
    }

    public String getQuestion(){
        return this.question;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }

    public String getAnswer(){
        return this.answer;
    }

    public void setAnswerOptions(int[] answerOptions){
        this.answerOptions = answerOptions;
    }

    /**
     * Retrieves the answer options after randomizing them.
     *
     * @return An array containing the randomized answer options.
     */
    public int[] getAnswerOptions() {
        // Randomize the order of answer options
        randomizeQuestions();

        // Return the randomized answer options
        return this.answerOptions;
    }


    /**
     * Randomizes the order of the questions in the answerOptions array using the
     * Fisher-Yates shuffle algorithm.
     */
    public void randomizeQuestions() {
        // Create an instance of the Random class to generate random numbers
        Random random = new Random();

        // Loop through the answerOptions array from the last element to the first
        for (int i = this.answerOptions.length - 1; i >= 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int j = random.nextInt(i + 1);

            // Swap the elements at index i and index j
            var temp = this.answerOptions[i];
            this.answerOptions[i] = this.answerOptions[j];
            this.answerOptions[j] = temp;
        }
    }


    /**
     * Presents the answer options to the user by printing them out with
     * corresponding alphabetic labels (A, B, C, D).
     */
    public void presentAnswerOptions() {
        // Define an array of characters representing the choices
        char[] choiceAlphabet = {'A', 'B', 'C', 'D'};

        // Loop through each choice in the choiceAlphabet array
        for (int i = 0; i < choiceAlphabet.length; i++) {
            // Print the choice alphabet and the corresponding answer option
            System.out.printf("%s) %s%n", choiceAlphabet[i], this.answerOptions[i]);
        }
    }

}
