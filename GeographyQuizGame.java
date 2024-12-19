//Programmer Name: Austin
//GitHub Username: welkins1


//Wildcard util import. 
import java.util.*;

//Utils used: Scanner, ArrayList, and Collections. 

class QuestionAnswerPair {
    
    //Question variable holds the question, answer variable holds the answer 
    private String question;
    private String answer;
    
    
    //This creates a question and answer pair 
    public QuestionAnswerPair(String question, String answer) {
        
        //Using "this" makes it so the program specifically knows which variable/object to refer to,
        this.question = question;
        this.answer = answer;
    }
    
    //Method to get the question
    public String getQuestion () {
        return question;
    }
    
    //Method to get the answer 
    public String getAnswer () {
        return answer;
    }
}

public class GeographyQuizGame {

    public static void main(String[] args) {
        
    
        

        //This boolean is used for the PlayAgain while loop
        boolean PlayAgain = true;
        
        
        //Program descrption
        
        //This while loop is used later to let the user continue playing / restart the program
        while (PlayAgain) {
           
              System.out.println("            _.-,=_\"\"\"--,_\n" +
"        .-\" =/7\"   _  .3#\"=.\n" +
"      ,#7  \" \"  ,//)#d#######=.\n" +
"    ,/ \"      # ,i-/###########=\n" +
"   /         _)#sm###=#=# #######\\\n" +
"  /         (#/\"_`;\\//#=#\\-#######\\\n" +
" /         ,d####-_.._.)##P########\\\n" +
",        ,\"############\\\\##bi- `\\| Y.\n" +
"|       .d##############b\\##P'   V  |\n" +
"|\\      '#################!\",       |\n" +
"|C.       \\###=############7        |\n" +
"'###.           )#########/         '\n" +
" \\#(             \\#######|         /\n" +
"  \\B             /#######7 /      /\n" +
"   \\             \\######\" /\"     /\n" +
"    `.            \\###7'       ,'\n" +
"      \"-_          `\"'      ,-'\n" +
"         \"-._           _.-\"\n" +
"             \"\"\"\"---\"\"\"\"");
            
            //Credit to Martin Schaffner for this Globe via ascii.co.uk
            
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

            EasyQA.add(new QuestionAnswerPair("What is the largest ocean on Earth? ", "Pacific Ocean"));

            EasyQA.add(new QuestionAnswerPair("What is the capital of Italy? ", "Rome"));

            EasyQA.add(new QuestionAnswerPair("Which country is famous for the Eiffel Tower? ", "France"));

            EasyQA.add(new QuestionAnswerPair("What is the smallest country in the world? ", "Vatican City"));

            EasyQA.add(new QuestionAnswerPair("What continent is Australia in? ", "Australia"));

            EasyQA.add(new QuestionAnswerPair("Which country is known as the Land of the Rising Sun? ", "Japan"));

            EasyQA.add(new QuestionAnswerPair("What is the capital of Canada? ", "Ottawa"));

            EasyQA.add(new QuestionAnswerPair("Which desert is the largest in the world? ", "Sahara Desert"));

            EasyQA.add(new QuestionAnswerPair("What is the capital of Mexico? ", "Mexico City"));

            EasyQA.add(new QuestionAnswerPair("What is the name of the longest river in the world? ", "Nile River"));

            EasyQA.add(new QuestionAnswerPair("What is the capital of Japan? ", "Tokyo"));

            EasyQA.add(new QuestionAnswerPair("Which country is famous for its pyramids? ", "Egypt"));

            EasyQA.add(new QuestionAnswerPair("What is the largest country in the world by land area? ", "Russia"));

            EasyQA.add(new QuestionAnswerPair("What continent is Brazil in? ", "South America"));

            EasyQA.add(new QuestionAnswerPair("Which country is known for its maple syrup? ", "Canada"));

            EasyQA.add(new QuestionAnswerPair("What is the capital of Spain? ", "Madrid"));

            EasyQA.add(new QuestionAnswerPair("Which U.S. state is known as the Sunshine State? ", "Florida"));

            EasyQA.add(new QuestionAnswerPair("What is the capital of India? ", "New Delhi"));

            EasyQA.add(new QuestionAnswerPair("Which continent is home to the Amazon Rainforest? ", "South America"));

            EasyQA.add(new QuestionAnswerPair("What is the primary language spoken in Brazil? ", "Portuguese"));

            EasyQA.add(new QuestionAnswerPair("What is the capital of the United Kingdom? ", "London"));
    
            EasyQA.add(new QuestionAnswerPair("Which ocean lies to the west of the United States? ", "Pacific Ocean"));

            EasyQA.add(new QuestionAnswerPair("Which country is famous for its Great Wall? ", "China"));

            EasyQA.add(new QuestionAnswerPair("What is the smallest continent by land area? ", "Australia"));



            //Create array list for MediumQA
            ArrayList<QuestionAnswerPair> MediumQA = new ArrayList<>();

            //Adds questions to MediumQA 
            MediumQA.add(new QuestionAnswerPair("What continent is Egypt in? ", "Africa"));

            MediumQA.add(new QuestionAnswerPair("What is the smallest country in the world? ", "Vatican City"));

            MediumQA.add(new QuestionAnswerPair("What country has the 3rd largest population? ", "United States of America"));

            MediumQA.add(new QuestionAnswerPair("What is the capital of Sweden? ", "Stockholm"));

            MediumQA.add(new QuestionAnswerPair("Which of the following countries do not have red, white, or blue on their flag?\n \nRussia, Japan, Indonesia, or Jamaica ", "Jamaica"));

            MediumQA.add(new QuestionAnswerPair("What is the longest river in South America? ", "Amazon River"));

            MediumQA.add(new QuestionAnswerPair("What is the capital of South Korea? ", "Seoul"));

            MediumQA.add(new QuestionAnswerPair("Which country is the largest producer of coffee? ", "Brazil"));

            MediumQA.add(new QuestionAnswerPair("What mountain range is Mount Everest a part of? ", "Himalayas"));

            MediumQA.add(new QuestionAnswerPair("What is the capital of Kenya? ", "Nairobi"));

            MediumQA.add(new QuestionAnswerPair("What country is home to the ancient city of Petra? ", "Jordan"));

            MediumQA.add(new QuestionAnswerPair("What is the official language of Egypt? ", "Arabic"));

            MediumQA.add(new QuestionAnswerPair("Which country has the most UNESCO World Heritage Sites? ", "Italy"));

            MediumQA.add(new QuestionAnswerPair("What is the capital of Argentina? ", "Buenos Aires"));

            MediumQA.add(new QuestionAnswerPair("Which African country has the highest population? ", "Nigeria"));

            MediumQA.add(new QuestionAnswerPair("What is the capital of Saudi Arabia? ", "Riyadh"));

            MediumQA.add(new QuestionAnswerPair("Which U.S. state is closest to the continent of Asia? ", "Alaska"));

            MediumQA.add(new QuestionAnswerPair("What is the largest island in the world? ", "Greenland"));


            //Creates array list for HardQA
            ArrayList<QuestionAnswerPair> HardQA = new ArrayList<>();

            //Adds Questiosn to HardQA
            HardQA.add(new QuestionAnswerPair("What is the capital of Burkina Faso? ", "Ouagadougou"));

            HardQA.add(new QuestionAnswerPair("What continent is Palau located in? ", "Oceania"));

            HardQA.add(new QuestionAnswerPair("What country has the most natural lakes? ", "Canada"));

            HardQA.add(new QuestionAnswerPair("What is the name of the mountain range that separates Europe and Asia? ", "Ural Mountains"));

            HardQA.add(new QuestionAnswerPair("What is the primary currency used in South Africa? ", "South African Rand"));

            HardQA.add(new QuestionAnswerPair("What is the second largest desert in the world? ", "Arctic Desert"));

            HardQA.add(new QuestionAnswerPair("What is the capital of Bhutan? ", "Thimphu"));

            HardQA.add(new QuestionAnswerPair("Which country is home to the K2 mountain? ", "Pakistan"));

            HardQA.add(new QuestionAnswerPair("What is the smallest country in South America by land area? ", "Suriname"));

            HardQA.add(new QuestionAnswerPair("What is the capital of Kyrgyzstan? ", "Bishkek"));

            HardQA.add(new QuestionAnswerPair("What is the name of the deepest part of the world's oceans? ", "Mariana Trench"));

            HardQA.add(new QuestionAnswerPair("What is the capital of Tajikistan? ", "Dushanbe"));

            HardQA.add(new QuestionAnswerPair("Which African country has the longest coastline? ", "Somalia"));

            HardQA.add(new QuestionAnswerPair("What is the name of the longest mountain range in the world? ", "Andes Mountains"));

            HardQA.add(new QuestionAnswerPair("What is the capital of Papua New Guinea? ", "Port Moresby"));

            HardQA.add(new QuestionAnswerPair("What is the name of the river that flows through Baghdad? ", "Tigris River"));

            HardQA.add(new QuestionAnswerPair("Which country is known as the Land of a Thousand Hills? ", "Rwanda"));

            HardQA.add(new QuestionAnswerPair("What is the capital of Eritrea? ", "Asmara"));

            HardQA.add(new QuestionAnswerPair("What is the largest lake in Africa? ", "Lake Victoria"));

            HardQA.add(new QuestionAnswerPair("What is the capital of Moldova? ", "Chisinau"));

            HardQA.add(new QuestionAnswerPair("What is the only country that shares a land border with Brunei? ", "Malaysia"));


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
}
      
