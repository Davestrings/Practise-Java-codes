//You roll two dice. Each die has six faces, which contain one, two, three, four, five and
//six spots, respectively. After the dice have come to rest, the sum of the spots on the two
//upward faces is calculated. If the sum is 7 or 11 on the first throw, you win. If the sum
//is 2, 3 or 12 on the first throw (called “craps”), you lose (i.e., the “house” wins). If the
//sum is 4, 5, 6, 8, 9 or 10 on the first throw, that sum becomes your “point.” To win,
//you must continue rolling the dice until you “make your point” (i.e., roll that same
//point value). You lose by rolling a 7 before making your point
// Write an application that runs 1,000,000 games of craps (Fig. 6.8) and
//answers the following questions:
//a) How many games are won on the first roll, second roll, …, twentieth roll and after the
//twentieth roll?
//b) How many games are lost on the first roll, second roll, …, twentieth roll and after the
//twentieth roll?
//c) What are the chances of winning at craps? [Note: You should discover that craps is one
//of the fairest casino games. What do you suppose this means?]
//d) What is the average length of a game of craps?
//e) Do the chances of winning improve with the length of the game?

package chapter7;

import java.security.SecureRandom;

public class crapGameV1 {
	private enum gameStatus { WIN, LOSE, POINT};
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int TWELVE = 12;
	private static final int ELEVEN = 11;
	
	public void playGame() {
		int dieRoll = rollDieAndSum();
			if(dieRoll == SEVEN || dieRoll == ELEVEN) {
				
			}else if(dieRoll == TREY || dieRoll == SNAKE_EYES || dieRoll == TWELVE) {
				
			}
			
	}
	public int rollDieAndSum() {
		SecureRandom random = new SecureRandom();
		int num1 = 1 + random.nextInt(6);
		int num2 = 1 + random.nextInt(6);
		return num1 + num2;
	}
	
}
