package NorS;

import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("1235a3"));
	}

	public static boolean solution(String s) {
		boolean answer = true;

		if (s.length() != 4 && s.length() != 6)
			return !answer;
		else {

			String pattern = "^[0-9]*$";
			boolean num = Pattern.matches(pattern, s);

			if (num == false)
				return !answer;

			return answer;
		}

	}
}
