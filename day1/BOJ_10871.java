package day1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_10871 {
	public static void main(String[] arg) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		StringTokenizer num = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(num.nextToken());
			if (a < x) {
				bw.write(a+" ");
			}
		}
		bw.flush();
		bw.close();
	}
}
