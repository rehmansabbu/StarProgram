package StarProgram;

public class pattern7 {

	/**
	 
	*
   **
  ***
 ****
*****
 ****
  ***
   **
    *
	 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int l=1;l<=5;l++)
		{
			for(int m=1;m<=l;m++)
			{
				System.out.print(" ");
			}
			for(int n=4;n>=l;n--)
			{
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		
		
		
		
		
		
	}

}
