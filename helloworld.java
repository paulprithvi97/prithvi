import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

class Arithmatic {
}
class Adder extend Arithmatic {
	public int add (int a, int b){
		return a+b;
	}
}
public class Result {
	public static void main ( string []args){

		Adder a = new Adder();
		System.out.println("Class : +a.getClass().getSuperClass().getname());
		System.out.println(a.add(10,32) + " " + a.add(10,3) + " " 
				+ a.add(10,10) + );
	}
}

