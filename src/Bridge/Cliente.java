package Bridge;

public class Cliente {

	public static void main(String[] args) {
		
		//Creo una Protesis de tipo Completa
		Protesis protesis1 = new Completa(new Diseña(), new Fabrica());
		
		//Ejecuta las implementaciones
		protesis1.montaje();		
		
		//Creo una Protesis de tipo Fija
		Protesis protesis2 = new Fija(new Diseña(), new Fabrica());
		
		//Ejecuta las implementaciones
		protesis2.montaje();

	}

}
