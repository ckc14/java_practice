class Fibonacci {
	public static void main(String[] args) {

    	int i = 1, n = 10;
	int a = 0, b = 1;
	
	System.out.println("Print Fibonacci till " + n + " terms:");

	while (i <= n) {
	System.out.print(a + " ");

	int c = a + b;
	a = b;
	b = c;

	i++;
}

}

}