public class BurritoStand {
	
	public static void main(String[] args){
		//Keeps track of all orders
	    //Takes Orders
	    //Modifies/manipulates all other classes
		
		
		//Ingredient List
 	Ingredient wheat = new Ingredient("Wheat", 1.0);
	Ingredient white = new Ingredietns("White", 0.5);
	Ingredient bowl = new Ingredient("Bowl", 0.3); 
	Ingredient chicken = new Ingredient("Chicken", 4.0); 
	Ingredient pork = new Ingredient("Pork", 5.0); 
	Ingredient chorizo = new Ingredient("Chorizo", 5.0); 
	Ingredient groundBeef = new Ingredient("Ground Beef", 4.5);
	Ingredient carneAsada = new Ingredient("Carne Asada", 5.0);
	Ingredient vegetables = new Ingredient("Vegetables", 3.5); 
	Ingredient whiteRice = new Ingredient("Whte Rice", 1.10);
	Ingredietns brownRice = new Ingredient("Brown Rice", 1.5); 
	Ingredient blackBeans = new Ingredient("Black Beans", 1.0);
	Ingredient pintoBeans = new Ingredient("Pinto Beans", 1.0); 
	Ingredietns refriedBeans = new Ingredient("Refried Beans", 1.0); 
	Ingredient picoDeGallo = new Ingredient("Pico de gallo", 0.4); 
	Ingredient mild = new Ingredient("Mild", 0.4); 
	Ingredient medium = new Ingredient("Medium", 0.4); 
	Ingredient hot = new Ingredient("Hot", 0.4); 
	Ingredient lettuce = new Ingredient("Lettuce", 0.75); 
	Ingredient tomato = new Ingredient("Tomato", 0.75); 
	Ingredient pepersAndOnion = new Ingredient("Peppers & Onion",  0.75); 
	Ingredient guacamole = new Ingredient("Guacamole", 1.90); 
	Ingredient sourCream = new Ingredient("Sour Cream", 0.90); 
	Ingredient cheese = new Ingredient("Cheese" , 0.90); 
	}
	
	public static void getOrder(){
		//Asks number of Burritos and the initializes the BurritoList[] as an array of Burritos of that size.
		int numBurritos = 0;
		System.out.println("How many burritos would you like?");
		numBurritos = reader.next(); 
		Order [] customerOrder = new Order[numBurritos];//This array of burritos will contain all the burritos the customer wants
			
		for(int i = 0; i <= numBurritos; i++)
		{
			Order i = new Order();
			i.takeOrder(); //Calls the Order class to figure out which ingredients the customer wants; 
			totOrder[i] = cook(i.order()); //<------------------- Which???
		}
			
	}
	
	
	
	//calculates the prices for all ordered burriots 
	//uses the calc price method within order
	public static void checkout(burrito[] a){
		double totalPrice = 0.0; 
		for(int i = 0; i< a.length; i++)
		{
			totalPrice = totalPrice + a[i].calcPrice();
		}
		System.out.println("Your total is " + totalPrice + "$. Thank you for coming!"); 
	}
	
	public static void main (String [] args) 
	{
		BurritoStand s1 = new BurritoStand();
		s1.getOrder(); 
	}
}
