package theInfiniteTerrainSystem;

import java.util.Scanner;

public class Direction3 extends Direction2
{
	public String getDirection2(String direction1)
	{
		return direction1;
	}
	public void setDirection2(String direction1)
	{
		this.setDirection(direction1);
	}
Scanner scan = new Scanner(System.in);
System.out.println("Which way next?");
String input = scan.nextLine();
scan.close();
String direction3 = new String();

	public String direction3(String[])
	{

	if (direction3 = String("south")) while (direction2 = String("north"));
	{
		return System.out.println("You cannot go back. You have 2 uses left");
	}
	if (direction3 = String("west")) while (direction2 = String("east"));
	{
		return System.out.println("You cannot go back. You have 2 uses left");
	}
	if (direction3 = String("north")) while (direction2 = String("south"));
	{
		return System.out.println("You cannot go back. You have 2 uses left");
	}
	if (direction3 = String("east")) while (direction2 = String("west"));
	{
		return System.out.println("You cannot go back. You have 2 uses left");
	}
	else if (direction3 = String("north"))
	{
		return System.out.println("You see trees. The tops are scarred with Dragon Fire.");
	}
	else if (direction3 = String("east"))
	{
		return System.out.println("You see a caravan of merchants in the distance.");
	}
	else if (direction3 = String("south"))
	{
		return System.out.println("You find a treasure map, it leads into the desert beyond. Could it be a trap?");	
	}
	else if (direction3 = String("west"))
	{
		return System.out.println("War has marked the landscape around you. Will you continue west for loot?");
	}
}