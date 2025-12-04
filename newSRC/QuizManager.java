
import java.util.Scanner;
/*
Methods:
askQuestion();
getAnswer();
*/

public class QuizManager {
    private boolean userAnswer;
    private Question currQuestion;
    public void askQuestion(Question[] questions,int counter){
            System.out.println(questions[counter].getText());
            currQuestion = questions[counter];
    }
    public Question getCurrQuestion(){
        return currQuestion;
    }
    public void setUserAnswer(Scanner scan){
        userAnswer = scan.nextBoolean();
    }
    public boolean getUserAnswer(){
        return userAnswer;
    }
}
