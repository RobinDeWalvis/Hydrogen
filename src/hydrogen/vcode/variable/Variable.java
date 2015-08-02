package hydrogen.vcode.variable;

public class Variable
{
	LocationType locType;
	DataType dataType;
	String name;
	int location;
	
	/**
	 * Variable class
	 * @param name
	 *  The name of the variable.
	 * @param location
	 *  The location on the stack relative to the function it is in.
	 */
	
	public Variable(LocationType locType, DataType dataType, String name, int location)
	{
		this.locType = locType;
		this.dataType = dataType;
		this.name = name;
		this.location = location;
	}
}
