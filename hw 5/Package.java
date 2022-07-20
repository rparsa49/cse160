public class Package {
	private String sender;
	private String recipient;
	private int cost = 0;
	private int distance;
	public Package(String sender,  String recipient, int distance) {
	        this.sender = sender;
	        this.recipient = recipient;
	        this.distance = distance;
	}
	public int getDistance() {
	        return distance;
	     }
	     public int getCost() {
	        return cost;
	     }
	     public void setCost(int cost) {
	        this.cost = cost; 
	     }
	     static int shippingCost(Package []packages1, int []costSchedule1) {
	    	 int totalCost = 0;
	    	 
	    	 for(int i = 0; i < packages1.length; i++) {
	    		 if(packages1[i].getDistance()<100)
	    			 packages1[i].setCost(costSchedule1[i]);
	    		 else if(packages1[i].getDistance()<300)
	    			 packages1[i].setCost(costSchedule1[i]);
	    		 else if(packages1[i].getDistance()<500)
	    			 packages1[i].setCost(costSchedule1[i]);
	    		 else 
	    			 packages1[i].setCost(costSchedule1[i]);
	    		 totalCost += costSchedule1[i];
	    	 }
	    	 return totalCost;
	     }
	public static void main(String[] args) {
		Package[] packages1 = {new Package("Monmouth", "Appleby", 144), 
		        new Package("Larkinge", "Ballachulish", 65), 
		        new Package("Malrton", "Auchtermuchty", 872), 
		        new Package("Monmouth", "Anghor Thom", 937)};
		int[] costSchedule1 = {10, 16, 37, 49};
		System.out.println(shippingCost(packages1, costSchedule1));
	}

}
