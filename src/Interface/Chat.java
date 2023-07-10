package Interface;

public class Chat extends Animals  implements ICrier {

	public Chat(String nom, String race, int age) {
		super(nom, race, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crier() {
		System.out.println("Miaow Miaow");		
	}

}
