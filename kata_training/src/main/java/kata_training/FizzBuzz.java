package kata_training;

public class FizzBuzz {

	public String play(int i) {
		if(i%3 == 0 ) {
			return "Fizz";
		}
		if(i%5 ==0 ) {
			return "Buzz";
		}
		
		return String.valueOf(i);
	}

}
