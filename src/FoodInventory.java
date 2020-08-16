import java.util.ArrayList;
/**
 * Name: FoodInventory.java
 * Purpose: Container for methods regarding the inventory itself
 * 
 * @author Sachh Moka
 * @version 1.0
 * 
 * */
public class FoodInventory 
{
	private ArrayList<FoodItem> inventory;
	private int itemCount;
	
	public FoodInventory()
	{
		inventory = new ArrayList<FoodItem>();
		itemCount = 0;
	}
	
	public void addItem(FoodItem item)
	{
		inventory.add(item);
		itemCount++;
	}
	
	public void removeItem(FoodItem item)
	{
		inventory.remove(item);
		itemCount--;
	}
	
	
	public void printInventory()
    {
		System.out.println("Pantry Items:");
		
		// Logic for printing out the items
		for(int i = 0; i < inventory.size(); i++)
		{
			System.out.println(inventory.get(i).printItem());
		}
    }
	    

}
