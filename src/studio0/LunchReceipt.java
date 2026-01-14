package studio0;

public class LunchReceipt {

	public static void main(String[] args) {
		
		double burritoPrice = 7.5;
		double drinkPrice = 1.25;
		double chipsPrice = 1.00;
		double guacPrice = 2.50;
		
		double subtotal = burritoPrice + drinkPrice + chipsPrice + guacPrice;
		double taxRate = 0.04225;
		double taxAmount = subtotal * taxRate;
		double total = subtotal + taxAmount;
		
		System.out.println("Your total was: $" + total);
		System.out.println((7.5+1.25+1.00+2.50)*(1+taxRate));
	}
	
	
}

// ways to run a program
// either the green play button on the top right
// or right the ffile name or right click anywhere you want to run

// observe the output? How can we check that the output is correct?
// manually calculate the expected output and we can compare it to our print
// for me i used the sum + one times the tax rate

// The other way to check is to do a process called debugging
	// 1) step one is to set a breakpoint, do this by clicking on line number and click the circle and do it
	// 2) right click the file and select "Debug Java"
	// 3) Use the step over button at the top of the window 
	// 4) continue through line-by-line and observe the values of the variables
	// 5) click stop to stop debugging
	// 6) remove breakpoint if needed