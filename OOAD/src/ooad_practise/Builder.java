package ooad_practise;

public enum Builder {
	FENDER,
	GIBSON,
	RYAN,
	PRS,
	OLSON,
	COLLINGS,
	MARTIN,
	SPARKLE,
	STARSUN,
	ANY;
	
	public String toString() {
		switch(this) {
		case FENDER:
			return "Fender";
		case GIBSON:
			return "Gibson";
		case RYAN: 
			return "Ryan";
		case PRS:
			return "PRS";
		case OLSON:
			return "Olson";
		case COLLINGS:
			return "Collings";
		case MARTIN:
			return "Martin";
		case SPARKLE:
			return "Sparkle";
		case STARSUN:
			return "StarSun";
		case ANY:
			return "Any";
		default:
			return "null";
			
		}
	}
}
