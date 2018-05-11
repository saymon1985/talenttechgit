
public class SumMethod {
	int a;
	int b;

	public static void main(String[] args) {
		SumMethod s = new SumMethod();
		int a;
		int b;

		a = s.sumTwo();
		System.out.println(a);

		b = s.sumOne(100, 200);
		System.out.println(b);

		s.sumThree();

	}

	int sumOne(int a, int b) {
		int c;
		c = a + b;
		return c;

	}

	int sumTwo() {
		int a = 4;
		int b = 5;
		int c;
		c = a + b;

		System.out.println("This is sum method 2");
		return c;

	}

	void sumThree() {
		int num[] = new int[3];
		for (int i = 0; i < num.length; i++) {
			if (i == 0) {
				num[i] = 12;
				System.out.println("num[0] is:" + num[i]);

			} else if (i == 1) {
				num[i] = 13;
				System.out.println("num[1] is :" + num[i]);

			} 
			else if (i == 2) {
				num[i] = 14;
				System.out.println("num[2] is:" + num[i]);
			}
		}

	}
}
