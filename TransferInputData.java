package ramya.pokemongo.boxcleaner;

public class TransferInputData {
	private int unusedCandies;
	private int unevolvedPokemon;
	private final int CANDIES_TO_EVOLVE;
	
	public TransferInputData (int unevolvedPokemon, int unusedCandies, int candiesToEvolve) {
		this.unusedCandies = unusedCandies;
		this.unevolvedPokemon = unevolvedPokemon;
		CANDIES_TO_EVOLVE = candiesToEvolve;
	}
	public int getUnusedCandies() {
		return unusedCandies;
	}
	public int getUnevolvedPokemon() {
		return unevolvedPokemon;
	}
	public int getCandiesToEvolve() {
		return CANDIES_TO_EVOLVE;
	}
	public void setUnusedCandies(int unusedCandies) {
		this.unusedCandies = unusedCandies;
	}
	public void setUnevolvedPokemon(int unevolvedPokemon) {
		this.unevolvedPokemon = unevolvedPokemon;
	}
}
