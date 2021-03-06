package creational.builder;

public class BuilderPatternDemo {
	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal nonVegMealWithCoke = mealBuilder.prepareNonVegMealWithCoke();
		System.out.println("Non Veg Meal with Coke");
		nonVegMealWithCoke.showItems();
		System.out.println("Total Cost: " + nonVegMealWithCoke.getCost());

		Meal nonVegMealWithPepsi = mealBuilder.prepareNonVegMealWithPepsi();
		System.out.println("\n\n Non Veg Meal With Pepsi");
		nonVegMealWithPepsi.showItems();
		System.out.println("Total Cost: " + nonVegMealWithPepsi.getCost());

		Meal vegMealWithCoke = mealBuilder.prepareVegMealWithCoke();
		System.out.println("\n\n Veg Meal With Pepsi");
		vegMealWithCoke.showItems();
		System.out.println("Total Cost: " + vegMealWithCoke.getCost());

		Meal vegMealWithPepsi = mealBuilder.prepareVegMealWithPepsi();
		System.out.println("\n\n Veg Meal With Pepsi");
		vegMealWithPepsi.showItems();
		System.out.println("Total Cost: " + vegMealWithPepsi.getCost());

	}

}
