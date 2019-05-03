package Bigger;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {6, 10, 2};
		System.out.println(solution(numbers));
	}
	
	public static String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++) {
        	map.put(numbers[i],0);
        	str[i] = String.valueOf(numbers[i]);
        }
        return answer;
    }
}
