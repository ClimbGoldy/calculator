package calculator;

public class Calculator {
	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	public int sub(int num1, int num2) {
		return num1 - num2;
	}

	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	public int div(int num1, int num2) {
		try {
			return num1 / num2;
		}catch(Exception e){
			//divide By 0 exception
		}
		return 0;
	}
}