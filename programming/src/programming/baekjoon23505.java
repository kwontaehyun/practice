package programming;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//2022 연세대학교 미래캠퍼스 슬기로운코딩생활에 N명의 학생들이 응시했다.
//이들 중 점수가 가장 높은 k명은 상을 받을 것이다. 이 때, 상을 받는 커트라인이 몇 점인지 구하라.
//커트라인이란 상을 받는 사람들 중 점수가 가장 가장 낮은 사람의 점수를 말한다.

//입력 
//응시자 수 N, 상을받는사람 k
//학생의 점수 x
public class baekjoon23505 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Integer[] input = new Integer[2];
		
		System.out.println("입력 : ");
		for(int i=0; i<input.length; i++) {
			input[i] = scan.nextInt();
		}
		Integer[] arr = new Integer[input[0]];
				
		System.out.println("학생들의 점수 : ");
		for(int i= 0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		System.out.println("상받는 커트라인 점수 : " + arr[input[1] -1]);
		
	}
}
