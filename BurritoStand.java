import java.util.Scanner;
public class BurritoStand{
	
	public static void main(String[] args){
		System.out.println("Welcome to Emmeline and Sean's Burrito Stand!");
 		takeOrder();
 		System.out.println("Great choices!");
	}
	
	public static Order takeOrder(){
		Order newOrder = new Order();
		System.out.println("How many burritos would you like?");
		final int MAXBURRITOS = 3;
		newOrder.burritoList = new Burrito[takeUserInput(MAXBURRITOS)];
		
		for(int i = 0; i < newOrder.burritoList.length; i++){
			newOrder.burritoList[i].choices = pickIngredients();
		}
		
		return newOrder;
	}
	
	public static Queue pickIngredients(){
		
		//Ingredient List
		final Ingredient wheatTortilla = new Ingredient("Wheat Tortilla", 1.0);
		final Ingredient whiteTortilla = new Ingredient("White Tortilla", 0.5);
		final Ingredient bowl = new Ingredient("Bowl", 0.3); 
		final Ingredient chicken = new Ingredient("Chicken", 4.0); 
		final Ingredient pork = new Ingredient("Pork", 5.0); 
		final Ingredient chorizo = new Ingredient("Chorizo", 5.0); 
		final Ingredient groundBeef = new Ingredient("Ground Beef", 4.5);
 		final Ingredient carneAsada = new Ingredient("Carne Asada", 5.0);
 		final Ingredient vegetables = new Ingredient("Vegetables", 3.5); 
 		final Ingredient whiteRice = new Ingredient("Whte Rice", 1.10);
 		final Ingredient brownRice = new Ingredient("Brown Rice", 1.5); 
 		final Ingredient blackBeans = new Ingredient("Black Beans", 1.0);
 		final Ingredient pintoBeans = new Ingredient("Pinto Beans", 1.0); 
 		final Ingredient refriedBeans = new Ingredient("Refried Beans", 1.0); 
 		final Ingredient picoDeGallo = new Ingredient("Pico de gallo", 0.4); 
 		final Ingredient mild = new Ingredient("Mild", 0.4); 
 		final Ingredient medium = new Ingredient("Medium", 0.4); 
 		final Ingredient hot = new Ingredient("Hot", 0.4); 
 		final Ingredient lettuce = new Ingredient("Lettuce", 0.75); 
 		final Ingredient tomato = new Ingredient("Tomato", 0.75); 
 		final Ingredient peppersAndOnions = new Ingredient("Peppers & Onion",  0.75); 
 		final Ingredient guacamole = new Ingredient("Guacamole", 1.90); 
 		final Ingredient sourCream = new Ingredient("Sour Cream", 0.90); 
 		final Ingredient cheese = new Ingredient("Cheese" , 0.90);
		
		
		
		Queue pickedIngredients = new Queue();
		
		System.out.println("Sounds good! I will now ask you what ingredients you want. If you do not want any of the options I give you you can reply with (0) for none");
		System.out.println("Please only select one choice from each options listed and type the corresponding number");
		
		
		System.out.println("What type of tortilla would you like? We have (1)Wheat, (2)White or (3)a bowl."); 
		switch(takeUserInput(3)){
			case 0:	break;
			case 1: pickedIngredients.push(wheatTortilla);
			case 2: pickedIngredients.push(whiteTortilla);
			case 3: pickedIngredients.push(bowl);
		}
		
		
		System.out.println("What type of meat would you like? We have (1)Chicken, (2)pork, (3)chorizo, (4)ground beef, (5)carne asada or (6)vegetables");
		switch(takeUserInput(6)){
			case 0: break;
			case 1: pickedIngredients.push(chicken);
			case 2: pickedIngredients.push(pork);
			case 3: pickedIngredients.push(chorizo);
			case 4: pickedIngredients.push(groundBeef);
			case 5: pickedIngredients.push(carneAsada);
			case 6: pickedIngredients.push(vegetables);
		}
		
		
		System.out.println("What kind of rice would you like? We have (1)white, or (2)brown");
		switch(takeUserInput(6)){
			case 0: break;
			case 1: pickedIngredients.push(whiteRice);
			case 2: pickedIngredients.push(brownRice);
		}
		
		
		
		System.out.println("What type of beans would you like? We have (1)black, (2)pinto, or (3)refried"); 
		switch(takeUserInput(3)){
			case 0: break;
			case 1: pickedIngredients.push(blackBeans);
			case 2: pickedIngredients.push(pintoBeans);
			case 3: pickedIngredients.push(refriedBeans);
		}
		
		
		
		System.out.println("What type of Salsa would you like? We have (1)pico de gallo, (2)mild, (3)medium, or (4)hot");
		switch(takeUserInput(4)){
			case 0: break;
			case 1: pickedIngredients.push(picoDeGallo);
			case 2: pickedIngredients.push(mild);
			case 3: pickedIngredients.push(medium);
			case 4: pickedIngredients.push(hot);
		}
		
		
		
		System.out.println("What type of Vegetable would you like? We have (1)lettuce, (2)tomato or (3)peppers and onions");
		switch(takeUserInput(3)){
			case 0: break;
			case 1: pickedIngredients.push(lettuce);
			case 2: pickedIngredients.push(tomato);
			case 3: pickedIngredients.push(peppersAndOnions);
		}
		
		
		
		System.out.println("Would you like any extras? We have (1)guacamole, (2)sour cream, or (3)cheese");
		switch(takeUserInput(3)){
			case 0: break;
			case 1: pickedIngredients.push(guacamole);
			case 2: pickedIngredients.push(sourCream);
			case 3: pickedIngredients.push(cheese);
		}
		
		return pickedIngredients;
	}
	
	public static void makeOrder(){
		
	}
	
	public static boolean cook(){
		
	}
	
	
	public static int takeUserInput(int maxChoices){
		boolean validInput = false;
		int x=0;
		
		Scanner keyboard = new Scanner(System.in);
		
		while(!validInput){
			if (keyboard.hasNextInt()){
				x = keyboard.nextInt(); 
			}else{
				keyboard.next();
				x = -1;
			}
			
			if(x<0 || x > maxChoices){
				System.out.println("Please enter an integer between 0 and " + maxChoices);
			}else{
				validInput = true;
			}
		}	
		
		
		/**
		while(!validInput){
			if(keyboard.hasNextInt()){
				x=keyboard.nextInt();
				if(x <= maxChoices){
					validInput = true;
				}else{
					System.out.println("Please input a valid choice from 0 to " + maxChoices);
					keyboard.next();
				}
			}else{
				System.out.println("Please input an integer");
				keyboard.next();
				
				keyboard.close();
				keyboard = new Scanner(System.in);
				
			}
		}*/
		keyboard.close();
		return x;
	}
}
