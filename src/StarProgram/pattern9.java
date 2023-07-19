package StarProgram;

public class pattern9 {

	/**
	 
	*
   ***
  *****
 ******* 
	 
	 */
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
			System.out.print(" "); //SPACE
		    }
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");  //STAR
			}
			
			for(int l=2;l<=i;l++)
			{
				System.out.print("*");  // STAR
			}
			
			System.out.println();
			
			
		
		}
		
		
		

	}

}
