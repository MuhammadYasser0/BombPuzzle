import java.util.Scanner;

public class GameLauncher {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Difficulty diff = new Difficulty();
        Shuffle shuffle = new Shuffle();
        Storage storage = new Storage();
        QuizManager quiz = new QuizManager();
        Evaluator evaluate = new Evaluator();
        Judge judge = new Judge();
        String[] colours = storage.getColours();
        Question[] questions = storage.getQuestions();
        shuffle.shuffleColours(colours);
        shuffle.shuffleQuestions(questions);
        System.out.println("Hello Player");
        System.out.println("A bomb is ticking wich can only be defused by cutting the wires in a specific order");
        System.out.println("");
        System.out.println("You will be asked 3 diffrent questions related to computer science");
        System.out.println("");
        System.out.println("After answering each question you will recieve a wire colour");
        System.out.println("");
        System.out.println("The wire sequence is the same as the order you recievied the colours,");

        diff.askDifficulty(scan);
        diff.determineDifficulty();
        System.out.println("Answer the following questions: ");
        for (int i = 0; i < diff.getDifficulty(); i++) {
            quiz.askQuestion(questions,i);
            System.out.println("");
            quiz.setUserAnswer(scan);
            evaluate.checkAnswer(questions[i],quiz.getUserAnswer());
            if(evaluate.isItCorrect()){
                evaluate.giveCorrectColour(colours,i);
                System.out.println("");
            }else{
                evaluate.giveFalseColour(colours, i);
                System.out.println("");
            }
        }
        for(int i = 0 ; i <evaluate.getColourList().size();i++){
            System.out.println("what is the " + (i+1) + " colour ?");
            judge.askPlayerDestiny(scan);
        }
        judge.compare(evaluate.getColourList());
        judge.judge();
    }
}
