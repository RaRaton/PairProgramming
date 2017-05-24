package logic;

public class Bowling {

	public int finalScore(String frameTotal) {
		
		char arr[] = frameTotal.toCharArray(); // convert the String object to array of char

		int score = 0;
		
		// iterate over the array using the for-each loop.       
		int n = 0;
		int numFrames = arr.length;
		int currentFrame = 0;
		boolean isNotFinished = true;
		
		while (isNotFinished && (n < numFrames)) {
			currentFrame++;
			
			if (arr[n] == 'X'){
		    	score += 10;
		    	
		    	//process the follow pair with simple value
		    	if (arr[n+2] == '/')
		    		score += 10;
		    	else
		    		score += getValue(arr[n+1]) + getValue(arr[n+2]);	
		    	
		    	n++;
			}	
			//Processing as a pair
			else{
				//If the pair is a Spare
				if (arr[n+1] == '/'){
					score += 10 + getValue(arr[n+2]);
				}
				else{
					score += getValue(arr[n]) + getValue(arr[n + 1]);
				}
				
				n += 2;
			}	
			
	    	if (currentFrame ==  10)
	    		isNotFinished = false;
		}
		
		return score;
	}

	private int getValue(char c) {
		switch (c) {
			case 'X':
				return 10;
			case '-':
				return 0;
			default:
				return Character.getNumericValue(c);
		}		
	}
}
