public class MainApp {

    public static void main(String[] args) {
        // Create an array of Item objects
        Item[] items = new Item[5];

        // Initialize the array with Item objects
        items[0] = new Item("Laptop", 1000, 5);
        items[1] = new Item("Smartphone", 800, 10);
        items[2] = new Item("Tablet", 500, 7);
        items[3] = new Item("Headphones", 200, 15);
        items[4] = new Item("Smartwatch", 300, 8);

        // Print the details of each item
        for (Item item : items) {
            System.out.println("Name: " + item.getName());
            System.out.println("Price: " + item.getPrice());
            System.out.println("Quantity: " + item.getQuantity());
            System.out.println();
        }
    }
}