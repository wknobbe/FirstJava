public class FizzBuzz {
    public String fizzBuzz(int number){
        if(number % 3 == 0 && number % 5 == 0){
            String response = "FizzBuzz";
            return response;
        }
        else{
            if(number % 3 == 0 && number % 5 != 0){
                String response = "Fizz";
                return response;
            }
            if(number % 3 != 0 && number % 5 == 0){
                String response = "Buzz";
                return response;
            }
            else{
                String response = "" + number;
                return response;
            }
        }
    }
}