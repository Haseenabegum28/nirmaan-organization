package Day19;
@FunctionalInterface
interface Add {
	int add(int a,int b);
}
interface Sub{
	int sub(int a,int b);
}

public class Functionalin {
public static void main(String[]args) {
	Add add=(int a,int b)->a+b;
	System.out.println(add.add(20, 10));
	Sub sub=(int a,int b)->a-b;
	System.out.println(sub.sub(20, 10));
}
}
