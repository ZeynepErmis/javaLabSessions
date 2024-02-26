public class ExceptionsSolutionQ2de
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
               
        catch(InvalidPositionException e)
        {
            System.out.println(e);
        }
        
        catch(Exception e)
        {
            System.out.println(e.getStackTrace());
        }
        
	System.out.println("End of program" );
    }
    
    static int getPosition()
    {
	System.out.print("Enter array position to display: ");
	String positionEntered = EasyScanner.nextString(); // requires EasyScanner class
	return Integer.parseInt(positionEntered);
    }
    
    static void display (int[] arrayIn, int posIn) throws InvalidPositionException
    {
        if(posIn < 0 || posIn >3)
        {
            throw new InvalidPositionException();
        }
        System.out.println("Item at this position is: " + arrayIn[posIn]);
    }
}

