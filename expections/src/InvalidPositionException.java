public class InvalidPositionException extends Exception
{
    	public InvalidPositionException() // constructor without parameter
	{
		super("The number you enter should be 0, 1, 2 or 3");
	}

	public InvalidPositionException(String message)// constructor with parameter
	{
		super (message);
	}

}
