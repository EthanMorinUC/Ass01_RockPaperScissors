import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            String canContinue = "";
            String playerA = "";
            String playerB = "";
            Scanner in = new Scanner(System.in);

            do {
                do {
                    System.out.print("Player A, pick Rock, Paper, or Scissors (R, P, or S): ");
                    playerA = in.next().toUpperCase();
                    if (!playerA.equals("R") && !playerA.equals("P") && !playerA.equals("S")) {
                        System.out.println("Enter a valid input (R, P, S)");
                    }
                } while (!playerA.equals("R") && !playerA.equals("P") && !playerA.equals("S"));

                do {
                    System.out.print("Player B, pick Rock, Paper, or Scissors (R, P, or S): ");
                    playerB = in.next().toUpperCase();
                    if (!playerB.equals("R") && !playerB.equals("P") && !playerB.equals("S")) {
                        System.out.println("Enter a valid input (R, P, S)");
                    }
                } while (!playerB.equals("R") && !playerB.equals("P") && !playerB.equals("S"));

                if (playerA.equals(playerB)) {
                    System.out.println("Player A and Player B tied!");
                    System.out.println(playerA + " vs " + playerB + " is a Tie!");
                } else if ((playerA.equals("R") && playerB.equals("P")) || (playerA.equals("P") && playerB.equals("S")) || (playerA.equals("S") && playerB.equals("R"))) {
                    System.out.println("Player B wins!");
                } else {
                    System.out.println("Player A wins!");
                }

                if ((playerA.equals("R") || playerB.equals("R")) && (playerA.equals("S") || playerB.equals("S"))) {
                    System.out.println("Rock breaks Scissors");
                }
                else if ((playerA.equals("P") || playerB.equals("P")) && (playerA.equals("R") || playerB.equals("R"))){
                    System.out.println("Paper covers Rock");
                }
                else if ((playerA.equals("S") || playerB.equals("S")) && (playerA.equals("P") || playerB.equals("P"))) {
                    System.out.println("Scissors cuts Paper");
                }
                System.out.print("Do you want to continue (Y/N)? ");
                canContinue = in.next().toUpperCase();
            } while (canContinue.equals("Y"));
    }
}