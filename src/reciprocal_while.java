import java.util.Scanner;


public class reciprocal_while
{
	@SuppressWarnings("unused")
	public reciprocal_while()
	{
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int i,z,x;
		int a;					/*��O����*/
		int s;					/*���O����*/
		
		printf("\n��O����:");					
		a =scanner.nextInt();		/*��J��O���� */
		printf("���O����:");				
		s =scanner.nextInt();			/*��J���O����*/
	
		 int l=1;/*�L���j��*/
		while(l==1)
		{	
			for( i=a;i>3;i--)
			{
			printf("��O	:");
			System.out.println(i);
			sleep tom = new sleep();
			}

			for( z=i;z>0;z--)
			{	
			printf("���O	:");
			System.out.println(z);
			sleep tom = new sleep();
			}
				
			for( x=s;x>=0;x--)
			{		
			printf("���O	:");
			System.out.println(x);
			sleep tom = new sleep();
			}
			
			
			
			
			
		}
	}

	public static void printf(String name)	/*��ܤ�r*/
	{
		System.out.print(name);
	}
	
	
	
	
}
