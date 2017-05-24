package logic;

public class RockPaperScissors {

	public String play(String turnPlayer1, String turnPlayer2) {
		if ((turnPlayer1 == "Rock") && (turnPlayer2 == "Scissors") ||
			(turnPlayer1 == "Scissors") && (turnPlayer2 == "Paper") ||
			(turnPlayer1 == "Paper") && (turnPlayer2 == "Rock"))
			return "Player1";
		else if ((turnPlayer1 == "Scissors") && (turnPlayer2 == "Rock") || 
				 (turnPlayer1 == "Rock") && (turnPlayer2 == "Paper") ||
				 (turnPlayer1 == "Paper") && (turnPlayer2 == "Scissors"))
			return "Player2";
		else
			return "Draw";
	
		
	}

}
