package ZivFahima.DemoTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class RegrationTest {
	
	
  @Test
  public void AppTest1() {
	  
	  assertEquals(5,Calc.add(3, 2));
		System.out.println("add(3,2) result: Regration"+Calc.add(3, 2));
  }
  
  @Test
  public void AppTest2() {
	  assertEquals(1,Calc.sub(3, 2));
		System.out.println("add(3,2) result: Regration"+Calc.sub(3, 2));
}
}
  