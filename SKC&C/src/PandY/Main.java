package PandY;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("pyY"));
	}

	static boolean solution(String s) {
		boolean answer = true;
		int pCnt = 0, yCnt = 0;
		
		char[] c = new char[s.length()];
		s = s.toLowerCase();
		for(int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
			if(c[i] == 'p') pCnt++;
			else if(c[i] == 'y') yCnt++;
		}
		
		if(pCnt != yCnt) return !answer;
		
		else return answer;

	}
}
