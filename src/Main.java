import java.util.Scanner;


public class Main
{
	public static void main(String[] args) 
	{ 
		int l=1;/*�L���j��*/
		while(l==1)   //����j��
		{
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			
			
			
					 //�n���n�s��
				System.out.print(" �s��:1   ���s��:2 \n");
				int a = scanner.nextInt();				
		 
		        switch(a) 		//�P�_�n���n�s�� 
				{		
					case 1:	//�s�� 
					{ 	
						@SuppressWarnings("unused")
						reciprocal_while tom = new reciprocal_while();
					}
					break;						
					case 2:	//���s�� 
					{	
						@SuppressWarnings("unused")
						reciprocal tom = new reciprocal();
					}			
					break;	
				}
		}
	}
	

	
}
