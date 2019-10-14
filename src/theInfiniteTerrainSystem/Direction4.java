package theInfiniteTerrainSystem;

import java.util.Scanner;

public class Direction4 extends Direction3
{
	public String getDirection3(String direction1)
	{
		return direction1;
	}
	public void setDirection3(String direction1)
	{
		this.setDirection(direction1);
	}
Scanner scan = new Scanner(System.in);
System.out.println("Which way next?");
String input = scan.nextLine();
scan.close();
String direction4 = new String();

	public String direction4(String[])
	{
	
	if (direction4 = String("south")) while (direction3 = String("north"));
	{
		return System.out.println("You cannot go back. You have 1 use left.");
	}
	if (direction4 = String("west")) while (direction3 = String("east"));
	{
		return System.out.println("You cannot go back. You have 1 use left.");
	}
	if (direction4 = String("north")) while (direction3 = String("south"));
	{
		return System.out.println("You cannot go back. You have 1 use left.");
	}
	if (direction4 = String("east")) while (direction3 = String("west"));
	{
		return System.out.println("You cannot go back. You have 1 use left.");
	}
	else if (direction4 = String("north"))
	{
		return System.out.println("Some travellers tell you you can get past the dragon.");
	}
	else if (direction4 = String("east"))
	{
		return System.out.println("The merchants of the Silk Road invite you to continue east. Providing they have the last use of your compass.");
	}
	else if (direction4 = String("south"))
	{
		return System.out.println("You dare to follow the treasure map into an Oasis");	
	}
	else if (direction4 = String("west"))
	{
		return System.out.println("The promise of loot begins to reward you with a chest. Will you pursue this further west?");
	}
}
}