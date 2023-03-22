package assignment_I;
import java.time.LocalTime;
import java.util.Date;

public class Dish {
    private int dishID;
    private String dishName;
    private LocalTime creationTime;

    public Dish(int dishID, String dishName) {
        this.dishID = dishID;
        this.dishName = dishName;
        this.creationTime = LocalTime.now();
    }

    public int getDishID() {
        return dishID;
    }

    public void setDishID(int dishID) {
        this.dishID = dishID;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }
    @Override
    public String toString() {
        return "Dish{" +
                "Dish ID = " + dishID +
                ", Dish Name = '" + dishName + '\'' +
                ", Creation Time = " + creationTime +
                '}';
    }
}

