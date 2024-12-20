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
    public String getQuestion() {
        return question;
    }

    //Method to get the answer 
    public String getAnswer() {
        return answer;
    }
}


public class GeographyQuizGame {

    //This method shows Strings fading into the console as opposed to just appearing.
    public static void FadeIn(String sentence, int speed) throws InterruptedException { //try catch doesn't have to be used with thrown exception 
                                                     
       //for each loop that prints the String char by char 
        for (char c : sentence.toCharArray()) { 
            System.out.print(c);
            Thread.sleep(speed); //slows down the program/thread by miliseconds (speed)
        }
      
    }
    
    //This method simulates a loading feature
    public static void Loading(String words) throws InterruptedException { //try- catch doesn't have to be used with thrown exception 
       
        System.out.print(words);
        //For loop to simulate loading questions
        for (int i = 0; i < 5; i++) {

            //Slows down the time in miliseconds 
            Thread.sleep(500);
            //printed to the console based on i < 5
            System.out.print(".");

        }
        System.out.println("\n");
    }
    

    public static void main(String[] args) throws InterruptedException {

        //This boolean is used for the PlayAgain while loop
        boolean PlayAgain = true;

     
        //This while loop is used later to let the user continue playing / restart the program
        while (PlayAgain) {
            
            
          //Credit to Martin Schaffner for this Globe via ascii.co.uk
           String Globe[] = {"                     _.-,=_\"\"\"--,_" ,
                  "                 .-\" =/7\"   _  .3#\"=." ,
                  "               ,#7  \" \"  ,//)#d#######=." ,
                  "             ,/ \"      # ,i-/###########=" ,
                  "            /         _)#sm###=#=# #######\\" , 
                  "           /         (#/\"_`;\\//#=#\\-#######\\" ,
                  "          /         ,d####-_.._.)##P########\\" ,
                  "         ,        ,\"############\\\\##bi- `\\| Y." ,
                  "         |       .d##############b\\##P'   V  |" ,
                  "         |\\      '#################!\",       |" ,
                  "        |C.       \\###=############7        |" , 
                  "         '###.           )#########/         '" ,
                  "          \\#(             \\#######|         /" ,
                  "           \\B             /#######7 /      /" ,
                  "            \\             \\######\" /\"     /" ,
                  "             `.            \\###7'       ,'" , 
                  "               \"-_          `\"'      ,-'" ,
                  "                  \"-._           _.-\"" ,
                  "                      \"\"\"\"---\"\"\"\""};

           
           //For each loop prints each line of the ASCII art char by char
            for (String line : Globe) {
            for (char c : line.toCharArray()) {
                System.out.print(c);
                Thread.sleep(1); // thread is paused for 1 millisecond
            }
            System.out.println(); //spacer 
        }
    
                
                 //Program descrption
           
            String Description [] = {"Hello!", 
           "\nWelcome to the World Geography Quiz game.\n", 
           "This game tests your knowlege on various World Geography facts\n" +
            "such as capitals, continents, flags, and populations.",                    
           "\nType 'q' to quit at any time"};
                               
        
            //For each loop prints each line of the program description char by char
            for (String line: Description) {
               for (char c: line.toCharArray()) {
                   System.out.print(c);
                   Thread.sleep(5); //sleeps for 5 milliseconds 
               }
            System.out.println(); //spacer 
        }
                   
            
                  


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

            MediumQA.add(new QuestionAnswerPair("Which of the following countries do not have red, white, or blue on their flag?\n \nRussia, Japan, Indonesia, or Jamaica? ", "Jamaica"));

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
            System.out.print("\nPlease select your difficutly (Easy, Medium or Hard): ");

            //Converts difficulty string to lowercase for less percise input
            String Difficulty = input.nextLine();

            if (Difficulty.equalsIgnoreCase("q")) {
                return;
            }

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
                } else if (Difficulty.equalsIgnoreCase("q")){
                    return;
                    
                } else {
                    //Invalid input else
                    System.out.print("\nInvalid difficutly, please select again: ");
                    Difficulty = input.nextLine().toLowerCase();

                }

            }

            //Displays selected difficutly with FadeIn transition 
            FadeIn("\nYou selected " + Difficulty.toLowerCase() + " difficulty.\n\n", 50);

              //Call to Loading transition method 
            Loading("Loading Questions");
          

            //Variable for calculating score
            double score = 0;

            //Shuffles the questions 
            Collections.shuffle(selectedQA);

            //Stores currentTime in milliseconds at the start of the quiz (acts as a timer)
            long StartTime = System.currentTimeMillis();
      
            //Displays the first question
            QuestionAnswerPair firstQA = selectedQA.get(0);
            FadeIn(firstQA.getQuestion(), 30);

            //Declaring user input/Answer
            String QuestionAnswer = input.nextLine();

            if (QuestionAnswer.equalsIgnoreCase("q")) 
                return; //quits program 
            

            if (QuestionAnswer.equalsIgnoreCase(firstQA.getAnswer())) {
                System.out.println("\nCorrect!\n");
                //If correct, score increases by 1
                score++;
            } else {
                System.out.println("\nIncorrect! " + "The correct answer was " + firstQA.getAnswer() + ".\n");

            }

            
            //Displays the second question
            QuestionAnswerPair SecondQA = selectedQA.get(1);
            FadeIn(SecondQA.getQuestion(), 30);

            QuestionAnswer = input.nextLine();
            
             if (QuestionAnswer.equalsIgnoreCase("q")) 
                return;

            if (QuestionAnswer.equalsIgnoreCase(SecondQA.getAnswer())) {
                System.out.println("\nCorrect!\n");
                //If correct, score increases by 1
                score++;
            } else {
                System.out.println("\nIncorrect! " + "The correct answer was " + SecondQA.getAnswer() + ".\n");

            }

            //Displays the third question
            QuestionAnswerPair ThirdQA = selectedQA.get(2);
            FadeIn(ThirdQA.getQuestion(), 30);

            QuestionAnswer = input.nextLine();
            
             if (QuestionAnswer.equalsIgnoreCase("q")) 
                return;

            if (QuestionAnswer.equalsIgnoreCase(ThirdQA.getAnswer())) {
                System.out.println("\nCorrect!\n");
                //If correct, score increases by 1
                score++;
            } else {
                System.out.println("\nIncorrect! " + "The correct answer was " + ThirdQA.getAnswer() + ".\n");
            }

            //Displays the fourth question
            QuestionAnswerPair FourthQA = selectedQA.get(3);
            FadeIn(FourthQA.getQuestion(), 30);

            QuestionAnswer = input.nextLine();
            
             if (QuestionAnswer.equalsIgnoreCase("q")) 
                return;

            if (QuestionAnswer.equalsIgnoreCase(FourthQA.getAnswer())) {
                System.out.println("\nCorrect!\n");
                //If correct, score increases by 1
                score++;
            } else {
                System.out.println("\nIncorrect! " + "The correct answer was " + FourthQA.getAnswer() + ".\n");
            }
            
            //Displays fith question 
             QuestionAnswerPair FithQA = selectedQA.get(4);
            FadeIn(FithQA.getQuestion(), 30);

            QuestionAnswer = input.nextLine();
            
             if (QuestionAnswer.equalsIgnoreCase("q")) 
                return;
            
            

            if (QuestionAnswer.equalsIgnoreCase(FithQA.getAnswer())) {
                System.out.println("\nCorrect!\n");
                //If correct, score increases by 1
                score++;
            } else {
                System.out.println("\nIncorrect! " + "The correct answer was " + FithQA.getAnswer() + ".\n");
            }
            
            //Stores the currentTime in milliseconds at the end of the quiz 
            long endTime = System.currentTimeMillis();

           
            FadeIn("You've answered all the questions!\n", 50);

            Loading("\nCalculating Score");

          
            //Displays the score based on the score++
            double percentage = (score / 5) * 100;
            FadeIn("You got " + (int) score + " out of 5 questions correct!" + "(" + (int) percentage + "%)", 30);

            //Calculation for the quiz time
            long testTime = endTime - StartTime;

            //Displays the test time in seconds 
            System.out.printf("\n\nTest time: " + "%.2f" + " seconds.\n", (double) (testTime / 1000.0));

            //Asks the user if they want to play again 
            FadeIn("\nPlay Again? (Yes/No) ", 45);

            //User input for continuing
            String PlayAgainInput = input.next();

            //This while loops is use for invalid input 
            while (!PlayAgainInput.equalsIgnoreCase("yes") && !PlayAgainInput.equalsIgnoreCase("no")) {
                System.out.print("\nInvalid input, please type yes or no: ");
                PlayAgainInput = input.next();
            }

            if (PlayAgainInput.equalsIgnoreCase("no")) {
                //Ending output!
                FadeIn("\nThanks for playing! " + "(:\n", 40);

                //If PlayAgain is false, the while loop doesn't run, therefore the program terminates naturally
                PlayAgain = false;
            } else if (PlayAgainInput.equalsIgnoreCase("yes")) //If PlayAgain is true, the while loop loops
            {
                PlayAgain = true;
            }

        } //end of PlayAgain while loop

    }
}

