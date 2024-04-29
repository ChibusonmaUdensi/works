import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumTest {

	
	@Test
	public void testThatCalculatesMaximum() {
	int array = Maxim.maximum(1,2, 3, 4, 5);
	int expectedMaximum = 5;
	//assertion
	assertEquals(expectedMaximum, array);
	
	}	
}