package L3_Sep1;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 01-Sep-2018
 */

public class Rotation {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int r = scn.nextInt();

		// number of digits
		int count = 0;

		int temp = num;
		while (temp != 0) {
			count++;
			temp = temp / 10;
		}

		r = r % count;

		if (r < 0) {
			r = r + count;
		}

		int divisor = (int) Math.pow(10, r);
		int rem = num % divisor;
		int quot = num / divisor;

		int multiplier = (int) Math.pow(10, count - r);

		int ans = rem * multiplier + quot;

		System.out.println(ans);

	}

}
