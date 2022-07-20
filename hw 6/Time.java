public class Time {
	// set variables for our clock
	private int hours = 0;
	private int minutes = 0;
	private int seconds = 0;
	// constructor with no arguments
	public Time() {
		
	}
	// constructor with arguments
	public Time (int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	// getter method for hours
	public int getHours() {
		return hours;
	}
	// getter method for minutes
	public int getMinutes() {
		return minutes;
	}
	// getter method for seconds
	public int getSeconds() {
		return seconds;
	}
	// toString method
	public String toString() {
		return hours + ":" + minutes + ":" + seconds;
	}
	//increases number of seconds by 1 and checks if minutes and hours need to be incremented or reset
	public void tick() {
		seconds = seconds + 1;
		if(seconds >= 60) {
			minutes++;
			seconds = 0;
		}
		if(minutes >= 60) {
			hours++;
			minutes = 0;
		}
		if(hours >=24) {
			hours = 0;
		}
	}
	
	public void add(Time t) {
		this.seconds += t.getSeconds();
		this.minutes += t.getMinutes();
		this.minutes += (int)(this.seconds/60);
		this.seconds = this.seconds % 60;
		this.hours += t.getHours();
		this.hours += (int)(this.minutes/60);
		this.minutes = this.minutes%60;
		this.hours = this.hours%24;
	}
	
	public static void main (String[] args) {
		Time t1 = new Time(1, 59, 59);
		t1.tick();
		System.out.println("Time 1: " + t1);
		t1.tick();
		System.out.println("Time 1 ticked: " + t1);
		Time t2 = new  Time(23, 59, 59);
		t1.add(t2);
		System.out.println("Time 2 added to Time 1: " + t1);
		
	}
}
