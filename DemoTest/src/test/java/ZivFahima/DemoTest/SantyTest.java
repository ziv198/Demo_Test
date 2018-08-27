package ZivFahima.DemoTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class SantyTest {
	
	
	
  @Test
  public void AppTest1() {
	  
	  assertEquals(8,Calc.add(4, 4));
		System.out.println("add(4,4) result: Santy"+Calc.add(4, 4));
		
  }
}
