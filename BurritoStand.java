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
	
	public static void takeOrder(){
		//Asks number of Burritos and the initializes the BurritoList[] as an array of Burritos of that size.
		int numBurritos = 0;
		System.out.println("How many burritos would you like?");
		numBurritos = reader.next(); 
		Burrito [] totOrder = new Burrito[numBurritos];//This array of burritos will contain all the burritos the customer wants
			
		for(int i = 0; i <= numBurritos; i++)
		{
			Burrito i = new Burrito();
			totOrder[i] = i.order(); //Calls the Order class to figure out which ingredients the customer wants; 
		}
			
	}
	
	public static void makeOrder(burrito[] list){
		
		
	}
	
	public static void checkout(){
		
	}
}
