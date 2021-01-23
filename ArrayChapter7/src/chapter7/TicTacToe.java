package chapter7;

public class TicTacToe {

	public void play(int i, int j) {
		if(i < 1 || i > 3) {
			throw
			new RuntimeException("X is outside board");
		}
		
	}

}
