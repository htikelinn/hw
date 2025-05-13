import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SPSGame {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // showAboutGame();
        // generateRandom();
        int usrnum = showAboutGame();
        int randomnum = generateRandom();
        // compareNumber(usrnum, randomnum);
        if (usrnum < randomnum) {
            System.out.println("User Win!");
        } else if (usrnum > randomnum) {
            System.out.println("Computer Win");
        } else
            System.out.println("Draw");
    }

    static int showAboutGame() {
        System.out.println("Enter Scissors->1 or Paper->2 or Stone->3");
        int input = scan.nextInt();
        scan.nextLine();
        switch (input) {
            case 1:
                System.out.println("Scissors");
                break;
            case 2:
                System.out.println("Paper");
                break;
            case 3:
                System.out.println("Stone");
                break;
            default:
                System.out.println("Wrong input Error");
                break;
        }
        return input;
    }

    static int generateRandom() {
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 3);
        System.out.println(randomNumber);
        switch (randomNumber) {
            case 1:
                System.out.println("Scissors");
                break;
            case 2:
                System.out.println("Paper");
                break;
            case 3:
                System.out.println("Stone");
                break;
            default:
                break;
        }
        return randomNumber;
    }

    // static void compareNumber(int usrnumber, int randomnumber) {
    // if (usrnumber < randomnumber) {
    // System.out.println("User Win!");
    // } else if (usrnumber > randomnumber) {
    // System.out.println("Computer Win");
    // } else
    // System.out.println("Draw");
    // // res = usrnum + randomnum;
    // // return res;
    // }
}
