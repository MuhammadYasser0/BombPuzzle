
import java.util.Scanner;
public class Difficulty {
    Scanner scan;
    private int difficulty;
    int playerDifficulty;
    public void askDifficulty(Scanner scan){
        System.out.println("what difficulty will you choose: [1 - > Easy 3 Wires/Questions] [2 -> Medium 6 Wires/Questions] [3 -> Hard 9 Wires/Questions]");
        playerDifficulty = scan.nextInt();
    }
    public void determineDifficulty(){
        switch(playerDifficulty){
            case 1: setDifficulty(3);break;
            case 2: setDifficulty(6);break;
            case 3: setDifficulty(9);break;
            default:{
                System.out.println("Invalid input , Defaulting to easy");
                setDifficulty(3);
            }
        }
    }
    public int getDifficulty(){
        return difficulty;
    }
    public void setDifficulty(int difficulty){
        this.difficulty = difficulty;
    }
    
}
