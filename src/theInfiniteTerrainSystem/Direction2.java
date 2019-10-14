package theInfiniteTerrainSystem;

import java.util.Scanner;

public class Direction2 extends Direction1
{
	public String getDirection1(String direction1)
	{
		return direction1;
	}
	public void setDirection1(String direction1)
	{
		this.setDirection(direction1);
	}
Scanner scan = new Scanner(System.in);
System.out.println("Which way next?");
String input = scan.nextLine();
scan.close();
String direction2 = new String();

	public String direction2(String[])
	{
		if (direction2 = String("south")) while (direction1 = String("north"));
		{
			return System.out.println("You cannot go back. You have 3 uses left");
		}
		if (direction2 = String("west")) while (direction1 = String("east"));
		{
			return System.out.println("You cannot go back. You have 3 uses left");
		}
		if (direction2 = String("north")) while (direction1 = String("south"));
		{
			return System.out.println("You cannot go back. You have 3 uses left");
		}
		if (direction2 = String("east")) while (direction1 = String("west"));
		{
			return System.out.println("You cannot go back. You have 3 uses left");
		}
		else if (direction2 = String("north"))
		{
			return System.out.println("You find an inn, the innkeep confirms rumours of dragons to the north.");
		}
		else if (direction2 = String("east"))
		{
			return System.out.println("You find an abandoned camp among the marshes, strewn with skeletons.");
		}
		else if (direction2 = String("south"))
		{
			return System.out.println("You see a single, sun bleached tent.");	
		}
		else if (direction2 = String("west"))
		{
			return System.out.println("You come across some marauders. They warn of war to the west.");
		}
	}
}