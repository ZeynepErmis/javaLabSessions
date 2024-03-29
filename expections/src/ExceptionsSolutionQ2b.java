import java.util.Arrays;

public class ExceptionsSolutionQ2b
{
   public static void main(String[] args)
   {
	int[] someArray = {12,9,3,11};
        try
        {
            int position = getPosition();
            display (someArray, position);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Position should be an integer");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Position should be a number from 0 to 3");
        }

        catch(Exception e)
        {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        
	System.out.println("End of program" );
    }
    
    static int getPosition()
    {
	System.out.print("Enter array position to display: ");
	String positionEntered = EasyScannerPlus.nextString(); // requires EasyScanner class
	return Integer.parseInt(positionEntered);
    }
    
    static void display (int[] arrayIn, int posIn)
    {
        System.out.println("Item at this position is: " + arrayIn[posIn]);
    }
}

