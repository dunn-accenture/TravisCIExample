public class FizzBuzz {

    public String process(Integer inputValue) {
       if (inputValue % 15 == 0) {
           return "FizzBuzz";
       }
       if (inputValue % 5 == 0){
           return "Buzz";
       }
       if (inputValue % 3 == 0){
           return "Fizz";
       }
        return inputValue.toString();
    }
}
