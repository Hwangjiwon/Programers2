package MinMax;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1 -2 3 4";
		System.out.println(solution(s));
	}
	
	 public static String solution(String s) {
	      String answer = "";
	      StringTokenizer st = new StringTokenizer(s," ");
	      ArrayList<Integer> arr = new ArrayList<Integer>();
	      
	      while(st.hasMoreTokens()) {
	    	  arr.add(Integer.parseInt(st.nextToken()));
	      }
	      
	      Collections.sort(arr);
	      
	      answer = String.valueOf(arr.get(0));
	      answer = answer.concat(" ");
	      answer = answer.concat(String.valueOf(arr.get(arr.size()-1)));
	      
	      
	      return answer;
	  }

}
