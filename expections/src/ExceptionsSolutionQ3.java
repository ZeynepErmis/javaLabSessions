
import java.util.Scanner;

public class ExceptionsSolutionQ3 
{
    public static void main(String[] args)
    {
        try
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter a double: ");
            keyboard.nextDouble();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
