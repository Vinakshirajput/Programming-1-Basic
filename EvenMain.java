import java.util.Scanner;
public class EvenMain
{
	public static void main(String[] args) {
		System.out.println("to check odd and even number");
		Scanner sc = new Scanner(System.in);
			System.out.println(" enter a number");
		int a = sc.nextInt();
		
		if (a%2==0)
		{
		    	System.out.println(" even number");
		    	
		    
		}
		else{
			System.out.println(" odd number");
		}
		
	}
}
