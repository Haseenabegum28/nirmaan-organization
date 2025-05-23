package day21;

public class Wrapperclass {
public static void main(String[] args) {
	byte n1=127;//autoboxing
	Byte n2=n1;//unboxing
	byte a=n2;
	
	long n3=200;//autoboxing
	Long n4=n3;//unboxing
	long b=n4;
	
	short n5=100;//autoboxing
	Short n6=n5;//unboxing
	short c=n6;
	
	int n7=11;//autoboxing
	Integer n8=n7;//unboxing
	int d=n7;
	
	float n9=(float)29.00;//autoboxing
	Float n10=n9;//unboxing
	float e=n9;
	
	double n11=12.98d;//autoboxing
	Double n12=n11;//unboxing
	double f=n10;
	
	char n13='A';//autoboxing
	Character n14=n13;//unboxing
	char g=n13;
	
	boolean n15=true;//autoboxing
	Boolean n16=n15;//unboxing
	boolean j=n15;
	System.out.println(n2.compareTo(n1));
	System.out.println(n4.compareTo(n3));
	System.out.println(n6.compareTo(n5));
	
	
	
}
}
