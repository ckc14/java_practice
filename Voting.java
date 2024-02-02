import java.util.Scanner;
class Voting{
	
	public static void main(String args[]){

	System.out.println("Enter Your Age : ");
	Scanner myobj= new Scanner(System.in);
	int age = myobj.nextInt();

	if(age >= 18)
	System.out.println("You Are Eligible");

	else if(age < 18)
	System.out.println("You Are Not Eligible");

}
}