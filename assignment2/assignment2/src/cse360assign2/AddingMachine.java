//cse360 assignment 2
//pengfei Lyu
//1206675492
//first time Commit to github


package cse360assign2;

public class AddingMachine {

	private static String output1 = "0 ";
	private static int total = 0 ;
	
	//test for code 
	public static void main(String [] args) {
		
		getTotal ();
		add(5);
		getTotal ();
		add(10);
		getTotal ();
		add(100);
		subtract(5);
		subtract(10);
		getTotal ();
		subtract(100);
		
		System.out.println(string());
		
		
	}
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public static int getTotal () {
		
		System.out.println(total);
		
		return total;
	}
	
	public static void add (int value) {
		output1 = output1 + " + ";
		output1 = output1 + " " + value + " "; 
		total += value;
	}
	
	public static void subtract (int value) {
		output1 = output1 + " - ";
		output1 = output1 + " " + value + " "; 
		total -= value;
	}
		
	public static String string () {
		return  output1;
	}

	public void clear() {
	
	}
}
