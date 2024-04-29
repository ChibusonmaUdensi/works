import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Palindrome {
	
	@Test
	public void testIfNumberIsPalindrome(){
		boolean result = PalindromeChecker.isPalindrome(112211);
		assertTrue(result);
	}

	@Test
	public void testIfSixNumberIsPalindrome() {
		boolean result = PalindromeChecker.isPalindrome(121);
		assertTrue(result);
	}
  }

