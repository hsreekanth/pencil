package java8.main;

import java.awt.List;

import java8.lamda.MyTeamImpl;

public class MainClass {

	public static void main(String[] args) {
		MyTeamImpl myTeam = new MyTeamImpl();
		myTeam.childFounder();
		java.util.List<Integer> list = myTeam.founder();
		list.forEach(a->System.err.println(a));		
		
	}

}
