package programming;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class baekjoon2557 {

	public static void main(String[] args) throws IOException {
		//BufferedWriter -> StringBuilder -> StringBuffer -> String -> Sysout 순으로 빠름. 걍 Wirter가 젤빠름.
		
		
		System.out.println("hello warld");
			
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		bw.write("Hello World!");
		bw.flush();
		bw.close();
			
		StringBuffer sb = new StringBuffer();
		sb.append("hello world");
		System.out.println(sb);
			
	}

}
