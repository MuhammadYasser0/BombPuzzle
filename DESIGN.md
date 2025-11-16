# Bomb Puzzle Design Document

## 1. Project Overview
--DESCRIBTION
-This project is about a game where the user is asked different questions of varying difficulty about various cs related subjects.
-Upon answering each question:

-If answered correctly the user is shown a random wire colour that is added to an array. 
-If answered incorrectly then the user is shown a random colour and a random colour is added to the array aswell . 

-At the end the user is asked to reproduce the correct wire color order based on the qustions solved.To defuse the bomb.
-the sequence follows the same order in wich the qustions were presented.

--PROJECT GOALS
-The goal of this project is to test user's memory , Knowledge and Logic.
-It demonstrates the use of Object Oriented Programming , Arrays , Loops, and randomization logic in Java while showcasing creative problem solving and game design skills.

## 2. Gameplay Flow
**Game Start: ** User selects difficulty that determines wire count.
-An array containing question refrences is randomized at the start.
**Questioning Phase: ** A selection of questions is picked for the user randomly wich the user has to answer.
-Correct Answer -> A wire color is displayed to the user and added to an array.
-False Answer -> A wire color is displayed to the user and a random colour is added to the array.
**Sequence Challenge: ** After answering all questions the user the user reproduces the correct wire colour order.
**End Game: ** The program checks the sequence and displays Success or Failure.

## 3. Classes And Methods 

### 3.1 Questions & Wire Colours class
**Responsibilities:** Managing questions , Checking answers , Housing the colour pool and generating wire colours.
**Methods** 
`askQuestion()`: Asks the user a question then Stores the answer  , Inputs: User answer. Outputs: The question.
`

