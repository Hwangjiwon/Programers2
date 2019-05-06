package ArrSum;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1 = { { 1, 2 }, { 2, 3 } };
		int[][] arr2 = { { 3, 4 }, { 5, 6 } };
		System.out.println(solution(arr1, arr2));
	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = {};
		int len = arr1.length;
		int lens = arr1[0].length;
		
		answer = new int[len][lens];
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < lens; j++) {
				answer[i][j] = arr1[i][j]+arr2[i][j];
			}
		}

		return answer;
	}
}
