package N124;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println(solution(n));
	}
	
	 public static String solution(int n) {
	      String answer = "";
	      int tmp;
	  
	      while(n>0) {
	    	tmp = n%3;  
	    	n /= 3;		
	    	
	    	if(tmp == 0) {         
	    		n -= 1;      
	    		tmp = 4;       
	    	}
	    	
	    	answer = tmp + answer;
	    	
	      }
	      
	      return answer;
	  }

}
