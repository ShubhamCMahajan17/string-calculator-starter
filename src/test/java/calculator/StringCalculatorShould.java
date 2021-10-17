package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {
//Question 1
    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        try {
			assertEquals(0, stringCalculator.add(""));
		} catch (negativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        try {
			assertEquals(1, stringCalculator.add("1"));
		} catch (negativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @Test
    void string_with_Two_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        try {
			assertEquals(3, stringCalculator.add("1,2"));
		} catch (negativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    //Question 2
    @Test
    void string_with_multiple_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        try {
			assertEquals(10, stringCalculator.add("1,2,3,4"));
		} catch (negativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    //Question 3
    @Test
    void string_with_multiple_number_And_NewLine_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        try {
			assertEquals(6, stringCalculator.add("1\n2,3"));
		} catch (negativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    //Question4
    @Test
    void string_with_multiple_number_And_Multiple_Demiliters_should_return_number_as_int() throws NumberFormatException, negativeNumberException {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(10, stringCalculator.add("//;\\n1;2,3:4"));
    }
    //Question 5
    @Test
    void string_with_Negative_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        try {
			assertEquals(5, stringCalculator.add("1,-2,-3;4"));
		} catch (negativeNumberException e) {
		
			e.printStackTrace();
		}
    }
    
    //Question 6
    @Test
    void string_with_BiggerNo_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        try {
			assertEquals(6, stringCalculator.add("1,1001,2,3"));
		} catch (negativeNumberException e) {
		
			e.printStackTrace();
		}
    }
}
