package Bridge;

public abstract class Protesis {
	
	private Protesico protesico1;
	private Protesico protesico2;
	
	public Protesis(Protesico protesico1, Protesico protesico2) {
		this.protesico1 = protesico1;
		this.protesico2 = protesico2;
	}
		
	public Protesico getProtesico1() {
		return protesico1;
	}
	
	public void setProtesico1(Protesico protesico1) {
		this.protesico1 = protesico1;
	}

	public Protesico getProtesico2() {
		return protesico2;
	}

	public void setProtesico2(Protesico protesico2) {
		this.protesico2 = protesico2;
	}

	abstract public void montaje();

}
