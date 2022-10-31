package programming;
import java.util.Scanner;

//N개의 수가 주어졌을 때 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
//첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 
//둘째 줄부터 N개의 줄에는 수 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
//첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
public class baekjoon2750 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 길이 : ");
		int N = scan.nextInt();
		int[] arr = new int[N];
		System.out.println("입력 : ");
		for(int i=0; i<N; i++) {
			arr[i] = scan.nextInt();
		}
		for(int i =0; i<N - 1; i++) {
			for(int j=i+1; j<N; j++) {
				if(arr[i] > arr[j]) {
					int swap = arr[i];
					arr[i] = arr[j];
					arr[j] = swap;
				}
			}
		}
		System.out.println("출력 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		
	}
}
