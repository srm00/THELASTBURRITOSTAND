public class Ingredient {
	private String name;
	private double price;
	
	//constructor, takes in a name and a price
	public Ingredients(String str, double x){
		this.setName(str);
		this.setPrice(x);
	}

	public void setName(String str) {
		name = str;
	}
	
	public String getName(){
		return name; 
	}
	
	public void setPrice(double x){
		price = x;
	}
	
	public double getPrice(){
		return price;
	}
}
