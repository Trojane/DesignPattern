public class MealBuilder {

    private Meal meal;

    public void qingzhengMeal(){
        meal = new Meal();
        meal.addMeal(new VegetableBurger());
        meal.addMeal(new Cola());
        meal.showMealList();
    }

    public void hanMeal(){
        meal = new Meal();
        meal.addMeal(new Burger());
        meal.addMeal(new Cola());
        meal.showMealList();
    }

}
