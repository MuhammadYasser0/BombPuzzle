import java.util.Random;
public class Shuffle {
    
    public void shuffleQuestions(Question[] array){
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Question temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }    
    }
    public void shuffleColours(String[]colours){
        Random rand = new Random();
        for (int i = colours.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            String temp = colours[i];
            colours[i] = colours[j];
            colours[j] = temp;
        }    
    }
   
}