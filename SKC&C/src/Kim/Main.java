package Kim;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] seoul = { "Jane", "Kim" };

		System.out.println(solution(seoul));
	}

	public static String solution(String[] seoul) {
		int x = 0;
		String answer = "";

		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim"))			
				break;
			x++;
		}

		return answer = "김서방은 " + x + "에 있다";
	}
}
