package threadsAula02;

public class recepcao extends Thread {
	public void run() {
		System.out.println("Entrando em " + this.getName());
		System.out.println(this.getName() + " Olá!");
		System.out.println("Saindo da " + this.getName());
	}
}
