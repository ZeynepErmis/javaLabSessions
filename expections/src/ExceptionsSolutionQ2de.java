public class ExceptionsSolutionQ2de
{
    public static void main(String[] args)
    {
        int[] someArray = {12,9,3,11};
        try
        {
            int position = getPosition(); // Try to get the position input from the user
            display (someArray, position); // Try to display the item at the specified position in the array
        }
        catch(NumberFormatException e)
        {
            System.out.println("Position should be an integer"); // Handle the exception if the position entered is not an integer
        }

        catch(InvalidPositionException e)
        {
            System.out.println(e); // Handle the custom exception if an invalid position is entered
        }

        catch(Exception e)
        {
            System.out.println(e.getStackTrace()); // Handle any other unexpected exceptions by printing their stack trace
        }

        System.out.println("End of program" ); // Print "End of program" to indicate the end of the program
    }

    static int getPosition()
    {
        System.out.print("Enter array position to display: "); // Prompt the user to enter the position of the array to display
        String positionEntered = EasyScannerPlus.nextString(); // Read the user input
        return Integer.parseInt(positionEntered); // Parse the input string to an integer and return it
    }

    static void display (int[] arrayIn, int posIn) throws InvalidPositionException
    {
        if(posIn < 0 || posIn >3) // Check if the position is valid
        {
            throw new InvalidPositionException(); // Throw a custom exception if the position is invalid
        }
        System.out.println("Item at this position is: " + arrayIn[posIn]); // Print the item at the specified position in the array
    }
}
