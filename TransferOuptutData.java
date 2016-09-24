package ramya.pokemongo.boxcleaner;

public class TransferOuptutData {
	private int candiesLeft;
	private int maxToTransfer;
	private int minToTransfer;
	private int evolvable;
	
	public TransferOuptutData () {
		candiesLeft = 0;
		maxToTransfer = 0;
		minToTransfer = 0;
		evolvable = 0; 
	}
	public int getCandiesLeft() {
		return candiesLeft;
	}
	public void setCandiesLeft(int candiesLeft) {
		this.candiesLeft = candiesLeft;
	}
	public int getMaxToTransfer() {
		return maxToTransfer;
	}
	public void setMaxToTransfer(int maxToTransfer) {
		this.maxToTransfer = maxToTransfer;
	}
	public int getMinToTransfer() {
		return minToTransfer;
	}
	public void setMinToTransfer(int minToTransfer) {
		this.minToTransfer = minToTransfer;
	}
	public String toString() {
		return "Transfer a minimum of " + minToTransfer + " Pokemon and a maximum of " + maxToTransfer + " Pokemon.\n"
				+ evolvable + " Pokemon can be evolved.";
	}
	public int getEvolvable() {
		return evolvable;
	}
	public void setEvolvable(int evolvable) {
		this.evolvable = evolvable;
	}
}
