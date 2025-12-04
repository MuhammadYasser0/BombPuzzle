import java.util.ArrayList;
import java.util.Scanner;
public class Judge {
    ArrayList<String> playerDestiny = new ArrayList<>();
    boolean doomed;
    public void askPlayerDestiny(Scanner scan){
        playerDestiny.add(scan.next());
    }
    public void compare(ArrayList<String> array){
        if(array.equals(playerDestiny)){
            doomed = false;
        }else{
            doomed = true;
        }
    }
    public void judge(){
        if(doomed){
            System.out.println("You Lose BOOM!");
        }else{
            System.out.println("You Win! Bomb defused");
        }
    }
}
