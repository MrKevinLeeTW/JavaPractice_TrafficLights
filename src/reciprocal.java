import java.util.Scanner;


public class reciprocal
{
	
	@SuppressWarnings("unused")
	public reciprocal()
	{
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	
		
		int i,z,x;
		int a;					/*厚縊计*/
		int s;					/*縊计*/
		
		printf("\n厚縊计:");					
		a =scanner.nextInt();		/*块厚縊计 */
		printf("縊计:");				
		s =scanner.nextInt();			/*块縊计*/
		
		for( i=a;i>3;i--)
		{
		printf("厚縊	:");
		System.out.println(i);
		sleep tom = new sleep();
		}

		for( z=i;z>0;z--)
		{	
		printf("独縊	:");
		System.out.println(z);
		sleep tom = new sleep();
		}
			
		for( x=s;x>=0;x--)
		{		
		printf("縊	:");
		System.out.println(x);
		sleep tom = new sleep();
		}
	}

	public static void printf(String name)	/*陪ボゅ*/
	{
		System.out.print(name);
	}

	

}




