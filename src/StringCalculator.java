public class StringCalculator 
{
	public static int count=0;
	public int ADD(String numbers)
    {
		count++;
        if(numbers.equals("") || numbers.equals(" "))
        {
        	return 0; // return for null or blank string
        }   
        else 
        {
        	int sum=0;
        	char[] ch = new char[numbers.length()];
        	for(int i=0;i<numbers.length();i++)
        	{
        		ch[i]=numbers.charAt(i);
        		if(ch[i]!='/' && ch[i]!=',' && ch[i]!='[' && ch[i]!=']' && ch[i]!='%' && ch[i]!='*' && ch[i]!='n' && ch[i]!='\n' && ch[i]!='\\' && ch[i]!=';')
        		{
        			int k=0;
        			// calculation for negative numbers
        			String negativenum="";
        			if(ch[i]<0)
        			{
        				negativenum= negativenum+ch[i];
        				k++;
        			}
        			if(k>0)
        			{
        				throw new RuntimeException("Negatives not allowed "+negativenum);
        			}
        			// calculation for positive numbers with +
        			if(ch[i]=='+')
        			{
        		        sum = 0;
        		        String[] aftersplit = numbers.split("[+]");
        		 		for(String temp : aftersplit)
        		 		{
        		 			int tempint = Integer.parseInt(temp);
        		 		    if(tempint<=1000)
        		 		    {
        		 		    	sum=sum+tempint;
        		 		    }
        		 	    }
        				return sum;
        			}
        			// calculation for cases contaning delimeters
        			sum = sum + Character.getNumericValue(ch[i]);
        		}
        	}
        	return sum;
        }
     }
	
	public int GetCalledCount()
	{
		return count; // return of number of times ADD called
	}
}