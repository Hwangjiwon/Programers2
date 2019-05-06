package MakeString;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "try hello world";
		System.out.println(solution(s));
	}

	public static String solution(String s) {
		String answer = "";
		char[] c = new char[s.length()];
		int idx = 0;

		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
			if (c[i] == ' ')
				idx = 0;
			else {
				if (idx % 2 == 0)
					c[i] = Character.toUpperCase(c[i]);
				else
					c[i] = Character.toLowerCase(c[i]);
				idx++;
			}
			answer += String.valueOf(c[i]);
		}

		return answer;
	}
}
