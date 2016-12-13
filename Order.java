import java.util.Scanner;

public class Order {
	
	
	public String customerName;
	public Burrito[] burritoList;
	public int totalPrice;
	 
	/** Should happen in BurritoStand
	public void getOrder(){
		Scanner reader = new Scanner(System.in); 
		
		//Asks number of Burritos and the initializes the BurritoList[] as an array of Burritos of that size.
		int numBurritos = 0;
		System.out.println("How many burritos would you like?");
		numBurritos = reader.nextInt(); 
		Order [] customerOrder = new Order[numBurritos];//This array of burritos will contain all the burritos the customer wants
			
		for(int i = 0; i <= numBurritos; i++)
		{
			
			Order x = new Order();
			x.takeOrder(); //Calls the Order class to figure out which ingredients the customer wants; 
			totOrder[i] = cook(x); 
			//print the order
			System.out.println("Here is this completed burrito. It contains the following ingredients: "); 
			printBurrito(x); 
		}
	}
	*/
	
	//calculates the prices for all ordered burriots 
	//uses the calc price method within order
	
	/**
	 * An Order can't "Check out" itself, it needs to be manipulated through BurritoStand
		public static void checkout(Burrito[] a){
			double totalPrice = 0.0; 
			for(int i = 0; i< a.length; i++)
			{
				totalPrice = totalPrice + a[i].calcPrice();
			}
			System.out.println("Your total is " + totalPrice + "$. Thank you for coming!"); 
		}
		*/
	
	//Instead, this just calculates the total price by adding the prices of all the burritos in the order
	public boolean updateTotalPrice(){
		totalPrice = 0; //resets total price
		
		//sums prices of all burritos
		for(int i = 0; i< burritoList.length; i++)
		{
			totalPrice+=burritoList[i].calcPrice();
		}
		
		//price has been successfully updated, so return true;
		return true;
	}
	
	
	
	
	/**
	 * Same thing, this has to be done through burrito stand.
	private void takeOrder(){
		Scanner reader = new Scanner(System.in);
		String customerWants[] = new String[7]; //String ("Queue") of ingredients the customer wants
		
		//
		System.out.println("Would you like a burrito? (yes or no)");
		String wantBurrito = reader.next(); 
		if(wantBurrito.equals("no")) //if no should end the loop within take order (in the Burrito stand class) 
			System.out.println("OK BYE.");
		else
		{
			//Getting ingredients the Customer wants 
		System.out.println("Sounds good! I will now ask you what ingredients you want. If you do not want any of the options I give you you can reply with none");
		System.out.println("Please only select one choice from each options listed and type the corresponding number");
		System.out.println("What type of tortilla would you like? We have (1)Wheat, (2)White or (3)a bowl."); 
		customerWants[0] = this.takeUserInput(); 
		System.out.println("What type of meat would you like? We have (1)Chicken, (2)pork, (3)chorizo, (4)ground beef, (5)carne asada or (6)vegetables");
		customerWants[1] = this.takeUserInput();
		System.out.println("What kind of rice would you like? We have (1)white, or (2)brown");
		customerWants[2] = this.takeUserInput();
		System.out.println("What type of beans would you like? We have (1)black, (2)pinto, or (3)refried"); 
		customerWants[3] = this.takeUserInput();
		System.out.println("What type of Salsa would you like? We have (1)pico de gallo, (2)mild, (3)medium, or (4)hot");
		customerWants[4] = this.takeUserInput();
		System.out.println("What type of Vegetable would you like? We have (1)lettuce, (2)tomato or (3)peppers and onions");
		customerWants[5] = this.takeUserInput();
		System.out.println("Would you like any extras? We have (1)guacamole, (2)sour cream, or (3)cheese");
		customerWants[6] = this.takeUserInput();
		
		reader.close();
		}
	}
	*/
	
	//Helper method to print out the burrito 
			public void printBurrito(String[] a)
			{
				for(int i = 0; i < a.length; i++)
				{
					System.out.print(a[i]);
					
				}
			
			}
}
