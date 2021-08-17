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
	
}
