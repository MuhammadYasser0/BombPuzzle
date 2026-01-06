
public class Main {
    
    public static void main(String[] args) {
        int difficulty = 3;
        Storage storage = new Storage();
        
        System.out.println("Hello Player");
        System.out.println("A bomb is ticking wich can only be defused by cutting the wires in a specific order");
        System.out.println("");
        System.out.println("You will be asked 3 diffrent questions related to computer science");
        System.out.println("");
        System.out.println("After answering each question you will recieve a wire colour");
        System.out.println("");
        System.out.println("The wire sequence is the same as the order you recievied the colours,");
        
        for(int i = 0;i< difficulty;i++){
        storage.askQuestion();
        storage.checkAnswer();
        storage.determineColour();
        storage.index += 1;
        storage.counter += 1;
        }
        storage.getUserAnswer();
        storage.determine();
        if(storage.finalCheck == true){
            System.out.println("Bomb Defused");
            System.out.println("You WIN YAY !!!");
            
        }
        else{
            System.out.println("You lose Sonny hahahahah");
            System.out.println("BOOOOM!!!!!");
        }
    }
    
}
