    
import java.util.Scanner;

public class Asstest01 {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean error;
        int playerHand = 0;
        int cpuHand = 0;
        int youWin = 0; //0 lose, 1 win, 2 draw
        String hands[] = {"Paper", "Scissor", "Stone"};
        String winLose[] = {"You Lose", "You Win", "It's Draw"};
        String userInput;
        char choice;
        
        do {
            do {
                error = false; 
                System.out.print("0:Paper 1:Scissor 2:Stone x:Exit ?");
                userInput = sc.nextLine();
                if (userInput.length() != 1){
                    error = true;
                    System.out.println("Your choices should be 0,1,2,x!");
                    continue;
                }
                choice = userInput.charAt(0);
                if (choice == 'x'){
                  System.out.println("Bye Bye!");
                  return;
                }
                playerHand = choice - 48;
                if(playerHand<0 || playerHand>2){
                  error = true;
                  System.out.println("Your choices should be 0,1,2,x!");
                }
            } while (error);
            cpuHand = (int) (Math.random() * 3); 

            if (playerHand == cpuHand) {
                youWin = 2;
            } else if (playerHand == 0 && cpuHand == 2) {
                youWin = 1;
            } else if (playerHand == 1 && cpuHand == 0) {
                youWin = 1;
            } else if (playerHand == 2 && cpuHand == 1) {
                youWin = 1;
            } else
                youWin = 0;

            System.out.println("You choose " + hands[playerHand]
                    + " vs CPU choose " + hands[cpuHand]);        
            System.out.println(winLose[youWin]);
        } while (true);
    }



}
