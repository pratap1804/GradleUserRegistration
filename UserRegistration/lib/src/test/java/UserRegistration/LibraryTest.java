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
	@Test
	void givenEmail_ShoulHave_ThreeMandatoryPart_TwoOptionalPart() {
		Library myUserName = new Library();
		boolean result = myUserName.checkValidLastName("pratap.abc@gmail.com");
		Assertions.assertEquals(true, result);
	}
	
	@Test
	void givenMobile_ShouldBeginWithCountryCode_AndHaveMinimumTenNumbers() {
		Library myMobileNumber = new Library();
		boolean result = myMobileNumber.checkValidMobileNumber("91 8989156503");
		Assertions.assertEquals(true, result);
	}
	
	@Test
	void givenPassword_ShouldBeHaving_MinimumEightCharacters() {
		Library myPasswordFirstRule = new Library();
		boolean result = myPasswordFirstRule.checkValidMobileNumber("abcdefgh");
		Assertions.assertEquals(true, result);
	}
	
	@Test
	void givenPassword_ShouldBeHaving_AtleatOneUpperCaseCharacter() {
		Library myPasswordSecondRule = new Library();
		boolean result = myPasswordSecondRule.checkForValidPasswordSecondRule("abcdefghA");
		Assertions.assertEquals(true, result);
	}
	
	@Test
	void givenPassword_ShouldBeHaving_AtleatOneUpperCaseCharacter_WithOneNumeric() {
		Library myPasswordThirdRule = new Library();
		boolean result = myPasswordThirdRule.checkForValidPasswordThirdRule("abcdefghiA123");
		Assertions.assertEquals(true, result);
	}
}