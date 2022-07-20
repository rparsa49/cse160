public class Ingredient {
	private String name, measuringUnit;
	private int caloriesPerUnit;
	
	public Ingredient(String name, String measuringUnit, int caloriesPerUnit) {
		this.name = name;
		this.measuringUnit = measuringUnit;
		this.caloriesPerUnit = caloriesPerUnit;
	}
	
	public String getMeasuringUnit() {
		return measuringUnit;
	}
	
	public int getCaloriesPerUnit() {
		return caloriesPerUnit;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name;
	}
	
	
	public boolean equals(Object o) {
		if(o instanceof Ingredient)
			return((Ingredient)o).name.equals(name);
		return false;
	}
}
