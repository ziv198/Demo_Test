package ZivFahima.DemoTest;

import junit.framework.TestCase;

public class CalcTest extends TestCase{
	
	public void testApp1()
	{
		assertEquals(7,Calc.add(3, 4));
		System.out.println("add(3,4) result: calcTest "+Calc.add(3, 4));
		
	}
	
	public void testApp2()
	{
		assertEquals(5,Calc.sub(7, 2));
		System.out.println("add(7,2) result: calcTest "+Calc.sub(7, 2));
		
	}
	

}
