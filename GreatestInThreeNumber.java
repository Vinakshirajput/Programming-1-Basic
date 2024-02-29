import java.util.Scanner;
public class GreatestInThreeNumber
{
	public static void main(String[] args) {

		
		System.out.println("to check greatest number");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n= sc.nextInt();
		int o = sc.nextInt();
		if(m>n&&m>o)
		{ 
		
		System.out.println("greatest number is ");
		System.out.println(m);
		
	    }
	    else if (n>m&&n>o){
	        
	        	System.out.println("greatest number is ");
		System.out.println(n);
		
	    }
	    else{
	        System.out.println("greatest number is ");
		System.out.println(o);
	    }
	    
	    
	    
	    
}
}

