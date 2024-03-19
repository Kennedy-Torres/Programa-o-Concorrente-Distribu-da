package threadsAula02;

public class despedida extends Thread {
	public void run() {
		System.out.println("Entrando em " + this.getName());
		System.out.println(this.getName() + " Tchau!");
		System.out.println("Saindo da " + this.getName());

	}
}
