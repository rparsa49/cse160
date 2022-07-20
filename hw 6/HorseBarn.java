public class HorseBarn extends Horse{

	//array with spaces for horse
	private static Horse[] spaces;
	
	//horse barn constructor with arguments for name and spaces
	public HorseBarn(int size) {
		spaces = new Horse[size];
	}
	
	//return the spot that contains the horse with the specified name
	public int findHorseSpace(String horseName) {
		//checks for spaces equal to spaces 1 less than that of the array
		for(int i = 0; i < spaces.length; i++) {
		// checks if name of horse in that spot is equal to the specified name
			if(spaces[i] != null && horseName.equals(spaces[i].getName())){
		// if name matches, return the number of the spot
				return i;
			}
		}
		// return -1 if not found
		return -1;
	}
	
	//reorders horses so there are no empty spaces between any two horses
	public void consolidate() {
		for(int i = 0; i < spaces.length - 1; i++) {
		//checks if the given space has an empty stall
			if(spaces[i] == null) {
		//if true, begins to increment through the spaces and:
				for (int j = i + 1; j < spaces.length; j++) {
					if(spaces[j] != null) {
		// if space doesn't equal to null, the empty space takes on the name of the other space
						spaces[i] = spaces[j];
		// previous named space takes on the empty space to clear any holes in the arrangement
						spaces[j] = null;
						j = spaces.length;
					}
				}
			}
		}
	}
		// adds horse to barn
	public void addHorse(Horse h) {
		for(int i = 0; i < spaces.length; i++) {
			if(spaces[i] == null) {
				spaces[i] = h;
				break;
			}
		}
	}
		//removes horse from barn
	public void removeHorse(Horse h) {
		for(int i = 0; i < spaces.length; i++) {
			if(spaces[i].getName().equals(h.getName())) {
				spaces[i] = null;
				break;
			}
		}
	}
	
	public static void getSpace(HorseBarn b) {
		for(int i = 0; i < spaces.length; i++) {
			System.out.print(spaces[i] + ", ");
		}
	}
	
	public static void main (String[] args) {
		
		HorseBarn  b = new HorseBarn(10);
		b.addHorse(new Horse("one"));
		b.addHorse(new Horse( "two"));
		b.addHorse(new Horse( "three"));
		b.addHorse(new Horse( "four"));
		b.addHorse(new Horse( "five"));
		b.removeHorse( new Horse( "one"));
		getSpace(b);; // null two three four five null  null  null  null  null 
		System.out.println();
		b.consolidate();
		getSpace(b);
		System.out.println();
		// two three four five null  null  null  null  null null
		System.out.println(b.findHorseSpace("two")); // 0
		
	} 
}


