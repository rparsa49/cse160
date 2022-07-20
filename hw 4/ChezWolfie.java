public class ChezWolfie {
	
	public static void main(String[] args) {
		System.out.print(cafe_day(new int[][]{{5, 1, 2, 3}, {2, 5, 0, 4}, {1, 4, 4, 2}}));
	}
	
	public static double cafe_day(int[][] orders) {
		double total = 0.0;
		
		for(int[] order:orders) {
			if(order.length == 4 && order[0]>=0 && order[0]<3 && order[1]>=0 && order[2]>=0 && order[3]>=0) {
				int largeDrinks = order[1];
				int medDrinks = order[2];
				int smallDrinks = order[3];
				
				double befDisc = largeDrinks * 3.50 + medDrinks * 2.50 + smallDrinks * 1.25;
				
				switch(order[0]) {
				case 0:
					total += befDisc * 98/100;
					break;
				case 1:
					if(largeDrinks + medDrinks + smallDrinks >= 10) {
						total += befDisc * 80/100;
					}
					else {
						total += befDisc;
					}
					break;
				case 2:
					if(largeDrinks >=3 || medDrinks >= 4) {
						if(smallDrinks>3) {
							total += befDisc - (smallDrinks - 3) * 1.25;
						}
						else {
							total += befDisc - smallDrinks * 1.25;
						}
					}
					break;
				}
			}
		}
		return total;
	}
	
}
