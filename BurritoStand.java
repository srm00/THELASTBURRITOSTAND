import java.util.Scanner;
public class BurritoStand{
	
	public static void main(String[] args){
		System.out.println("Welcome to Emmeline and Sean's Burrito Stand!");
 		Order currentOrder = takeOrder();
 		System.out.println("Great choices!");
 		
 		for(int i = 0; i < currentOrder.burritoList.length; i++){
 			System.out.println("I will now cook burrito number " + (i + 1) + "!");
 			cook(currentOrder.burritoList[i].choices);
 		}
 		
 		System.out.println("Time to check out! Your total is: $" + currentOrder.updatePrice());
	}
	
	public static Order takeOrder(){
		Order newOrder = new Order();
		System.out.println("How many burritos would you like?");
		final int MAXBURRITOS = 3;
		newOrder.burritoList = new Burrito[takeUserInput(MAXBURRITOS)];
		
		for(int i = 0; i < newOrder.burritoList.length; i++){
			newOrder.burritoList[i] = new Burrito();
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
 		final Ingredient whiteRice = new Ingredient("White Rice", 1.10);
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
		
		System.out.println("Sounds good! I will now ask you what ingredients you want. \nIf you do not want any of the options I give you you can reply with (0) for none");
		System.out.println("Please only select one choice from each options listed and type the corresponding number"\n);
		
		
		System.out.println("What type of tortilla would you like? We have (1)Wheat, (2)White or (3)a bowl."); 
		switch(takeUserInput(3)){
			case 0:	break;
			case 1: pickedIngredients.push(wheatTortilla); break;
			case 2: pickedIngredients.push(whiteTortilla); break;
			case 3: pickedIngredients.push(bowl); break;
		}
		
		
		System.out.println("What type of meat would you like? We have (1)Chicken, (2)pork, (3)chorizo, (4)ground beef, (5)carne asada or (6)vegetables");
		switch(takeUserInput(6)){
			case 0: break;
			case 1: pickedIngredients.push(chicken); break;
			case 2: pickedIngredients.push(pork); break;
			case 3: pickedIngredients.push(chorizo); break;
			case 4: pickedIngredients.push(groundBeef); break;
			case 5: pickedIngredients.push(carneAsada); break;
			case 6: pickedIngredients.push(vegetables); break;
		}
		
		
		System.out.println("What kind of rice would you like? We have (1)white, or (2)brown");
		switch(takeUserInput(6)){
			case 0: break;
			case 1: pickedIngredients.push(whiteRice); break;
			case 2: pickedIngredients.push(brownRice); break;
		}
		
		
		
		System.out.println("What type of beans would you like? We have (1)black, (2)pinto, or (3)refried"); 
		switch(takeUserInput(3)){
			case 0: break;
			case 1: pickedIngredients.push(blackBeans); break;
			case 2: pickedIngredients.push(pintoBeans); break;
			case 3: pickedIngredients.push(refriedBeans); break;
		}
		
		
		
		System.out.println("What type of Salsa would you like? We have (1)pico de gallo, (2)mild, (3)medium, or (4)hot");
		switch(takeUserInput(4)){
			case 0: break;
			case 1: pickedIngredients.push(picoDeGallo); break;
			case 2: pickedIngredients.push(mild); break;
			case 3: pickedIngredients.push(medium); break;
			case 4: pickedIngredients.push(hot); break;
		}
		
		
		
		System.out.println("What type of Vegetable would you like? We have (1)lettuce, (2)tomato or (3)peppers and onions");
		switch(takeUserInput(3)){
			case 0: break;
			case 1: pickedIngredients.push(lettuce); break;
			case 2: pickedIngredients.push(tomato); break;
			case 3: pickedIngredients.push(peppersAndOnions); break;
		}
		
		
		
		System.out.println("Would you like any extras? We have (1)guacamole, (2)sour cream, or (3)cheese");
		switch(takeUserInput(3)){
			case 0: break;
			case 1: pickedIngredients.push(guacamole); break;
			case 2: pickedIngredients.push(sourCream); break;
			case 3: pickedIngredients.push(cheese); break;
		}
		
		return pickedIngredients;
	}
	
	public static boolean cook(Queue choices){
		Queue ingredients = choices;
		System.out.println("Now adding the...");
		while(!ingredients.isEmpty()){
			 System.out.println(ingredients.pop().getName());
			 try {Thread.sleep(1000);}catch(InterruptedException ex) {/*Thread.currentThread().interrupt();*/}
		}
		return true;
	}
	
	
	public static int takeUserInput(int maxChoices){
		boolean validInput = false;
		int x=0;
		
		Scanner keyboard = new Scanner(System.in);
		
		if(!keyboard.hasNext()){
			System.out.println("Crap sorry no luck.");
			System.exit(0);
		}
		
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
		return x;
	}
}
