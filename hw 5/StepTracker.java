public class StepTracker {

	private final int minSteps;
	private int activeDays;
	private int days;
	private int totalSteps;
	// construct step tracker object 
	public StepTracker (int m) {
		minSteps = m;
		activeDays = 0;
		days = 0;
		totalSteps = 0;
	}
	
	public void addDailySteps (int steps) {
		if (steps >= minSteps)
			activeDays++;
		days++;
		totalSteps += steps;
	}
	public int activeDays () {
		return activeDays;
	}
	public double averageSteps() {
		if (days == 0)
			return 0;
		return totalSteps / (double) days;
	}
	public static void main(String[] args) {

	}

}
