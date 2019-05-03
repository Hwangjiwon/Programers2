package NDic;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = {"sun", "bed", "car"};
		int n = 1;
		
		for(int i = 0; i < strings.length; i++)
			System.out.println(solution(strings,n)[i]);
	}
	 public static String[] solution(String[] strings, int n) {
		 String[] answer = {};
	     
	      List<String> list = new ArrayList<String>(); 
	      
	      for(int i = 0; i < strings.length; i++) {
	    	  list.add(strings[i].charAt(n)+strings[i]);
	      }
	      
	      Collections.sort(list);
	      
	      answer = new String[list.size()];
	      
	      for(int i = 0; i < list.size(); i++) {
	    	  answer[i] = list.get(i).substring(1,list.get(i).length());
	      }
	      
	      
	      return answer;
	  }
}
