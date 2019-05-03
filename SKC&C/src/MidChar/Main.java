package MidChar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("helow"));
	}
	
	public static String solution(String s) {
	      String answer = "";
	      
	      char[] str = new char[s.length()];
	      
	      for(int i = 0; i < s.length(); i++) {
	    	  str[i] = s.charAt(i);
	      }
	      
	      if(s.length()%2 == 0) {
	    	  answer = String.valueOf(str[s.length()/2-1]);
	    	  answer = answer.concat(String.valueOf(str[s.length()/2]));
	      }
	      else answer = String.valueOf(str[s.length()/2]);
	      
	      
	      return answer;
	  }
}
