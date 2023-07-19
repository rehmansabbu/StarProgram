package StarProgram;

public class pattern10 {

	/*
	
 *******
  *****
   ***
    *
	
	 */
	public static void main(String[] args) {
		
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "); //SPACE
			}
			
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");//STAR
			}
			
			for(int l=3;l>=i;l--)
			{
				System.out.print("*");//STAR
			}
			System.out.println("");
			
		}
		
		
		

	}

}
