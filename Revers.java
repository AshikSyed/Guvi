import java.util.Scanner;

public class Revers 
{

	
	public static void main(String[] args)
	{
		Scanner ss=new Scanner(System.in);
		int sb=ss.nextInt();
		while(sb!=0)
		{
			System.out.print(sb%10);
			sb=sb/10;
		}

	}

}
