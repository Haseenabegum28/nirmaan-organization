package day22;

import java.util.ArrayList;
import java.util.Collections;

class array{
	
}
public class arraylist {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>(); 
    al.add(20);
    al.add(40);
    al.add(10);
    System.out.println(al);
    ArrayList<String> al2=new ArrayList<String>(); 
    al2.add("Haseena");
    al2.add("Preethika");
    al2.add("Prathisha");
    System.out.println(al2);
    ArrayList<Integer> al1=new ArrayList<Integer>(); 
    al1.add(40);
    al.addAll(al1);
    System.out.println(al);
    Collections.sort(al);
    System.out.println(al);
    System.out.println(al.retainAll(al1));
    //System.out.println(al.indexOf(al1));
    System.out.println(al2.size());
    System.out.println(al2.get(2));
    System.out.println(al2);
    System.out.println(al.getFirst());
}
}
