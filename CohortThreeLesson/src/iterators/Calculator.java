package iterators;
public class Calculator {

//	public int add(int d, int e) {
//		// TODO Auto-generated method stub
//		return d+e;
//	}
	public double add(double d, double e) {
		// TODO Auto-generated method stub
		return d+e;
	}
	
	public int subtract(int numberOne, int numberTwo) {
		if(numberTwo > numberOne) {
			return numberTwo - numberOne;
		}else {
			return numberOne - numberTwo;
		}
	}

	public double subtract(double numberOne, double numberTwo) {
		if(numberTwo > numberOne) {
			return numberTwo - numberOne;
		}else {
			return numberOne - numberTwo;
		}
	}


}
