package assignment_I;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
          // Using switch, to directly perform the action that user wants.
        do {
            System.out.println("Press 1: To display Dishes.");
            System.out.println("Press 2: To search Dishes.");
            System.out.println("Press 0: To exit.");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    displayDishes();
                    break;
                case 2:
                    searchDish();
                    break;
                case 0:
                    System.out.println("Thank you for using our restaurant system!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    // This function will display the number of dishes, offered by our restaurant.
    private static void displayDishes() {
        ArrayList<Dish> menuList = Menu.getMenuList();

        System.out.println("Here are the dishes offered by our restaurant:");
        for (Dish dish : menuList) {
            System.out.println(dish.toString());
        }
    }

    // This function is used to search the dishes, by using their dish ID.
    private static void searchDish() {
        Scanner input = new Scanner(System.in);
        ArrayList<Dish> menuList = Menu.getMenuList();


        System.out.print("Enter the dish ID: ");
        int dishID = input.nextInt();
        //Using advanced for loop, to show the available dishes.
        for (Dish dish : menuList) {
            if (dish.getDishID() == dishID) {
                System.out.println("Here are the details of the dish:");
                System.out.println(dish.toString());
                return;
            }
        }

        System.out.println("Sorry, we do not offer any dish with the entered ID.");
    }
}

