package _02_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		new Backpack().packAndCheck();
	
		Backpack bp = new Backpack();
		bp.putInBackpack(null);
	}
}
