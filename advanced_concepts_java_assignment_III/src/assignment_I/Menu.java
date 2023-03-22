package assignment_I;
import java.time.LocalTime;
import java.util.ArrayList;
public class Menu {
        private static ArrayList<Dish> menuList = new ArrayList<>();

        static {
             // Adding dishes in the menu:
            menuList.add(new Dish(01, "Pizza"));
            menuList.add(new Dish(02, "Burger" ));
            menuList.add(new Dish(03, "Sandwich" ));
            menuList.add(new Dish(04, "Rolls"));
        }

        public static ArrayList<Dish> getMenuList() {
            return menuList;
        }
    }

