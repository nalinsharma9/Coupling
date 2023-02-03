package Coupling;
import java.util.*;

public class Main {

	/* Tight Coupling example
	 * 
	 * The dependent object is hard coded in the class,
	 * if we want to now generate CSV output, we have to change the entire code. 
	 
	 
	public static void generateOutput() {
		generateJSONOutput output = new generateJSONOutput();
		output.generateOutput();
		
	}
	
	*/
	
	
	/*Loose Coupling example
	 * We will pass the interface object to the Display method and the 
	 * instantiation for the appropriate concrete class can be determined during runtime.
	 
	*/
	public static void Display(OutputGenerator output) {
		
		Scanner sc = new Scanner(System.in);
		String type = sc.next();
		if(type.equals("JSON")) {
			output = new generateJSONOutput();
			output.generateOutput();
		}
		
		sc.close();
		
	}
	
	
	public static void main(String[] args) {
		OutputGenerator output = null;
		Display(output);

	}

}
