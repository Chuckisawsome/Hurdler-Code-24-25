import java.util.Scanner;

public class Main {

    static Food[] menu = {
        new Food("Chick-fil-A Chicken Sandwich", 6.49, false, "entree"),
        new Food("Honey Pepper Pimento Sandwich", 7.25, false, "entree"),
        new Food("Spicy Chicken Sandwich", 6.99, false, "entree"),
        new Food("Grilled Chicken Sandwich", 7.99, false, "entree"),
        new Food("Chick-fil-A Nuggets", 6.59, false, "entree"),
        new Food("Chick-fil-A Chick-n-Strips", 6.85, false, "entree"),
        new Food("Chick-fil-A Cool Wrap", 9.99, false, "entree"),
        new Food("Cobb Salad", 10.99, true, "entree"),
        new Food("Spicy Southwest Salad", 11.19, true, "entree"),
        new Food("Chick-fil-A Waffle Potato Fries", 3.99, true, "side"),
        new Food("Fruit Cup", 5.09, true, "side"),
        new Food("Side Salad", 5.09, true, "side"),
        new Food("Mac and Cheese", 5.09, true, "side"),
        new Food("Chicken Noodle Soup", 4.89, false, "side"),
        new Food("Berry Parfait", 5.69, false, "side"),
        new Food("Hand-Spun Milkshake", 5.75, true, "dessert"),
        new Food("Frosted Lemonade", 5.65, true, "dessert"),
        new Food("Icedream Cone", 2.29, true, "dessert"),
        new Food("Chocolate Chunk Cookie", 2.15, false, "dessert"),
        new Food("Chocolate Fudge Brownie", 2.75, true, "dessert")
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello! Welcome to Chick-Fil-A, I am a chatbot that can help you with our menu items, nutrition facts, locations, and even trivia! What would you like to know?");
        String userResp = in.nextLine().toLowerCase().trim();

        while (userResp.compareTo(" ") > 0) {
            if (userResp.indexOf("menu") > -1) {
                respondMenu();
                System.out.println("");
            } else if (userResp.indexOf("facts") > -1 || userResp.indexOf("nutrition") > -1) {
                respondNutritionFacts();
                System.out.println("");
            } else if (userResp.indexOf("location") > -1) {
                respondLocation();
                System.out.println("");
            } else if (userResp.indexOf("trivia") > -1) {
                respondTrivia();
                System.out.println("");
            } else {
                System.out.println(randomUnknownResponse());
                System.out.println("");
            }
            userResp = in.nextLine().toLowerCase().trim();
        }
    }

    public static String randomUnknownResponse() {
        int random = (int) (Math.random() * 5);
        if (random == 1) {
            return "Sorry, I don't understand. Can you clarify? Please make sure your picking between Menu, Nutrition facts, Locations, and Trivia";
        } else if (random == 2) {
            return "Sorry, you're not making sense to me. Can you repeat that? Please pick between Menu, Nutrition facts, Locations, and Trivia";
        } else if (random == 3) {
            return "Dude, I can't understand what you're saying. Can you say that again? Your options are Menu, Nutrition facts, Locations, and Trivia";
        } else if (random == 4) {
            return "A little bit confused, can you try again? Please pick between Menu, Nutrition facts, Locations, and Trivia";
        } else {
            return "Sorry, man, you're going to have to try again. I didn't understand. There are several things I can help you with, including Menu, Nutrition facts, Locations, and Trivia";
        }
    }

    public static void respondMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Our establishment offers plenty of options, ranging from vegetarian meals to sides and entrees to even desserts!");
        System.out.println("Which would you like to know about?");
        String userResp = in.nextLine().toLowerCase().trim();

        while (userResp.compareTo(" ") > 0) {
            if (userResp.indexOf("vegetarian") > -1) {
                System.out.println("");
                System.out.println("Of course! Here are all of our vegetarian delights!");
                for (Food k : menu) {
                    if (k.getVeg()) {
                        System.out.println(k.getName());
                    }
                }
                System.out.println("Would you like to know about the prices of these delicacies?");
                String userResp3 = in.nextLine().toLowerCase().trim();
                if (userResp3.indexOf("y") > -1 || userResp3.indexOf("yes") > -1) {
                    System.out.println("");
                    System.out.println("For sure, here are the prices:");
                    for (Food k : menu) {
                        if (k.getVeg()) {
                            System.out.println(k.getName() + " - $" + k.getPrice());
                        }
                    }
                    System.out.println("Would you like to learn about anything else? Nutrition facts, Locations, or even more Menu info? Or we could play some Trivia!");
                    break;
                }
                else if (userResp3.indexOf("n") > -1 || userResp3.indexOf("no") > -1) {
                    System.out.println("Would you like to learn about anything else? Nutrition facts, Locations, or even more Menu info? Or we could play some Trivia!");
                }
                else{
                    System.out.println(randomUnknownResponse());
                }
                    
                break;
            } 
            else if (userResp.indexOf("sides") > -1) {
                System.out.println("");
                System.out.println("Of course! Here are all of our wonderful sides:");
                for (Food k : menu) {
                    if (k.getType().equals("side")) {
                        System.out.println(k.getName());
                    }
                }
                System.out.println("Would you like to know about the prices of these delicacies?");
                String userResp4 = in.nextLine().toLowerCase().trim();
                if (userResp4.indexOf("y") > -1 || userResp4.indexOf("yes") > -1) {
                    System.out.println("For sure, here are the prices:");
                    for (Food k : menu) {
                        if (k.getType().equals("side")) {
                            System.out.println(k.getName() + " - $" + k.getPrice());
                        }
                    }
                    System.out.println("Would you like to learn about anything else? Nutrition facts, Locations, or even more Menu info? Or we could play some Trivia!");
                }
                else if (userResp4.indexOf("n") > -1 || userResp4.indexOf("no") > -1) {
                    System.out.println("Would you like to learn about anything else? Nutrition facts, Locations, or even more Menu info? Or we could play some Trivia!");
                }
                else{
                    System.out.println(randomUnknownResponse());
                }
                break;
            } 
            else if (userResp.indexOf("entrees") > -1) {
                System.out.println("");
                System.out.println("Of course! Here are all of our absolutely mouthwatering entrees!");
                for (Food k : menu) {
                    if (k.getType().equals("entree")) {
                        System.out.println(k.getName());
                    }
                }
                System.out.println("Would you like to know about the prices of these delicacies?");
                String userResp3 = in.nextLine().toLowerCase().trim();
                if (userResp3.indexOf("y") > -1 || userResp3.indexOf("yes") > -1) {
                    System.out.println("For sure, here are the prices:");
                    for (Food k : menu) {
                        if (k.getType().equals("entree")) {
                            System.out.println(k.getName() + " - $" + k.getPrice());
                        }
                    }
                    System.out.println("Would you like to learn about anything else? Nutrition facts, Locations, or even more Menu info? Or we could play some Trivia!");
                    break;
                }
                else if (userResp3.indexOf("n") > -1 || userResp3.indexOf("no") > -1) {
                    System.out.println("Would you like to learn about anything else? Nutrition facts, Locations, or even more Menu info? Or we could play some Trivia!");
                }
                else{
                    System.out.println(randomUnknownResponse());
                }

            } 
            else if (userResp.indexOf("desserts") > -1) {
                System.out.println("");
                System.out.println("Of course! Here are all of our sugary desserts:");
                for (Food k : menu) {
                    if (k.getType().equals("dessert")) {
                        System.out.println(k.getName());
                    }
                }
                System.out.println("Would you like to know about the prices of these delicacies?");
                String userResp2 = in.nextLine().toLowerCase().trim();
                if (userResp2.indexOf("y") > -1 || userResp2.indexOf("yes") > -1) {
                    System.out.println("For sure, here are the prices:");
                    for (Food k : menu) {
                        if (k.getType().equals("dessert")) {
                            System.out.println(k.getName() + " - $" + k.getPrice());
                        }
                    }
                    System.out.println("Would you like to learn about anything else? Nutrition facts, Locations, or even more Menu info? Or we could play some Trivia!");
                    break;
                }
                else if (userResp2.indexOf("n") > -1 || userResp2.indexOf("no") > -1) {
                    System.out.println("Would you like to learn about anything else? Nutrition facts, Locations, or even more Menu info? Or we could play some Trivia!");
                }
                else{
                    System.out.println(randomUnknownResponse());
                }
                break;
            }
            else {
                System.out.println(randomUnknownResponse());
            }
            break;
        }
    }

    public static void respondNutritionFacts() {
        Scanner in = new Scanner (System.in);
        System.out.println("Our establishment offers full transparency about what's in our food and where it comes from.");
        System.out.println("Would you like to learn about our grilled vs. fried nutrition facts, or where we get our ingredients?");
        String userResp = in.nextLine().toLowerCase().trim();
        while (userResp.substring(0).compareTo(" ")>-1){
          if(userResp.indexOf("where")>-1 || userResp.indexOf("ingredients")>-1){
            System.out.println("Much of the food we serve at Chick-fil-A is raised and grown on farms spanning the United States, from");
          System.out.println("California to Florida – supporting thousands of jobs in local communities.");
            System.out.println("Would you like to learn about anything else? Menu, Locations, or even more Nutrition facts? Or we could do some fun Trivia!");
            break;
          }
          else if(userResp.indexOf("grilled")>-1 || userResp.indexOf("fried")>-1){
            System.out.println("We offer both grilled and fried chicken options for all of our entrees!");
            System.out.println("We understand that people may have different opinions from us, but we here at Chick Fil A believe that");
            System.out.println("Fried chicken is the tastier option whereas grilled contains less calories, making it the healthier option.");
            System.out.println("");
            System.out.println("Would you like to learn about anything else? Menu, Locations, or even more Nutrition facts? Or we could do some fun Trivia!");
            break;
          }
          else{
            System.out.println(randomUnknownResponse());
           }
          userResp = in.nextLine().toLowerCase().trim();
        }
       
    }

    public static void respondLocation(){
        Scanner in = new Scanner (System.in);
        System.out.println("Our tracking information says you live in the tri-valley. We have multiple locations near you!");
        System.out.println("Do you live in Dublin, Pleasanton, or Livermore?");
        String userResp = in.nextLine().toLowerCase().trim();
        while (userResp.substring(0).compareTo(" ")>-1){
        if(userResp.indexOf("dublin")>-1){
          System.out.println("Unfortunately Dublin has no Chick Fil A locationss at this point in time.");
        System.out.println("You must visit a neighboring town in order to get our delicious meals!");
          System.out.println("Would you like to learn about anything else? Menu, Nutrition facts, or even more locations? Or we could play some fun Trivia!");
          break;
        }
        else if(userResp.indexOf("pleasanton")>-1){
          System.out.println("Pleasanton has two Chick Fil A locations at 5785 Johnson Dr & 4501 Hopyard Rd!");
          System.out.println("Would you like to learn about anything else? Menu, Nutrition facts, or even more locations? Or we could play some fun Trivia!");
          break;
        }
        else if(userResp.indexOf("livermore")>-1){
          System.out.println("Livermore has one Chick Fil A location on 1754 N Livermore Ave!");
          System.out.println("Would you like to learn about anything else? Menu, Nutrition facts, or even more locations? Or we could play some fun Trivia!");
          break;
        }
        else{
          System.out.println(randomUnknownResponse());
          break;
         }
       }
       }

       public static void respondTrivia() {
        Scanner in = new Scanner(System.in);
        int score = 0;
        String playAgain;
    
        String RESET = "\u001B[0m";  //ANSI color codes
        String GREEN = "\u001B[32m";
        String RED = "\u001B[31m";
    
        String[][] questions = {
            {"What year did Chick-fil-A start serving breakfast?", "1) 1984", "2) 1991", "3) 1986", "4) 1980", "1", "1984"},
            {"What is Chick-fil-A's most popular menu item?", "1) Chicken Sandwich", "2) Chicken Nuggets", "3) Waffle Fries", "4) Salad", "1", "Chicken Sandwich"},
            {"What is the name of Chick-fil-A’s mascot?", "1) Cow", "2) Chicken", "3) Farmer Joe", "4) Chickie", "1", "Cow"},
            {"How many locations does Chick-fil-A have as of 2023?", "1) 1,200", "2) 2,500", "3) 4,000", "4) 5,000", "3", "4000"},
            {"Where is the headquarters of Chick-fil-A located?", "1) Atlanta, Georgia", "2) Dallas, Texas", "3) Charlotte, North Carolina", "4) Orlando, Florida", "1", "Atlanta, Georgia"},
            {"What type of oil does Chick-fil-A use for frying?", "1) Canola Oil", "2) Peanut Oil", "3) Vegetable Oil", "4) Olive Oil", "2", "Peanut Oil"},
            {"In which year did Chick-fil-A first open its doors?", "1) 1946", "2) 1954", "3) 1967", "4) 1975", "3", "1967"},
            {"Which famous advertising slogan is associated with Chick-fil-A?", "1) Eat Mor Chikin", "2) Chick-fil-A is the Way", "3) Have a Bite with Chick", "4) Taste the Best", "1", "Eat Mor Chikin"}
        };
    
        do {
            String[] selectedQuestion = questions[(int) (Math.random() * 8)];
    
            System.out.println("Welcome to Chick-fil-A Trivia! Let's see how much you know.");
            System.out.println("Here's the question:\n");
            System.out.println(selectedQuestion[0]);
            for (int i = 1; i <= 4; i++) {
                System.out.println(selectedQuestion[i]);
            }
    
            String answer = in.nextLine().trim().toLowerCase();
    
            if (answer.equals(selectedQuestion[5]) || answer.equals(selectedQuestion[6].toLowerCase())) {
                score += 10;
                System.out.println(GREEN + "Correct! You've earned 10 points." + RESET);
            } 
            else{
                System.out.println(RED + "That's not correct. The answer is " + selectedQuestion[5] + "). " + selectedQuestion[6] + RESET);
            }
    
            System.out.println("Your total score: " + score);
    
            System.out.println("Would you like to play another round of trivia? (yes/no)");
            playAgain = in.nextLine().toLowerCase().trim();
        } 
        while (playAgain.equals("yes") || playAgain.equals("y")); //used do-while loop to ensure that there is at least 1 trivia and then we check if the want to play again or not
    
        System.out.println("Thanks for playing! Your final score is: " + score);
        System.out.println("Would you like to learn about our menu or any other topic?");
    }
}
