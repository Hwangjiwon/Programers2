package Subak;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println(solution(n));
	}
	 public static String solution(int n) {
	      String answer = "����".repeat(n).substring(0, n);
	      return answer;
	  }
}
