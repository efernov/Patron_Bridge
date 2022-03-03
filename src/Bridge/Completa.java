package Bridge;

public class Completa extends Protesis {

	public Completa(Protesico protesico1, Protesico protesico2) {
		super(protesico1, protesico2);
		
	}

	@Override
	public void montaje() {
		System.out.print("La Prótesis Completa ");
		getProtesico1().trabajo();
		getProtesico2().trabajo();
		
	}

}
 