public class StringCalculator 
{
	public static int count=0;
	public int ADD(String numbers)
    {
		count++;
        if(numbers.equals("") || numbers.equals(" "))
        {
        	return 0;
        }   
        return 0;
     }
	
	public int GetCalledCount()
	{
		return count;
	}
}