package programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon10951 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//10951번
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		String str;
		while((str=br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str, " ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append("\n");
		}
		
		System.out.println(sb);

	}

}
