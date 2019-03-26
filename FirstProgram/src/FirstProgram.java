public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 20;
		
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
