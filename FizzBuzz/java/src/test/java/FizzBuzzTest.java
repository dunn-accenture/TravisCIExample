import static org.junit.Assert.*;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
    public void shouldReturn1for1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualReturnValue = fizzBuzz.process(1);
        String expectedReturnValue = "1";
        assertEquals(expectedReturnValue, actualReturnValue);
    }
    @Test
    public void shouldReturnFizzfor3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualReturnValue = fizzBuzz.process(3);
        String expectedReturnValue = "Fizz";
        assertEquals(expectedReturnValue, actualReturnValue);
    }
    @Test
    public void shouldReturnBuzzfor5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualReturnValue = fizzBuzz.process(5);
        String expectedReturnValue = "Buzz";
        assertEquals(expectedReturnValue, actualReturnValue);
    }
    @Test
    public void shouldReturnFizzBuzzfor15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualReturnValue = fizzBuzz.process(15);
        String expectedReturnValue = "FizzBuzz";
        assertEquals(expectedReturnValue, actualReturnValue);
    }
    @Test
    public void shouldReturnFizzforMultipleOf3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualReturnValue = fizzBuzz.process(3*4);
        String expectedReturnValue = "Fizz";
        assertEquals(expectedReturnValue, actualReturnValue);
    }
    @Test
    public void shouldReturnFizzforMultipleOf5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualReturnValue = fizzBuzz.process(5*4);
        String expectedReturnValue = "Buzz";
        assertEquals(expectedReturnValue, actualReturnValue);
    }
    @Test
    public void shouldReturnFizzforMultipleOf15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualReturnValue = fizzBuzz.process(3*15);
        String expectedReturnValue = "FizzBuzz";
        assertEquals(expectedReturnValue, actualReturnValue);
    }
    @Test
    public void shouldReturnItselfWhenNotFizzOrBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualReturnValue = fizzBuzz.process(77);
        String expectedReturnValue = "77";
        assertEquals(expectedReturnValue, actualReturnValue);
    }
}