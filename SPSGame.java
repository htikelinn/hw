import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SPSGame {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // showAboutGame();
        // generateRandom();
        boolean condition = false;
        while (!condition) {
            int usrnum = showAboutGame();

            if (usrnum == 4) {
                System.out.println("Exit the game.");
                return;
            } else {
                int randomnum = generateRandom();
                compareNumber(usrnum, randomnum);
            }
            System.out.println("Do you want to Playagain? (y/n)");
            String nextRound = scan.next();
            if (nextRound.equalsIgnoreCase("n")) {
                condition = true;
                // System.out.println("Thanks for playing!");
                System.out.println("Do you want to see the result? (y/n)");
                String seeResult = scan.next();
                if (seeResult.equalsIgnoreCase("y")) {
                    System.out.println("You can see the result.");
                } else if (seeResult.equalsIgnoreCase("n")) {
                    System.out.println("Thanks for playing!");
                } else {
                    System.out.println("Invalid input. Please enter 'y' or 'n'.");
                    continue;
                }
            } else if (nextRound.equalsIgnoreCase("y")) {
                // Calculate first result
                condition = false;
                // continue;
            } else {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
                continue;
            }
        }

        // compareNumber(usrnum, randomnum);

    }

    static int showAboutGame() {
        boolean flag = false;
        int input = 0;
        while (!flag) {
            System.out.println("Welcome to the Scissors, Paper, Stone Game.");
            System.out.println("***************************************");
            System.out.println("1. Scissors");
            System.out.println("2. Paper");
            System.out.println("3. Stone");
            System.out.println("4. Exit");
            // input user (choice menu)
            System.out.println("Enter your choice:");
            input = scan.nextInt();
            // scan.nextLine();
            if (input < 1 || input > 4) {
                System.out.println("Invalid selection. Please try again.");
                continue;
            } else
                switch (input) {
                    case 1:
                        System.out.print("Scissors");
                        return input;
                    case 2:
                        System.out.print("Paper");
                        return input;
                    case 3:
                        System.out.print("Stone");
                        return input;
                    case 4:
                        // System.out.print("Exit");
                        flag = true;
                        break;
                    default:
                        System.out.print("Wrong input Error");
                        break;
                }
        }
        return input;
    }

    static int generateRandom() {
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 4);
        System.out.print(" VS ");
        switch (randomNumber) {
            case 1:
                System.out.print("Scissors");
                break;
            case 2:
                System.out.print("Paper");
                break;
            case 3:
                System.out.print("Stone");
                break;
            default:
                break;
        }
        return randomNumber;
    }

    static void compareNumber(int usrnumber, int randomnumber) {
        if (usrnumber < randomnumber) {
            System.out.println("\n User Win!");
        } else if (usrnumber > randomnumber) {
            System.out.println("\n Computer Win!");
        } else
            System.out.println("\n Draw");
        // // res = usrnum + randomnum;
        // // return res;
    }
}
