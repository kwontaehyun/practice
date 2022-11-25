package programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2445 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= N; i++){
            for(int j=0; j<i; j++){
                sb.append("*");
            }
            for(int k=N*2; k>i*2; k--){
                sb.append(" ");
            }
            for(int l=0; l<i; l++){
                sb.append("*");
            }

            sb.append("\n");
        }
        for(int i = N; i<= N*2; i++){
            for(int j=i; j<N*2-1; j++){
                sb.append("*");
            }
            for(int k=N*2-1; k<=i*2; k++){
                sb.append(" ");
            }
            for(int l=i; l<N*2-1; l++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);

	}

}
