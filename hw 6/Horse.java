public class Horse {
	// define variables for horse
	private String name = "";
	private int weight;
	
	//constructor with no args
	public Horse() {
		
	}
	
	//constructor with only name arg
	public Horse(String name) {
		this.name = name;
	}
	
	//setter methods
	public void setName(String name) {
		this.name = name;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	//getter methods
	public String getName() {
		return name;
	}
	public int getWeight() {
		return weight;
	}
	
	//toString method
	@Override
	public String toString() {
		return name;
	}
}
