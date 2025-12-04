import java.util.Scanner;
import java.util.ArrayList;

/*
Methods:
checkAnswer();

*/

public class Evaluator {
    private ArrayList<String> correctColours = new ArrayList<>();
    private boolean isItCorrect;
    private String givenCorrectColour;
    
    public void checkAnswer(Question question,boolean userAnswer){
        if(question.getAnswer() == userAnswer){
            isItCorrect = true;
        }else{
            isItCorrect = false;
        }
    }
    public void giveCorrectColour(String[]colours,int counter){
        if(isItCorrect){
            System.out.println("The colour is: " + colours[counter]);
            givenCorrectColour = colours[counter];
            correctColours.add(givenCorrectColour);
        }
    }
    public void giveFalseColour(String[]colours,int counter){
        if(!isItCorrect){
            System.out.println("The colour is: " + colours[counter]);
            correctColours.add(colours[counter+1]);
        }
    }
    public  ArrayList<String> getColourList(){
        return correctColours;
    }
    public boolean isItCorrect(){
        return isItCorrect;
    }
}
