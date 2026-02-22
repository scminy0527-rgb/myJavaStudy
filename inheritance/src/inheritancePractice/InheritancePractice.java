package inheritancePractice;

class SolveMinus {
	int calc(int num1, int num2) {
		return num1 - num2;
	}
}

class SolveAbs extends SolveMinus {
	@Override
	int calc(int num1, int num2) {
		int result = 0;
		// TODO Auto-generated method stub
		int temp = super.calc(num1, num2);
		result = temp < 0 ? -1 * temp : temp;
		return result;
	}
}

public class InheritancePractice {
	public static void main(String[] args) {
		
	}

}
