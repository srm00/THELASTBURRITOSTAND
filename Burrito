public class Burrito {
		public Queue checkoutQueue;
		public Queue choices;
		private double price;
		
	
	//default Constructor 
	public Burrito()
	{
		price = 0;
	}
	
	public double calcPrice()
	{
		Queue prices = checkoutQueue;
		
		
		price = 0; 
		MaxHeap priceHeap = new MaxHeap(30);
		
		while(prices.isEmpty() == false)
		{ //multiply by 100 to convert all decimals to ints
		priceHeap.insert((int)(100*(prices.pop()).getPrice())); 
		}
		
		price = priceHeap.deleteMax(); 
		price = price + priceHeap.deleteMax(); 
	    price = price + priceHeap.deleteMax();
		
	    //to convert back to a double
	    int temp = (int)price%100; //this will be the part after the decimal 
	    double temp2 = temp; 
	    price = (double)(price/(int)100);
	    price = price + (temp2 / 100);


		return price; 
	}
}
