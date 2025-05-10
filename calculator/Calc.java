import java.util.Scanner;

class Calc {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // Using try-with-resources to ensure scanner is closed
            System.out.print("Enter First Number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter an operator (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter Second Number: ");
            int num2 = scanner.nextInt();

            calculator(num1, num2, operator);
        }
    }

    static void calculator(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result quotient: " + (num1 / num2));
                } else {
                    System.out.println("Any number cannot be divided by 0.");
                }
                break;
            case '%':
                if (num2 != 0) {
                    System.out.println("Result Reminder: " + (num1 % num2));
                } else {
                    System.out.println("Any number cannot be divided by 0.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
        }
    }
}