package _02_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		new Backpack().packAndCheck();
	
		Backpack bp = new Backpack();
		Pencil pencil = new Pencil ();
		Textbook t = new Textbook ();
		Ruler r = new Ruler ();
		bp.putInBackpack(pencil);
		bp.putInBackpack(t);
		bp.putInBackpack(r);
		bp.goToSchool();
		pencil.write("(:-O");
		t.read();
		r.measure();
	}
}
