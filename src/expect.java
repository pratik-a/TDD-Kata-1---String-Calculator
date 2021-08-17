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
	
	
}
