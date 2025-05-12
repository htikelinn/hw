import java.util.Scanner;

public class MenuNumber {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = false;

        while (!flag) {
            // Welcome to menu number system
            System.out.println("\n Menu Number System.");
            System.out.println("**********************");
            System.out.println("1.Check the number even or odd");
            System.out.println("2.Check the number (+,-,zero)");
            System.out.println("3.Check the number to get day.");
            System.out.println("4.Exit the program");

            // input user (choice menu)
            System.out.println("Enter menu number :");
            int menu = scan.nextInt();
            // Check menu(1,4)
            if (menu < 1 || menu > 4) {
                System.out.println("Invalid menu Number...");
                continue;
            }
            // switch (){}
            switch (menu) {
                case 1:
                    // Even and Odd
                    System.out.println("Check the number even or odd");
                    evenOradd();
                    break;
                case 2:
                    // Check the number
                    System.out.println("Check the number (+,-,zero)");
                    checkNumber();
                    break;
                case 3:
                    // Check the day
                    System.out.println("Check the number to get day");
                    weedDay();
                    break;
                case 4:
                    // Check the number
                    System.out.println("Exit the program.");
                    flag = true;
                    break;
                default:
                    break;
            }
        }
    }

    public static void evenOradd() {
        // System.out.println("Welcome even or odd");
        boolean flag = false;
        while (!flag) {
            System.out.println("Enter any number :");
            int number = scan.nextInt();
            if (number % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
            while (true) {
                System.out.println("Do you want to continue? (y/n)");
                char choice = scan.next().charAt(0);
                if (choice == 'y' || choice == 'Y') {
                    flag = false;
                    break;
                } else if (choice == 'n' || choice == 'N') {
                    flag = true;
                    System.out.println("Back to menu...");
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 'y' or 'n'.");
                }
            }
        }
    }

    public static void checkNumber() {
        // System.out.println("Welcome Check Number");
        boolean flag = false;
        while (!flag) {
            System.out.println("Enter any number :");
            double number = scan.nextInt();
            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is negative.");
            } else if (number == 0) {
                System.out.println("The number is zero.");
            } else {
                System.out.println("This is not number.");
            }
            while (true) {
                System.out.println("Do you want to continue? (y/n)");
                char choice = scan.next().charAt(0);
                if (choice == 'y' || choice == 'Y') {
                    flag = false;
                    break;
                } else if (choice == 'n' || choice == 'N') {
                    flag = true;
                    System.out.println("Back to menu...");
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 'y' or 'n'.");
                }
            }
        }
    }

    public static void weedDay() {
        // System.out.println("Welcome weekDay");
        boolean flag = false;
        while (!flag) {
            System.out.println("Enter any number (1-7) and 0 to Back menu:");
            int number = scan.nextInt();
            // if (number < 1 || number > 7) {
            // System.out.println("Invalid number...");
            // continue;
            // }

            switch (number) {
                case 0:
                    flag = true;
                    System.out.println("Back to menu...");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Only type 1-7");
                    // flag = true;
                    continue;
            }
        }
    }

}