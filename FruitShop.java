import java.util.Scanner;

public class FruitShop {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Fruit price list
        int apple = 2000;
        int mango = 1000;
        int during = 10000;
        int orange = 1500;
        // Fruit Quantity
        int appleQuantity = 50;
        int mangoQuantity = 50;
        int duringQuantity = 50;
        int orangeQuantity = 50;
        // Fruit Selection
        System.out.println("Welcome to the Fruit Shop!");
        System.out.println("Available fruits:");
        System.out.println("1. Apple - " + apple + "Kyat");
        System.out.println("2. Mango - " + mango + "Kyat");
        System.out.println("3. During - " + during + "Kyat");
        System.out.println("4. Orange - " + orange + "Kyat");
        // User input for fruit selection
        boolean condition = false;
        int fruitChoice = 0;
        int quantity = 0;
        int selectedPrice = 0;
        int totalCost = 0;
        while (!condition) {
            System.out.println("Please select a fruit with corresponding number:");
            fruitChoice = input.nextInt();
            if (fruitChoice < 1 || fruitChoice > 4) {
                System.out.println("Invalid selection. Please try again.");
                continue;
            }
            System.out.println("How many do you want to buy?");
            quantity = input.nextInt();
            // Check if the selected fruit is available
            switch (fruitChoice) {
                case 1:
                    if (appleQuantity >= quantity) {
                        appleQuantity -= quantity;
                        System.out.println("You have selected " + quantity + " apples.");
                    } else {
                        System.out.println("Sorry, we don't have enough apples.");
                        quantity = 0;
                    }
                    break;
                case 2:
                    if (mangoQuantity >= quantity) {
                        mangoQuantity -= quantity;
                        System.out.println("You have selected " + quantity + " mangoes.");
                    } else {
                        System.out.println("Sorry, we don't have enough mangoes.");
                        quantity = 0;
                    }
                    break;
                case 3:
                    if (duringQuantity >= quantity) {
                        duringQuantity -= quantity;
                        System.out.println("You have selected " + quantity + " durians.");
                    } else {
                        System.out.println("Sorry, we don't have enough durians.");
                        quantity = 0;
                    }
                    break;
                case 4:
                    if (orangeQuantity >= quantity) {
                        orangeQuantity -= quantity;
                        System.out.println("You have selected " + quantity + " oranges.");
                    } else {
                        System.out.println("Sorry, we don't have enough oranges.");
                        quantity = 0;
                    }
                    break;
                default:
                    // System.out.println("Invalid selection. Please try again.");
                    break;
            }
            // Check if the user wants to continue shopping
            System.out.println("Do you want to continue shopping? (y/n)");
            String continueShopping = input.next();
            if (continueShopping.equalsIgnoreCase("n")) {
                condition = true;
            } else if (continueShopping.equalsIgnoreCase("y")) {
                // Calculate first result

                condition = false;
            } else {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
                continue;
            }
            switch (fruitChoice) {
                case 1:
                    selectedPrice = apple * quantity;
                    break;
                case 2:
                    selectedPrice = mango * quantity;
                    break;
                case 3:
                    selectedPrice = during * quantity;
                    break;
                case 4:
                    selectedPrice = orange * quantity;
                    break;
                default:
                    System.out.println("Invalid selection.");
            }
            totalCost += selectedPrice;
        }
        // Calculate total cost
        System.out.println("Total cost: $" + totalCost);
    }

}
