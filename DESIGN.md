# Bomb Puzzle Design (Prototype) Document

## 1. Project Overview
**Description**  
Bomb Puzzle is a memory and logic game where players answer computer science questions to earn wire colours, then reproduce the correct sequence to defuse a bomb.  

- The user is asked different questions of varying difficulty about various CS-related subjects.  
- Upon answering each question:  
  - If answered correctly → the user is shown a wire colour that is added to an array.  
  - If answered incorrectly → the user is shown a wire colour and a random colour is added to the array as well.  
- At the end, the user is asked to reproduce the correct wire colour order based on the questions solved to defuse the bomb.  
- The sequence follows the same order in which the questions were presented.  

**Project Goals**  
- Test the user’s memory, knowledge, and logic.  
- Demonstrate the use of Object-Oriented Programming, arrays, loops, and randomization logic in Java.  
- Showcase creative problem solving and game design skills.  

-----------------------------------------------------------------------------------------------------------

## 2. Gameplay Flow
**Game Start:** User selects difficulty that determines wire count.  
- An array containing question references is randomized at the start.  

**Questioning Phase:** A selection of questions is picked for the user randomly which the user has to answer.  
- Correct Answer → A wire colour is displayed to the user and added to an array.  
- False Answer → A wire colour is displayed to the user and a random colour is added to the array.  

**Sequence Challenge:** After answering all questions, the user reproduces the correct wire colour order.  

**End Game:** The program checks the sequence and displays Success or Failure.  

-------------------------------------------------------------------------------------------------------------

## 3. Classes and Methods

### 3.1 Question Class
**Responsibilities**  
Represents a single question with its text, correct answer, and a colour list.  

**Fields**  
- `String text` → the question text  
- `boolean answer` → the correct answer (true/false)  
- `String[] colourList` → available wire colours  

**Constructor**  
- `Question(String text, boolean answer)`  
  - Input: Question text, correct answer  
  - Output: Initializes a Question object  

---------------------------------------------------------------------------------------------------------------

### 3.2 Storage Class
**Responsibilities**  
Manages game logic (questions, answers, colours, final check).  

**Key Methods**  
- `askQuestion()` → Prompts user with a question, returns boolean answer.  
- `checkAnswer()` → Compares user answer with correct answer, sets flag.  
- `determineColour()` → Prints wire colour based on correctness.  
- `getUserAnswer()` → Collects full wire sequence from user input.  
- `determine()` → Checks if user sequence matches correct sequence, returns boolean.  

----------------------------------------------------------------------------------------------------------------

### 3.3 Main Class
**Responsibilities**  
Acts as the entry point of the program. It introduces the game, runs the main loop to ask questions and assign colours, then collects the user’s final sequence and decides the outcome.  

**Flow**  
1. Print introduction and game instructions.  
2. Create a Storage object to manage questions and logic.  
3. Loop through questions based on difficulty:  
   - Call `askQuestion()` → get user’s true/false answer.  
   - Call `checkAnswer()` → verify correctness.  
   - Call `determineColour()` → display wire colour.  
   - Increment index and counter to move to the next question.  
4. Call `getUserAnswer()` → collect the player’s full wire sequence.  
5. Call `determine()` → check if the sequence matches the correct one.  
6. Print outcome: either “Bomb Defused” (win) or “BOOM” (lose).  

-----------------------------------------------------------------------------------------------------------------

## 4. Future Improvements
- Add randomization elements to the colours and questions given to the user.  
- Implement encapsulation for cleaner design.  
- Add different difficulty levels.  
- Add a password mode where instead of using wire colours, the player must reproduce a password sequence.  
- Add concurrency in the form of a timer.  

------------------------------------------------------------------------------------------------------------------

## 5. What I Learned
- Improved understanding of method and object handling.  
- Improved understanding of arrays and ways to manipulate them.  
- How to design a system.  
- Importance of iteration and starting small (prototyping).  
- Steps taken in system design.  

-------------------------------------------------------------------------------------------------------------------

## 6. Notes on Fixes
- Used `.equals()` for string comparison instead of `==`.  
- Adjusted `userDestiny` array size to match number of colours.  
- Cleared Scanner buffer after `nextBoolean()` to avoid skipped inputs.  
- Corrected outcome logic so matching sequence results in a win.  
