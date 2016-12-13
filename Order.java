import java.util.Scanner;

public class Order {
	
	
	//public String customerName;
	public Burrito[] burritoList;
	public double totalPrice;
	 
	

	//Instead, this just calculates the total price by adding the prices of all the burritos in the order
	public boolean updateTotalPrice(){
		totalPrice = 0; //resets total price
		
		//sums prices of all burritos
		for(int i = 0; i< burritoList.length; i++)
		{
			totalPrice+=burritoList[i].calcPrice();
		}
		
		//price has been successfully updated, so return true;
		System.out.println("Total Price: " +  totalPrice);
		return true;
	}
	
	
	//Helper method to print out the burrito 
			public void printBurrito(String[] a)
			{
				for(int i = 0; i < a.length; i++)
				{
					System.out.print(a[i]);
					
				}
			
		
