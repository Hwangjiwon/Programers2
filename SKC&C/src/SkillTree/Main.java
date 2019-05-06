package SkillTree;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String skill = "CBD";
		String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };
		System.out.println(solution(skill, skill_trees));
	}

	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;

		Queue<Character> skt = new LinkedList<Character>();
		for (int j = 0; j < skill_trees.length; j++) {
			for (int i = 0; i < skill_trees[j].length(); i++) {
				skt.add(skill_trees[j].charAt(i));
			}
			skt.add(' ');
		}

		Queue<Character> sk = new LinkedList<Character>();
		for(int i = 0; i < skill.length(); i++) {
			sk.add(skill.charAt(i));
		}
		
		int flag = 0;
		while(!skt.isEmpty()) {
			if(skt.poll() == ' ') flag = 0;
			
		// ╟М╧наж©У....
			
		}
		
		return answer;
	}
}
