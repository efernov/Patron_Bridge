package Bridge;

public class Fija extends Protesis {

	public Fija(Protesico protesico1, Protesico protesico2) {
		super(protesico1, protesico2);
	}

	@Override
	public void montaje() {
		System.out.print("La Protesis Fija ");
		getProtesico1().trabajo();
		getProtesico2().trabajo();
	}

	
	
} 
