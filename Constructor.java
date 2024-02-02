import java.util.*;
class Constructor {
	
	String name;

 	Constructor() {
    	System.out.println("constructor called");
    	name = "default constructor";
}

  	public static void main(String[] args) {

    	Constructor obj = new Constructor();
    	System.out.println("This is " + obj.name);
}

}