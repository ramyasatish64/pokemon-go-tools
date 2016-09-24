package ramya.pokemongo.boxcleaner;

public class BoxCleaner {
	
	public TransferOuptutData cleanBox(int pokemon, int userCandies, int candiesToEvolve) {
		TransferOuptutData output = new TransferOuptutData();
		TransferInputData input = new TransferInputData(pokemon, userCandies, candiesToEvolve);
		evolveAndTransfer(output,input);
		return output;
	}
	public void evolveAndTransfer(TransferOuptutData output, TransferInputData input) {
		int evolved = 0;
		int transfer = 0; 
		int pokemon = input.getUnevolvedPokemon();
		do {
			evolved += evolve(input);
			transfer += transfer(input);
		}
		while(canEvolveOne(input));
		output.setMaxToTransfer(pokemon-evolved);
		output.setMinToTransfer(transfer);
		output.setEvolvable(evolved);
	}
	public boolean canEvolveOne(TransferInputData input) {
		int pokemon = input.getUnevolvedPokemon();
		int userCandies = input.getUnusedCandies();
		int candiesToEvolve = input.getCandiesToEvolve();
		
		if (userCandies < candiesToEvolve || pokemon <= 0) {
			return false;
		}
		return true;
	}
	public int transfer(TransferInputData input) {
		int pokemon = input.getUnevolvedPokemon();
		int userCandies = input.getUnusedCandies();
		int candiesToEvolve = input.getCandiesToEvolve();
		int max = 0;
		int evolvable = userCandies / candiesToEvolve;
		if(evolvable == 0 && pokemon > evolvable) {
			int candiesForOne = candiesToEvolve - userCandies;
			if (pokemon > candiesForOne) {
				max = candiesForOne;
			}
		}
		input.setUnevolvedPokemon(pokemon-max);
		input.setUnusedCandies(userCandies+max);
		return max;
	}
	public int evolve(TransferInputData input) {
		int pokemon = input.getUnevolvedPokemon();
		int userCandies = input.getUnusedCandies();
		int candiesToEvolve = input.getCandiesToEvolve();
		
		int evolvable = Math.min(pokemon, userCandies/candiesToEvolve);
		input.setUnevolvedPokemon(pokemon-evolvable);
		input.setUnusedCandies(userCandies + evolvable - (candiesToEvolve*evolvable));
		return evolvable;
	}
}
