import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<CartItem> cart = new ArrayList<>();

            Food f1 = new Food(1, "Burger", 120);
            Food f2 = new Food(2, "Pizza", 250);
            Food f3 = new Food(3, "Pasta", 180);

            final int DISCOUNT_THRESHOLD = 500;
            final int DISCOUNT_AMOUNT = 50;

            int grandTotal = 0;
            int choice;

            do {
                printMenu(f1, f2, f3);
                choice = readInt(sc, "Enter your choice: ");

                if (choice >= 1 && choice <= 3) {
                    int qty = readInt(sc, "Enter quantity: ");

                    Food selected = (choice == 1) ? f1 : (choice == 2) ? f2 : f3;

                    int total = selected.getPrice() * qty;
                    grandTotal += total;

                    cart.add(new CartItem(selected.getName(), qty, total));
                    System.out.println("Item added to cart!");
                } else if (choice == 4) {
                    // exit
                } else {
                    System.out.println("Invalid choice. Please enter 1-4.");
                }

            } while (choice != 4);

            System.out.println("\n===== FINAL BILL =====");
            for (CartItem item : cart) {
                item.displayCartItem();
            }

            System.out.println("Total Bill = Rs." + grandTotal);

            if (grandTotal > DISCOUNT_THRESHOLD) {
                grandTotal -= DISCOUNT_AMOUNT;
                System.out.println("Discount Applied = Rs." + DISCOUNT_AMOUNT);
            }

            System.out.println("Final Amount = Rs." + grandTotal);
            System.out.println("Thank You For Ordering!");
        }
    }

    private static void printMenu(Food... foods) {
        System.out.println("\n===== FOOD MENU =====");
        for (Food f : foods) {
            f.display();
        }
        System.out.println("4. Exit");
    }

    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                int val = sc.nextInt();
                sc.nextLine(); // consume endline
                return val;
            } else {
                sc.nextLine(); // discard invalid
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}
    




