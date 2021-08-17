import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import org.junit.Assert;

class expect 
{

	@BeforeEach
	void setUp()  {
	}

	@Test
	public void check() 
    {
        StringCalculator chk = new StringCalculator();
        Assert.assertEquals(0,chk.ADD(""));
        Assert.assertEquals(0,chk.ADD(" "));
    }
	
	@Test
    public void check1() 
    {
    	StringCalculator chk = new StringCalculator();
        Assert.assertEquals(1,chk.ADD("1"));
        Assert.assertEquals(3,chk.ADD("3"));
        Assert.assertEquals(5,chk.ADD("5"));
        Assert.assertEquals(7,chk.ADD("7"));
        Assert.assertEquals(9,chk.ADD("9"));
    }
	
	@Test
    public void check2() 
    {
    	StringCalculator chk = new StringCalculator();
        Assert.assertEquals(3,chk.ADD("1,2"));
        Assert.assertEquals(7,chk.ADD("3,4"));
        Assert.assertEquals(11,chk.ADD("5,6"));
        Assert.assertEquals(15,chk.ADD("7,8"));
        Assert.assertEquals(9,chk.ADD("9,0"));
    }
	
	@Test
    public void check3() 
    {
    	StringCalculator chk = new StringCalculator();
        Assert.assertEquals(3,chk.ADD("1,2"));
        Assert.assertEquals(10,chk.ADD("1,2,3,4"));
        Assert.assertEquals(21,chk.ADD("1,2,3,4,5,6"));
        Assert.assertEquals(36,chk.ADD("1,2,3,4,5,6,7,8"));
        Assert.assertEquals(45,chk.ADD("1,2,3,4,5,6,7,8,9,0"));
    }
	
	@Test
    public void check4()
    {
		StringCalculator chk = new StringCalculator();
        Assert.assertEquals(3,chk.ADD("1\n2"));
        Assert.assertEquals(7,chk.ADD("3\n4"));
        Assert.assertEquals(11,chk.ADD("5\n6"));
        Assert.assertEquals(15,chk.ADD("7\n8"));
        Assert.assertEquals(9,chk.ADD("9\n0"));
    }
	
	@Test
    public void check5() 
    {
		StringCalculator chk = new StringCalculator();
        Assert.assertEquals(6,chk.ADD("/;;;;/;;;[***]\n1*2;;%3"));
        Assert.assertEquals(7,chk.ADD(";;;;;//;3***;*;*;\n\n4**;;**//"));
        Assert.assertEquals(11,chk.ADD("//5/\\n/[%%%][*****][;;;;][****]\\n[%%%%]\n6"));
        Assert.assertEquals(15,chk.ADD("[]%***//7\n8;;;"));
        Assert.assertEquals(9,chk.ADD("/////;[*****];\\n//9\n;;%%%%%%;****;[;;;\\n[[;]]]0"));
    }
	
	@Test
	public void check6()  
	 {
		StringCalculator chk = new StringCalculator();
	    try
	    {
	    	chk.ADD("1,-3,-7,-2,-8,-5");
	    }
	    catch (RuntimeException e)
		{
	    		Assert.assertEquals("Negatives not allowed -3-7-2-8-5", e.getMessage());
		}
		
	 }
	
	@Test
	public void check7()  
	 {
		StringCalculator chk = new StringCalculator();
	    try
	    {
	    	chk.ADD("7,5,9,9,5,-4");
	    }
	    catch (RuntimeException e)
		{
	    		Assert.assertEquals("Negatives not allowed -4", e.getMessage());
	    }
		
	 }
}
