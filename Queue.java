public class Queue extends HW3LinkedList<Ingredient>{
	public void push(Ingredient i){
		this.add(i);
	}
	
	public Ingredient pop(){
		return this.remove(0);
	}
}
