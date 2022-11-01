package programming;

import java.util.Arrays;
import java.util.Scanner;

//배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
public class baekjoon1427 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] arr = in.nextLine().toCharArray();
		Arrays.sort(arr);
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
 
	}

}
