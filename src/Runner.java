import java.util.Scanner;
/**
 * Name: Runner.java
 * Purpose: Driver class to test the logic of the FoodItem and FoodInventory methods
 * 
 * @author Sachh Moka
 * @version 1.0
 * 
 * */
public class Runner 
{
	
	public static void main(String[] args)
	{
		FoodInventory inventory = new FoodInventory();
		Scanner scan = new Scanner(System.in);
		
		String itemName;
		String checker;
		int itemNum;
		boolean flag = true;
		
		System.out.println("Food Inventory System");
		
		// Start Loop
		while(flag)
		{
			System.out.println("Item Name:	");
			itemName = scan.nextLine();
		
			System.out.println("Item Num:	");
			itemNum = scan.nextInt();
		
			inventory.addItem(new FoodItem(itemName, itemNum));
			
			System.out.println("Continue Adding?(Y/N)");
			checker = scan.next();
			
			if(checker.equalsIgnoreCase("Y"))
			{
				flag = true;
			}
			else 
			{
				flag = false;
			}
		}	// End Loop
		
		scan.close();
		inventory.printInventory();
		
	}

}
