package geographyquizgame;

//Programmer Name: Austin
//GitHub Username: welkins1


//Used for user input
import java.util.Scanner;

//Used for Array Lists
import java.util.ArrayList;

//Used for randomization of questions
import java.util.Collections;

public class GeographyQuizGame {

    public static void main(String[] args) {
        
    
        

        //This boolean is used for the PlayAgain while loop
        boolean PlayAgain = true;
        
        
        //Program descrption
        
        //This while loop is used later to let the user continue playing / restart the program
        while (PlayAgain) {
           
            
            System.out.println("\nHello!\n");

            System.out.println("Welcome to the World Geography Quiz game.\n");
            
            System.out.println("This game tests your knowlege on various World Geography facts"
                    + " such as capitals, continents, flags, and populations.\n");

            //Creates aray list for EasyQA
            ArrayList<QuestionAnswerPair> EasyQA = new ArrayList<>();

            //Adds questions to EasyQA
            EasyQA.add(new QuestionAnswerPair("What is the capital of the United States of America? ", "Washington DC"));

            EasyQA.add(new QuestionAnswerPair("What is the capital of Germany? ", "Berlin"));

            EasyQA.add(new QuestionAnswerPair("What country has the largest population? ", "China"));

            EasyQA.add(new QuestionAnswerPair("Which of the following colors is NOT on the flag of France?\n\nRed, Purple, White, or Blue? ", "Purple"));

            EasyQA.add(new QuestionAnswerPair("What continent is Canada in? ", "North America"));

            //Create array list for MediumQA
            ArrayList<QuestionAnswerPair> MediumQA = new ArrayList<>();

            //Adds questions to MediumQA 
            MediumQA.add(new QuestionAnswerPair("What continent is Egypt in? ", "Africa"));

            MediumQA.add(new QuestionAnswerPair("What country has the 3rd largest population? ", "United States of America"));

            MediumQA.add(new QuestionAnswerPair("What is the capital of Sweden? ", "Stockholm"));

            MediumQA.add(new QuestionAnswerPair("Which of the following countries do not have red, white, or blue on their flag?\n \nRussia, Japan, Indonesia, or Jamaica ", "Jamaica"));

            //Creates array list for HardQA
            ArrayList<QuestionAnswerPair> HardQA = new ArrayList<>();

            //Adds Questiosn to HardQA
            HardQA.add(new QuestionAnswerPair("What is the capital of Burkina Faso? ", "Ouagadougou"));

            HardQA.add(new QuestionAnswerPair("What is the smallest country in the world? ", "Vatican City"));

            HardQA.add(new QuestionAnswerPair("What continent is Palau located in? ", "Oceania"));

            HardQA.add(new QuestionAnswerPair("What country has the most natural lakes? ", "Canada"));

            //Array place holder for Difficulty + corresponding answers, a value of null is used to ensure the Array has no questions, but questions can be added
            ArrayList<QuestionAnswerPair> selectedQA = null;

            //Creates Scanner input
            Scanner input = new Scanner(System.in);
            System.out.print("Please select your difficutly (Easy, Medium or Hard): ");

            //Converts difficulty string to lowercase for less percise input
            String Difficulty = input.nextLine();

            
            //Loop for invalid input
            while (true) {

                //If else statement for choosing questions and assinging them to selectedQA array
                if (Difficulty.equalsIgnoreCase("easy")) {
                    selectedQA = EasyQA;
                    break;
                } else if (Difficulty.equalsIgnoreCase("medium")) {
                    selectedQA = MediumQA;
                    break;
                } else if (Difficulty.equalsIgnoreCase("hard")) {
                    selectedQA = HardQA;

                    break;
                } else {
                    //Invalid input else
                    System.out.print("\nInvalid difficutly, please select again: ");
                    Difficulty = input.nextLine().toLowerCase();
                    
                }

            }

            //Displays selected difficutly. 
            System.out.println("\nYou selected " + Difficulty + " difficulty.\n");

            System.out.print("Loading questions");
            //For loop to simulate loading questions
            for (int i = 0; i < 5; i++) {

                //the try-catch is required to use Thread.sleep
                try {
                    //Loading time in miliseconds
                    Thread.sleep(500);
                    //printed to the console based on i < 5
                    System.out.print(".");

                } catch (InterruptedException error) {

                }
            }

            //Spacer
            System.out.println("\n");

            //Variable for calculating score
            double score = 0;

            //Shuffles the questions 
            Collections.shuffle(selectedQA);

             //Stores currentTime in milliseconds at the start of the quiz (acts as a timer)
             long StartTime = System.currentTimeMillis();
             
            //Displays the first question
            QuestionAnswerPair firstQA = selectedQA.get(0);
            System.out.print(firstQA.getQuestion());

            //Declaring user input/Answer
            String QuestionAnswer = input.nextLine();

            if (QuestionAnswer.equalsIgnoreCase(firstQA.getAnswer())) {
                System.out.println("\nCorrect!\n");
                //If correct, score increases by 1
                score++;
            } else {
                System.out.println("\nIncorrect! " + "The correct answer was " + firstQA.getAnswer() + ".\n");

            }

          

            //Displays the second question
            QuestionAnswerPair SecondQA = selectedQA.get(1);
            System.out.print(SecondQA.getQuestion());

            //Converts QuestionAnswer input to lowercase for less percise input
            QuestionAnswer = input.nextLine();

            if (QuestionAnswer.equalsIgnoreCase(SecondQA.getAnswer())) {
                System.out.println("\nCorrect!\n");
                //If correct, score increases by 1
                score++;
            } else {
                System.out.println("\nIncorrect! " + "The correct answer was " + SecondQA.getAnswer() + ".\n");

            }

            //Displays the third question
            QuestionAnswerPair ThirdQA = selectedQA.get(2);
            System.out.print(ThirdQA.getQuestion());

            QuestionAnswer = input.nextLine();

            if (QuestionAnswer.equalsIgnoreCase(ThirdQA.getAnswer())) {
                System.out.println("\nCorrect!\n");
                //If correct, score increases by 1
                score++;
            } else {
                System.out.println("\nIncorrect! " + "The correct answer was " + ThirdQA.getAnswer() + ".\n");
            }

          

            ////Displays the fourth question
            QuestionAnswerPair FourthQA = selectedQA.get(3);
            System.out.print(FourthQA.getQuestion());

            QuestionAnswer = input.nextLine();

            if (QuestionAnswer.equalsIgnoreCase(FourthQA.getAnswer())) {
                System.out.println("\nCorrect!\n");
                //If correct, score increases by 1
                score++;
            } else {
                System.out.println("\nIncorrect! " + "The correct answer was " + FourthQA.getAnswer() + ".\n");
            }

            //Stores the currentTime in milliseconds at the end of the quiz 
            long endTime = System.currentTimeMillis();
           
            System.out.println("You've answered all the questions.\n");

            System.out.print("Calculating Score");
            
            //For loop to simulate loading questions
            for (int i = 0; i < 5; i++) {

                //The try-catch is required to use Thread.sleep
                try {
                    //Loading time in miliseconds
                    Thread.sleep(500);
                    //printed to the console based on i < 5
                    System.out.print(".");

                } catch (InterruptedException error) {

                }

            }

            
            //Displays the score based on the score++
            double percentage = (score / 4) * 100;
            System.out.println("\n\nYou got " + (int) score + " out of 4 answers correct!" + "(" + (int) percentage + "%)");

            
            
            //Calculation for the quiz time
            long testTime = endTime - StartTime;
            
            //Displays the test time in seconds 
            System.out.printf("\nTest time: " + "%.2f"  + " seconds.\n", (double)(testTime/1000.0));
            
            //Asks the user if they want to play again 
            System.out.print("\nPlay Again? (Yes/No) ");
            
            //User input for continuing
            String PlayAgainInput = input.next();
            
            //This while loops is use for invalid input 
            while (!PlayAgainInput.equalsIgnoreCase("yes") && !PlayAgainInput.equalsIgnoreCase("no")) {
                System.out.print("\nInvalid input, please type yes or no: ");
                PlayAgainInput = input.next();
            }
            
            
            
            if (PlayAgainInput.equalsIgnoreCase("no")) {
                //Ending output!
                System.out.println("\nThanks for playing! " + "(:\n");
                
                //If PlayAgain is false, the while loop doesn't run, therefore the program terminates naturally
                PlayAgain = false;
            } else if (PlayAgainInput.equalsIgnoreCase("yes")) 
                
                //If PlayAgain is true, the while loop loops
                PlayAgain = true;
               
                
        } //end of while loop

 
            
        }
  