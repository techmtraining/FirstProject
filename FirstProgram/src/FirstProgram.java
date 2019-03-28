import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class FirstProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//int i = 10;
		//int j = 20;
		
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("BufferedReader input String");
		String test = reader.readLine();
		System.out.println("Input String "+test);
		
		System.out.println("Enter i");
		int i = sobj.nextInt();
		
		System.out.println("Enter j");
		int j = sobj.nextInt();
				
		
		
		Calculations add = new Calculations(i, j);		
		System.out.println("Hello World");
		
		//Add
		System.out.println("Add i + j "+add.Calculations(i, j,"a"));
		
		//Subtract
		System.out.println("Subtract i-j"+add.Calculations(i, j,"s"));
		
		//Multiplication
		System.out.println("Multiplication"+add.Calculations(i, j, "m"));

	}
	

}
