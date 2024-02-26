import java.util.InputMismatchException;
import java.util.Scanner;

public class EasyScannerPlus
{
	public static int nextInt()
	{
            boolean success = false;
            int i = 0;
            while(!success)
            {
                try
                {
                    Scanner sc = new Scanner(System.in);
                    i = sc.nextInt();
                    success = true;
                }
                catch(InputMismatchException e)
                {
                   System.out.print("Re-enter: ");
                }
            } 
            return i;
	}
	
	public static double nextDouble()
	{
            boolean success = false;
            double d = 0;
            while(!success)
            {
                try
                {
                    Scanner sc = new Scanner(System.in);
                    d = sc.nextDouble();
                    success = true;
                }
                catch(InputMismatchException e)
                {
                   System.out.print("Re-enter: ");
                }
            } 
            return d;
	}
	
	public static String nextString()
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		return s;
	}
	
	public static char nextChar()
	{
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		return c;
	}
}
