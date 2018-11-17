package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertStmt {

		@Test
		public void positiveDigit() {
			System.out.println("Welcome to jenkins world");
			int a=4,b=-66;
			int c = a+b;
			if(c>0) {
				System.out.println("Test Passess");
				Assert.assertTrue(true);
				System.out.println("It is positive digit");
			}
			else
			{	
				System.out.println("Test Fails");
				Assert.assertTrue(false);
				System.out.println("It is negative digit");
			}

		}
		@Test
		public void failConsciously() {
			Assert.assertTrue(false);

		}

	}


