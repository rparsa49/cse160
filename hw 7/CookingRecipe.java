import java.util.ArrayList;

public class CookingRecipe {

	private String name;
	private ArrayList<RecipeIngredient> ingredients = new ArrayList();
	
	public CookingRecipe(String name) {
		this.name = name;
	}
	
	public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) {
		for(RecipeIngredient i:ingredients)
			if(i.getName().equals(ingredient.getName())) {
				i.setQuantity(quantity);
				return;
			}
	ingredients.add(new RecipeIngredient(ingredient.getName(), ingredient.getMeasuringUnit(), ingredient.getCaloriesPerUnit(), quantity));
	}

	public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
		for(RecipeIngredient i:ingredients)
			if(i.getName().equals(ingredient.getName()))
				return i;
		return null;
	}
	
	public RecipeIngredient getRecipeIngredient(String ingredientName) {
		for(RecipeIngredient i:ingredients)
			if(i.getName().equals(ingredientName))
				return i;
		return null;
	}
	
	public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {
		for(int i = 0; i < ingredients.size(); i++)
			if(ingredients.get(i).getName().equals(ingredient.getName())) {
				RecipeIngredient r = ingredients.get(i);
				ingredients.remove(i);
				return r;
			}
		return null;
	}

	public RecipeIngredient removeRecipeIngredient(String ingredientName) {
		for(int i = 0; i < ingredients.size(); i++)
			if(ingredients.get(i).getName().equals(ingredientName)) {
				RecipeIngredient r = ingredients.get(i);
				ingredients.remove(i);
				return r;
			}
		return null;
	}
	
	public float calculateCalories() {
		float sum = 0;
		for(RecipeIngredient i:ingredients)
			sum += i.getCalories();
		return sum;
		}
	
	public int getNumberOfIngredients() {
		return ingredients.size();
	}
	
	public String getName() {
		return name;
	}
	
	public boolean hasAllIngredients(RecipeIngredient[] a) {
		for(RecipeIngredient r:a)
			if(!ingredients.contains(r))
				return false;
		return true;
	}
	
	public String toString() {
		String s = "Recipe: " + name + ": ";
		for(Ingredient i:ingredients)
			s += i + ", ";
		return s;
	}
	
}
