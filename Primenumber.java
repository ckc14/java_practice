class Primenumber{

	public static void main(String args[]){
	
	int number=27, a=2;
	boolean temp=false;
	while (a<=number/2){
	if(number%a==0){
	temp=true;
	break;
}
	++a;
}
	if(!temp){
	System.out.println(number+ "your no. is prime");
	}
	else{
	System.out.println(number+ "your no. is non prime");
	}
}

}