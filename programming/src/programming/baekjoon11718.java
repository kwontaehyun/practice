package programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon11718 {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String str;
//		StringBuilder sb = new StringBuilder();
//		while((str = br.readLine()) != null) {
//			sb.append(str).append("\n");
//		}
//		
//		System.out.println(sb);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str;
		while((str = br.readLine()) != null) {
			bw.write(str + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();

	}

}
