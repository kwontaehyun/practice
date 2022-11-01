package programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 
//단, N은 홀수라고 가정하자.

//산술평균 : N개의 수들의 합을 N으로 나눈 값
//중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
//최빈값 : N개의 수들 중 가장 많이 나타나는 값
//범위 : N개의 수들 중 최댓값과 최솟값의 차이
//N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.
public class baekjoon2108 {

	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			int value = Integer.parseInt(br.readLine());
			arr[i] = value;
			sum += value;
		}
		Arrays.sort(arr);
		boolean flag = false;
		int mode_max = 0;
		int mode = 10000;
		
		for(int i = 0; i < N; i++) {
			int jump = 0;	// 동일한 수가 나온만큼 i 값 jump 시킬 변수 
			int count = 1;
			int i_value = arr[i];
			for(int j = i + 1; j < N; j++){
				if(i_value != arr[j]) {
					break;
				}
				count++;
				jump++;
			}
			
			if(count > mode_max) {
				mode_max = count;
				mode = i_value;
				flag = true;
			}
			else if(count == mode_max && flag == true) {
				mode = i_value;
				flag = false;
			}
			i += jump;
		}
		System.out.println((int)Math.round((double)sum / N));
		System.out.println(arr[N / 2]);	// index 는 0 부터 시작하므로 주의 
		System.out.println(mode);		
		System.out.println(arr[N - 1] - arr[0]);
	}

}
