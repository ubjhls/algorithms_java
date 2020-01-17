package day1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_1000_z {
	public static void main(String[] arg) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //출력
	
		int n = Integer.parseInt(br.readLine());
		bw.write(n+"");
		bw.newLine();
		
		bw.flush();
		bw.close();
		
	}
	
}