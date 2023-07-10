package Interface;

public class Main_interface {
	public static void main (String[] args) {
		Yassine yassine = new Yassine();
		yassine.crier();
		Chat chat = new Chat("Minouche", "Persan", 3);
		chat.crier();
		chat.vieillir();
		System.out.println(chat.getAge());
		Chien chien = new Chien();
		chien.crier();
	}
}
