import java.util.*;

class Swap{
	
	public static void main(String[] args){
		
	int a=10;
	int b=20;
	System.out.println("a=10 and b=20");
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("after swapping");
	System.out.println(" value of a = " + a + " value of b = " + b);

}

}