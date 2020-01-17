package day1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_1003 {
	static BufferedWriter bw;
	static BufferedReader br;
	static int count_1;
	static int count_2;
	public static void main(String[] arg) throws IOException {
		
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		fibo(n);
		
		bw.write(count_1+" ");
		bw.write(count_2+"");
		bw.newLine();
		
		bw.flush();
		bw.close();
	}
	 	
	public static int fibo(int value) throws IOException {
		if (value == 0) {
			count_1++;
			return 0;
		}
		else if (value == 1) {
			count_2++;
			return 1;
		}
		else {
			return fibo(value -1) + fibo(value -2);
		}
	}
}