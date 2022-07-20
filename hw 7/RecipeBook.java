import java.util.ArrayList;

public class RecipeBook {

	private String bookName;
	private ArrayList<CookingRecipe> recipes = new ArrayList();
	
	public RecipeBook(String bookName) {
		this.bookName = bookName;
	}
	
	public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients) {
		CookingRecipe c = new CookingRecipe(name);
		for(RecipeIngredient r:ingredients)
			c.addOrUpdateRecipeIngredient(r, r.getQuantity());
		recipes.add(c);
		return c;
	}
	
	public CookingRecipe removeRecipe(String name) {
		for(int i = 0; i < recipes.size(); i++)
			if(recipes.get(i).getName().equals(name)) {
				CookingRecipe c = recipes.get(i);
					recipes.remove(i);
					return c;
			}
		return null;
	}
	
	public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients) {
		ArrayList<CookingRecipe> a = new ArrayList();
		for(CookingRecipe c:recipes)
			if(c.hasAllIngredients(ingredients))
				a.add(c);
		CookingRecipe[] b = new CookingRecipe[a.size()];
		for(int i = 0; i < a.size(); i++)
			b[i] = a.get(i);
		return b;
	}
	
	public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients) {
		ArrayList<CookingRecipe> a = new ArrayList();
		for(CookingRecipe c:recipes)
			if(c.getNumberOfIngredients() <= numberOfIngredients)
				a.add(c);
		CookingRecipe[] b = new CookingRecipe[a.size()];
		for(int i = 0; i < a.size(); i++)
			b[i] = a.get(i);
		return b;
	}
	
	public CookingRecipe[] findRecipesLowCalories() {
		float min = recipes.get(0).calculateCalories();
		for(CookingRecipe c:recipes)
			if(min > c.calculateCalories())
				min = c.calculateCalories();
		
		ArrayList<CookingRecipe> a = new ArrayList();
		for(CookingRecipe c:recipes)
			if(min == c.calculateCalories())
				a.add(c);
		CookingRecipe[] b = new CookingRecipe[a.size()];
		for(int i = 0; i < a.size(); i++)
			b[i] = a.get(i);
		return b;
	}
	
	public String toString() {
		String s = "RecipeBook: " + bookName + "\n";
		for(CookingRecipe c:recipes)
			s += " " + c.toString() + "\n";
		return s;
	}
}
