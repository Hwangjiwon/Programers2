package Token;

import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("try hello world"));
	}

	public static String solution(String s) {
		String answer = "";
		StringTokenizer tok = new StringTokenizer(s, " ");
		String[] str = new String[tok.countTokens()];

		int cnt = 0;
		while (tok.hasMoreTokens()) {
			str[cnt] = tok.nextToken();
			cnt++;
		}

		for (int i = 0; i < cnt; i++) {

			for (int j = 0; j < str[i].length(); j++) {
				if (j % 2 == 1)
					answer = answer.concat(String.valueOf(str[i].toLowerCase().charAt(j)));
				else
					answer = answer.concat(String.valueOf(str[i].toUpperCase().charAt(j)));
			}
			answer = answer.concat(" ");
		}
		answer = answer.trim();
		
		
		return answer;
	}
}
