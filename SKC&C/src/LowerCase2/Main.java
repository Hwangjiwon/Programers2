package LowerCase2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 118372;
		System.out.println(solution(n));
	}

	public static long solution(long n) {
		long answer = 0;
		String str = new String();
		str = String.valueOf(n);
		String[] c = new String[str.length()];
		String[] r = new String[str.length()];
		c = str.split("");
		Arrays.sort(c);
		
		String result = new String();
		int j = str.length()-1;
		for(int i = 0; i < str.length() && j >= 0; i++, j--) {
			r[i] = c[j];
			result = result+r[i];
		}

		
		answer = Long.parseLong(result);
		return answer;
	}
}
