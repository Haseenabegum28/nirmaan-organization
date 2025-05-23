package day3;

import day17.main;

public class forloop {
	public static void main(String[] args) {
		
		for(int i =1;i<=10;i+=1) {
			if(i%2==0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}
}
