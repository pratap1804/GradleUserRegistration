package UserRegistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LibraryTest {
	@Test
	void givenUserName_ShouldBeginWithAUpperCase_AndHaveMinimumThreeCharacters() {
		Library myUserName = new Library();
		boolean result = myUserName.checkValidFirstName("AbAbcde");
		Assertions.assertEquals(true, result);
	}
	
	@Test
	void givenLastName_ShouldBeginWithAUpperCase_AndHaveMinimumThreeCharacters() {
		Library myUserName = new Library();
		boolean result = myUserName.checkValidLastName("Pratap");
		Assertions.assertEquals(true, result);
	}
}
