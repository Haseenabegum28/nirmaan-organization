package Studentgrading;

public class Day3 {
public static void main(String[]args) {
	int mark=85;
	if(mark<35) {
		System.out.println("Fail");
	}else if(mark>=90) {
		System.out.println("Grade A");
	}else if(mark>=80) {
		System.out.println("Grade B");
	}else {
		System.out.println("Grade C");
	}
}
}
