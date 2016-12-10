import java.util.Scanner;

public class Order {
	public String customerName;
	public Burrito[] burritoList;
	public int orderNumber;
	public int totalPrice;
	
	public void takeOrder(){
		Ingredients[] ingredientsList = new Ingredients[7];
		
		
		
		Scanner reader = new Scanner(System.in);
		
		String customerWants[] = new String[7]; //String ("Queue") of ingredients the customer wants
		
		
		System.out.println("Hello. What is you customerName? ");
		customerName = reader.next(); 
		System.out.println("Would you like a burrito? (yes or no)");
		String wantBurrito = reader.next(); 
		if(wantBurrito.equals("no"))
			System.out.println("OK BYE.");
		else
		{
			//Getting ingredients the Customer wants 
		System.out.println("Sounds good! I will now ask you what ingredients you want. If you do not want any of the options I give you you can reply with none");
		System.out.println("Please only select one choice from each options list.");
		System.out.println("What type of tortilla would you like? We have Wheat, White or a bowl."); 
		customerWants[0] = reader.next();
		System.out.println("What type of meat would you like? We have Chicken, pork, chorizo, ground beef, carne asada or vegetables");
		customerWants[1] = reader.next();
		System.out.println("What kind of rice would you like? We have white, or brown");
		customerWants[2] = reader.next();
		System.out.println("What type of beans would you like? We have black, pinto, or refried"); 
		customerWants[3] = reader.next();
		System.out.println("What type of Salsa would you like? We have pico de gallo, mild, medium, or hot");
		customerWants[4] = reader.next();
		System.out.println("What type of Vegetable would you like? We have lettuce, tomato or peppers and onions");
		customerWants[5] = reader.next();
		System.out.println("Would you like any extras? We have guacamole, sour cream, or cheese");
		customerWants[6] = reader.next();
		
		reader.close();
		}
	}
	
	//Helper method to print out the burrito 
			public void printBurrito(String[] a)
			{
				for(int i = 0; i < a.length; i++)
				{
					System.out.print(a[i]);
					
				}
			
			}
}
