package logic;

import java.util.Hashtable;

public class RomanToNumber {
	String romanNumber;
	protected Hashtable<String,Integer> RomanNumbersTable = new Hashtable<String, Integer>(); 
	
	public RomanToNumber(String romanNumberInput) {
		romanNumber = romanNumberInput;
		
		RomanNumbersTable.put("M", 1000);
		RomanNumbersTable.put("CM", 900);
		RomanNumbersTable.put("D", 500);
		RomanNumbersTable.put("CD", 400);
		RomanNumbersTable.put("C", 100);
		RomanNumbersTable.put("XC", 90);
		RomanNumbersTable.put("L", 50);
		RomanNumbersTable.put("XL", 40);
		RomanNumbersTable.put("X", 10);
		RomanNumbersTable.put("IX", 9);
		RomanNumbersTable.put("V", 5);
		RomanNumbersTable.put("IV", 4);
		RomanNumbersTable.put("I", 1);
	}

	public int getNumber() {
		int total = 0;
		int i = 0;
		while (i < romanNumber.length())
		{
			//If there is a couple to process and the couple has a value in roman number table
			if ( (i < romanNumber.length() - 1) && 
				 (RomanNumbersTable.containsKey( romanNumber.substring(i, i+2) ))
				){
				
				total += RomanNumbersTable.get( romanNumber.substring(i, i+2) );
				i +=2;
			}
			//Only one letter to process or the couple is not a roman number in the table
			else
			{
				String letter = romanNumber.charAt(i) + "";
				total += RomanNumbersTable.get(letter);
				i++;
			}
		}
		return total;			
	}
}
