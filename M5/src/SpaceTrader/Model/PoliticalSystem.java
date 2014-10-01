package SpaceTrader.Model;

/*
* This enumerator represents political system of a solar system.
*/
public enum PoliticalSystem {
	ANARCHY(0), CAPITALIST(1), COMMUNIST(2), CONFEDERACY(3), CORPORATE(4),
	CYBERNETIC(5), DEMOCRACY(6), DICTATORSHIP(7), FASCIST(8), FEUDAL(9),
	MILITARY(10), PACIFIST(11), SOCIALIST(12), SATORI(13), TECHNOCRACY(14),
	THEOCRACY(15);
	
	private int num;
	
	public static final int NUM_OF_POLITICAL_SYSTEM = 16;
	
	PoliticalSystem(int num) {
		this.num = num;
	}
}
