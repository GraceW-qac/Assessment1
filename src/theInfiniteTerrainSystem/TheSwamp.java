package theInfiniteTerrainSystem;

import java.util.Scanner;

public class TheSwamp
{

	private String direction;
	public void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("You awake in a swamp."
				+ "You sold your horse for the compass on your arm. You may use it 5 times, with provisions for 100 miles."
				+ "Once you decide which way to go ('north', 'south', 'east' or 'west', your compass will tell you the distance of the next landmark or event."
				+ "But, there is no turning back - once you decide, you must continue and each decision is final."
				+ "There is nothing around you but fog and marsh."
				+ "Your journey will be dangerous."
				+ "So, which way first?");
		String direction = scan.nextLine();
		scan.close();
		String direction1 = new String();
	}
	public String getDirection1(String direction1)
	{
		return direction1;
	}
	public void setDirection1(String direction1)
	{
		this.setDirection(direction1);
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
}
//I wasn't sure how to incorporate distance calculations into the above.
