package Studentgrade;
import java.util.Scanner;
public class condition {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your mark to check grade");
	int mark=sc.nextInt();
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
