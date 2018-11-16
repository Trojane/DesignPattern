import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> itemList;

    public Meal() {
        itemList = new ArrayList<>();
    }

    public Meal(List<Item> itemList) {
        this.itemList = itemList;
    }

    public void addMeal(Item item){
        itemList.add(item);
    }

    public void showMealList(){
        for(Item item:itemList){
            System.out.println("Item Name:"+item.name());
            System.out.println("Item Packing:"+item.packing().Pack());
            System.out.println("Item Cost:"+item.price());
        }
    }
}
