package Com.Interface;

public class Square implements InterfaceNumber{							//Class Square implementing Interface Number.

	public void Value(int intNum) {								// Writing a body to method Value to display square of a number.

		int intSquare;
		intSquare = intNum * intNum;
		System.out.println("The square of the number " + intNum + " is " + intSquare + ".");
		
	}
	
	

}
