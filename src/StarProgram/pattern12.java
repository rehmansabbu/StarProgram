package StarProgram;

public class pattern12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		int n=5;
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if((i==1) || (i==n) || (j==1) || (j==n))
				//if(row==colmn)
				
					System.out.print("*");
				
				else
				
					System.out.print(" ");
			}
				
				System.out.println("");
							
				
			}
		}
		

	}


