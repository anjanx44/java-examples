package inner_class.sifur;

// Outer class
public class InnerClassDemo 
{
	
	// main method
	public static void main(String[] args) 
	{
		
		// inner class
		class CheckableAjobBox extends AjobBox implements Checkable
		{
			
			// constructor overriding
			public CheckableAjobBox(double lengthIn, double heightIn)
			{
				super(lengthIn, heightIn);
			} // constructor ends
			
			
			// Concrete implementation of Checkable interface's abstract method
			@Override
			public boolean check()
			{
				return getLength() > 0 && getHeight() > 0; // inherited methods from NotSquared class
			} // check method ends		
			
		} // inner class ends
		
		
		// create two checkable ajob box with different parameters
		Checkable aBox1 = new CheckableAjobBox(4, 0);
		Checkable aBox2 = new CheckableAjobBox(9, 8);
		
		
		/* get the validity reports for both object using
		 check validity method */
		String box1Result = checkValidity(aBox1);
		String box2Result = checkValidity(aBox2);
		
		
		// print the results
		System.out.println("AjobBox 1 is " + box1Result);
		System.out.println("AjobBox 2 is " + box2Result);
		
	} // main method ends
	
	
	/**
	 * Method to check whether the NotSquare object's size
	 * has a valid length and height
	 * @param objectIn An interface 
	 * @return Returns the string with size message
	 */
	public static String checkValidity(Checkable objectIn)
	{
		if(!objectIn.check()) // expecting a CheckableNotSquared object
		{
			return "invalid in size";
		}
		else
		{
			return "valid in size";
		}
	} // checkValidity method ends
	
} // InnerClassDemo ends
