package StarProgram;

public class pattern17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int px=n; //left side
		int py=n; //right side
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j==px ||j==py)
				System.out.print("*");
				else
					System.out.print(" ");	
				
			}
			px--;
			py++;
			System.out.println("");
		}
		
		
		

	}

}
