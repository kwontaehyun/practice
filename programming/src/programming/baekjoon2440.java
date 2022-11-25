package programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2440 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){

            for(int k=N; k>i; k--){
                sb.append("*");
            }
            for(int j=0; j<=i; j++){
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);

	}

}
