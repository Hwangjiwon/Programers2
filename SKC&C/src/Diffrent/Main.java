package Diffrent;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {1,1,3,3,0,1,1};
		
		for(int i = 0; i < arr.length; i++)
		System.out.println(solution(arr)[i]);
	}
	
	public static int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
        if(arr.length > 0 ) list.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++) {
        	if(!list.get(list.size()-1).equals(arr[i])) list.add(arr[i]);
        }
        
        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++)
        	answer[i] = list.get(i);
        
        return answer;
	}
}
