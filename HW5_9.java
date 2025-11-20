import java.util.Scanner;

public class HW5_9 {
    public static String rockPaperScissorsGame(String userInput){
        String[] choices={"Rock","Paper","Scissors"};
        int computerChoiceIndex=(int)(Math.random()*3);
        String computerChoice=choices[computerChoiceIndex];
        
    
        String userChoice;
        if (userInput.equalsIgnoreCase("r")) {
            userChoice = "Rock";
        } else if (userInput.equalsIgnoreCase("p")) {
            userChoice = "Paper";
        } else if (userInput.equalsIgnoreCase("s")) {
            userChoice = "Scissors";
        } else {
            return "Invalid input! Please type r, p, or s.";
        }

        if (computerChoice.equals(userChoice)) {
            return "It's a tie! Both chose " + computerChoice;
        } else if ((computerChoice.equals("Rock") && userChoice.equals("Scissors")) ||
                   (computerChoice.equals("Scissors") && userChoice.equals("Paper")) ||
                   (computerChoice.equals("Paper") && userChoice.equals("Rock"))) {
            return "Computer wins! " + computerChoice + " beats " + userChoice;
        } else {
            return "User wins! " + userChoice + " beats " + computerChoice;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type r for rock, p for paper, s for scissors: ");
        String userInput = scanner.nextLine();
        String result = rockPaperScissorsGame(userInput);
        System.out.println(result);
        scanner.close();
    }
}