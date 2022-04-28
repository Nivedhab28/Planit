import java.util.Scanner;

public class Fibonacciprg {
	public static int nthFibo(int input1)
	{
		if(input1==1)
		{
			return 0;
			
		}
		else if(input1==2)
		{
			return 1;
			
		}
		else if(input1==3)
		{
			return 2;
			
		}
		else {
			return nthFibo(input1-1)+nthFibo(input1-2);
			
		}
	}
	
	public static void main(String[] args) {
	int num, result;
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	result=nthFibo(num);
	System.out.println("Nth value is "+result);
	
	
	
	
	}
}
