
public class BiggerNumberq3 {

	public static void main(String[] args) {
		BiggerNumberq3 bn = new BiggerNumberq3();
		int num1;
		int num2;
		num1 = bn.numberOne();
		num2 = bn.numberTwo();
		if (num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		} else if (num2 > num1) {
			System.out.println(num2 + " is greater than " + num1);
		} else
			System.out.println(num1 + " is equal to " + num2);
	}

	int numberOne() {
		return 10;
	}

	int numberTwo() {
		return 10;

	}
}