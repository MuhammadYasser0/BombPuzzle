# 💣 Bomb Puzzle

## 📖 Overview
Bomb Puzzle is a game that tests active recall and knowledge using java.
Players first choose a difficulty level from easy to hard then answer computer sciense related questions to recieve wire colours wether these colours are the correct one relies on the player's answer. After answering all questions they must reproduce the correct sequence of wire colours to defuse the bomb.
The premise of giving the player a random wire colour when answering wrong is to keep the player guessing wich wire colours he is given are actully correct or not.
The project demonstrates Object-Oriented Programming, arrays, loops, and randomization logic while showcasing game design skills, Prinicpled programming, Prototypeing, And problem solving.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## 🎮 Gameplay Flow
1. **Game Start** → Player selects difficulty (determines the number of questions).  
2. **Questioning Phase** → Random CS related questions are asked.  
   - Correct answer → Wire colour shown and added to correct sequence.  
   - Incorrect answer → Wire colour shown, random colour added to sequence.  
3. **Sequence Challenge** → Player reproduces the wire colour order.
4. **Evaluation Phase** → The game checks the player's wire colour order and compares it with the correct sequence.
5. **End Game** → Program checks sequence and displays success or failure.  

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## 🛠️ Project Structure
- **Question** → Holds the questions blueprint.
- **Difficulty** → Manages Difficulty setting and selection.
- **Shuffle** → Manages shuffling logic for questions and colours.
-  **Storage** → Stores questions and colours.
- **QuizManager** → Manages the asking of questions and getting and storing of the player answers.
- **Evaluator** → Checks the correctness of the player's answers and determines wich colours he is given.
- **Judge** →Asks the player for the order of colours and compares that order of colours by the player with the correct one as well as giving a judgment.
- **Main.java** → Entry point; orchestrates game flow and prints outcome.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------





