import java.util.Scanner;


public class Main
{
	public static void main(String[] args) 
	{ 
		int l=1;/*無限迴圈*/
		while(l==1)   //持續迴圈
		{
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			
			
			
					 //要不要連續
				System.out.print(" 連續:1   不連續:2 \n");
				int a = scanner.nextInt();				
		 
		        switch(a) 		//判斷要不要連續 
				{		
					case 1:	//連續 
					{ 	
						@SuppressWarnings("unused")
						reciprocal_while tom = new reciprocal_while();
					}
					break;						
					case 2:	//不連續 
					{	
						@SuppressWarnings("unused")
						reciprocal tom = new reciprocal();
					}			
					break;	
				}
		}
	}
	

	
}
