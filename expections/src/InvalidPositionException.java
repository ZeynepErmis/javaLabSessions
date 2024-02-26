public class InvalidPositionException extends Exception
{
	// Constructor without parameters
	public InvalidPositionException()
	{
		super("The number you ente r should be 0, 1, 2 or 3"); // Calls the superclass constructor with a default error message
	}

	// Constructor with a parameter for custom error messages
	public InvalidPositionException(String message)
	{
		super(message); // Calls the superclass constructor with the provided error message
	}
}
