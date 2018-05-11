
public class PrimeClassq6 {

	public static void main(String[] args) {
		boolean primeFlag = false;
		System.out.println("Prime number from 1 to 100: \n");
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <=i; j++) {
				if (i == j) {
					primeFlag = true;
				}
					else if  (i % j == 0) {
						primeFlag = false;
						break;		
					}
					else
						primeFlag = true;
					}
				if (primeFlag == true) {
					System.out.print(i +" ");
				}
			}
		}

	}


