package threadsAula02;

public class Main {
	public static void main(String[] args) {
		System.out.println("KA-ME-RA-ME-RAAAA");
		
		recepcao ola = new recepcao();
		recepcao ola2 = new recepcao();
		recepcao ola3 = new recepcao();
		recepcao ola4 = new recepcao();
		
		despedida tchau = new despedida();
		despedida tchau2 = new despedida();
		despedida tchau3 = new despedida();
		
		
		ola.start();
		ola2.start();
		ola3.start();
		ola4.start();
		
		tchau.start();
		tchau2.start();
		tchau3.start();
		
		/* pq não está em uma ordem? pq a própria main é uma thread ... logo a main não tem prioridade na execução
		 * só temos o controle no momento da criação, não sendo possível definir o momento que começa/termina.... S.O. que irá definir a ordem
		 * 1. colocamos no estado de pronto
		 * 2.  
		 * 
		 */
	}
}
