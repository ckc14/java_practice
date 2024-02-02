class Method{

	public int multiplyNumbers(int a, int b){
	int mul = a * b;
	return mul;
}

	public static void main(String[] args){
	
	int n1=20, n2=25;

	Method obj = new Method();
	
	int result= obj. multiplyNumbers(n1,n2);

	System.out.println("Product is:"+ result);

}

}
