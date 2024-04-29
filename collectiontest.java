import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionTest {

	@Test
	public void testThatCollectionRateWorks() {
	int number = CollectionRate.result(40);
	int expectedResult = 11400;
	//assertion
	assertEquals(expectedResult, number);

	}
   }