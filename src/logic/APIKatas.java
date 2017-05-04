package logic;

public class APIKatas {
	public APIKatas (){
	}
	
	public String FizzBuzz(int numberIn){
		if ((numberIn % 105) == 0)
			return "fizzbuzzpop";
		else if ((numberIn % 35) == 0)
			return "buzzpop";
		else if ((numberIn % 21) == 0)
			return "fizzpop";
		else if ((numberIn % 15) == 0)
			return "fizzbuzz";
		else if ((numberIn % 3) == 0)
			return "fizz";
		else if ((numberIn % 5 ) == 0)
			return "buzz";
		else if ((numberIn % 7) == 0)
			return "pop";
		
		
		return Integer.toString(numberIn);
	}
}

