package Com.Interface;
//This program has been written to display the interface.
public class MainClass {

	public static void main(String[] args) {
		
		int intNum;								//Declaring a variable intnum.
		intNum = 7;								// Initialization of variable.
		
		Value objVal = new Value();				// Creating a object of subclass value.
		objVal.Value(intNum);
		
		Square objSquare = new Square();		//Creating a object of subclass Square.
		objSquare.Value(intNum);
		
		
	}
	
}
