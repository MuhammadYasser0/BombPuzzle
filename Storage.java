
import java.util.Scanner;

public class Storage {

    int counter = 1;
    int index = 0;
    boolean userAnswer;
    boolean add;
    boolean finalCheck;
    String[] correctSequence = {"Red", "Blue", "Green"};
    String[] falseSequence = {"Green", "Red", "Blue"};
    String[] userDestiny = new String[3];
    Scanner scan = new Scanner(System.in);

    Question Q1 = new Question("A linked list is useful when insertion and deletion is frequent", false);
    Question Q2 = new Question("Trees and graphs follow a sequential pattern.", false);
    Question Q3 = new Question("String is a basic data type in java", false);

    Question[] list = {Q1, Q2, Q3};

    //akss the user a questions and returns an answer.
    public boolean askQuestion() {
        System.out.println("Answer Question number: " + counter);
        System.out.println(list[index].text);
        userAnswer = scan.nextBoolean();
        scan.nextLine();
        return userAnswer;
    }

    //checks if the user answer to the question is right or wrong.
    public void checkAnswer() {
        if (userAnswer == list[index].answer) {
            add = true;
        } else {
            add = false;
        }
    }

    //determines wether the user should recieve a colour from the wrong or right sequence.
    public void determineColour() {
        if (add == true) {
            System.out.println("The " + counter + " colour is: " + correctSequence[index]);
        } else {
            System.out.println("The " + counter + " colour is: " + falseSequence[index]);
        }
    }

    //fills the user sequence array so we can compare it later.
    public void getUserAnswer() {
        System.out.println("What is the correct sequence of wire colours?");
        for (int i = 0; i < userDestiny.length; i++) {
            userDestiny[i] = scan.nextLine();
        }
    }

    //Determines wether the user sequence is right or wrong.
    public boolean determine() {
        for (int i = 0; i < userDestiny.length; i++) {
            if (userDestiny[i].equals(correctSequence[i])) {

            } else {
                finalCheck = false;
                break;
            }
            finalCheck = true;
        }
        return finalCheck;
    }
}
