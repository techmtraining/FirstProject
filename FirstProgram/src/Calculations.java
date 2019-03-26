public class Calculations extends Multiple{

	int i,j;

	public Calculations(int i, int j) {
		
		this.i = i;
		this.j = j;
		
	}
	
	public int Calculations(int i, int j, String k) {
		
		
//		switch (k) {
//		case "m": return mul.Multiplication(i, j);
//		case "a": return mul.Addition(i, j);
//		case "s": return mul.Subtraction(i,j);
//		default: return 0;
//		}
//		
		
		
		if (k == "m") {
			System.out.println("Multiplication "+k);
			return Multiplication(i, j);
		}
		else if(k == "a") {
			System.out.println("Addition "+k);
			return Addition(i, j);
		}
		else if(k == "s") {
			System.out.println("Subtraction "+k);
			return Subtraction(i, j);
		}
		else {
			return 0;
		}
		
	}

}
