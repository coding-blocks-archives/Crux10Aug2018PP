import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 19-Aug-2018
 */

public class Reverse {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int rev = 0;

		while (n != 0) {

			int rem = n % 10;

			rev = rev * 10 + rem;
			n = n / 10;
		}

		System.out.println(rev);
	}

}
