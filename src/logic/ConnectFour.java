package logic;

public class ConnectFour {
	//Columns            A  B  C  D  E  F  G
	int [ ][ ] grid = {{ 0, 0, 0, 0, 0, 0, 0 },
					   { 0, 0, 0, 0, 0, 0, 0 },
					   { 0, 0, 0, 0, 0, 0, 0 },
				       { 0, 0, 0, 0, 0, 0, 0 },
					   { 0, 0, 0, 0, 0, 0, 0 },
					   { 0, 0, 0, 0, 0, 0, 0 }
					  };
	int [ ] tokens = { 0, 0, 0, 0, 0, 0, 0 };

	public int getRow(int numberTokens, char Column) {
		switch (Column) {
			case 'A':
				tokens[0] = numberTokens + 1;
				return tokens[0];
			case 'B':
				tokens[1] = numberTokens + 1;
				return tokens[1];
			case 'C':
				tokens[2] = numberTokens + 1;
				return tokens[2];
			case 'D':
				tokens[3] = numberTokens + 1;
				return tokens[3];
			case 'E':
				tokens[4] = numberTokens + 1;
				return tokens[4];
			case 'F':
				tokens[5] = numberTokens + 1;
				return tokens[5];
			case 'G':
				tokens[6] = numberTokens + 1;
				return tokens[6];
		}
		return 0;
	}

	public String play(int[][] grid2) {
		int count;
		int currentColour;
		
		//Horizontal check
		for (int column = 0; column < grid2[0].length; column++) {
		
			count = 0;
			currentColour = 0;
			
			for (int row = 0; row < grid2.length; row++) {
				int item = grid2[row][column];
				
				//has not token
				if (item == 0)
				{
					count = 0;
					currentColour = 0;
				}
				//same colour as previous token
				else if (currentColour == item)
					count++;
				else
				{
					currentColour = item;
					count = 1;
				}	
				
				if (count == 4)
					return (currentColour == 1)? "Yellow" : "Red";
				
			}
		}
		
		//vertical check
		for (int row = 0; row < grid2.length; row++) {
			
			count = 0;
			currentColour = 0;
			
			for (int column = 0; column < grid2[row].length; column++) {
				int item = grid2[row][column];
				
				
				//has not token
				if (item == 0)
				{
					count = 0;
					currentColour = 0;
				}
				//same colour as previous token
				else if (currentColour == item)
					count++;
				else
				{
					currentColour = item;
					count = 1;
				}	
				
				if (count == 4)
					return (currentColour == 1)? "Yellow" : "Red";
				
			}
		}
		
		//vertical check
		count = 0;
		currentColour = 0;

		int maxRows = 0;
		
		for (int column = 3; column < 7; column++) {
			maxRows = (column < grid.length - 1)? column: grid.length - 1;
			
			int diagonalColumn = column;	
				
			for (int row = 0; row <= maxRows; row++) {
						
				int item = grid2[row][diagonalColumn];
				
				//has not token
				if (item == 0)
				{
					count = 0;
					currentColour = 0;
				}
				//same colour as previous token
				else if (currentColour == item)
					count++;
				else
				{
					currentColour = item;
					count = 1;
				}	
				
				if (count == 4)
					return (currentColour == 1)? "Yellow" : "Red";	
							
				diagonalColumn--;								
			}
		}
		return "None";
	}
	
	
	
	
}
