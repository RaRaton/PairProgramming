package logic;

public class RomanNumeral {
	protected int number;
	
	int[] ints = new int[] {1000, 900, 500, 400, 
							100, 90, 50, 40, 10, 
							9, 5, 4, 1};
	String[] romans = new String[]{"M", "CM", "D", 
								   "CD", "C", "XC", 
								   "L", "XL", "X", 
								   "IX", "V", "IV", "I"};
	
	public RomanNumeral(int numberIn){
		number = numberIn;
	}

	public String getRoman() {
		String result = "";
		
		if ((number < 1) || (number > 3999))
			return result;
		
		for (int i = 0; i < ints.length; i++) {
			int times = number / ints[i];
			if (times > 0)
				number = number % ints[i];
			while (times > 0)
			{
				result += romans[i];
				times--;
			}
		}		
		
		return result;
	}
}