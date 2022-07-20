public class RecipeIngredient extends Ingredient{

	private float quantity;
	
	public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity) {
		super(name, measuringUnit, caloriesPerUnit);
		this.quantity = quantity;
	}
	
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	
	public float getCalories() {
		return quantity * getCaloriesPerUnit();
	}
	
	public float getQuantity() {
		return quantity;
	}
	
	public String toString() {
		return super.toString() + " " + quantity + " " + getMeasuringUnit();
	}
	
	public boolean equals(Object o) {
		if(o instanceof RecipeIngredient) {
			RecipeIngredient r = (RecipeIngredient)o;
			return super.equals(r) && quantity == r.quantity;
		}
		return false;
	}
}
