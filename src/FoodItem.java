/**
 * Name: FoodItem.java
 * Purpose: Container for methods regarding the item itself
 * 
 * @author Sachh Moka
 * @version 1.0
 * 
 * */
public class FoodItem 
{
	
	private String name;
	private int num;
	
	public FoodItem(String name, int num) 
	{
		this.name = name;
		this.num = num;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getNum()
	{
		return num;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public void setNum(int newNum)
	{
		num = newNum;
	}
	
	public String printItem()
	{
		return name + "\t" + num;
	}
}
