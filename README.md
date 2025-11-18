# 💣 Bomb Puzzle (Prototype)

## 📖 Overview
Bomb Puzzle is a prototype of a game that tests memory and logic using java.
Players answer computer sciense related questions to recieve wire colours wether these colours are the correct one relies on the player's answer and sometimes chance , Then they must reproduce the correct sequence of wire colours to defuse the bomb.
The premise of giving the player a random wire colour when answering wrong is to keep the player guessing wich wire colours he is given are actully correct or not.
The project demonstrates Object-Oriented Programming, arrays, loops, and randomization logic** while showcasing creative problem solving and game design skills.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## 🎮 Gameplay Flow
1. **Game Start** → Player selects difficulty (determines wire count).  
2. **Question Phase** → Random CS questions are asked.  
   - Correct answer → Wire colour shown and added to sequence.  
   - Incorrect answer → Wire colour shown, random colour added to sequence.  
3. **Sequence Challenge** → Player reproduces the wire colour order.  
4. **End Game** → Program checks sequence and displays *Bomb Defused* or *BOOM*.  

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## 🛠️ Project Structure
- **Question.java** → Holds the questions blueprint, and colour list.  
- **Storage.java** → Manages game logic (asking questions, checking answers, assigning colours, verifying final sequence).  
- **Main.java** → Entry point; orchestrates game flow and prints outcome.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


