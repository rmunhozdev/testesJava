package br.com.rmunhozdev.teste001;

public class Classe001 {
	protected int xvalor = 0;

	public Classe001(int xvalor) {
		super();
		this.xvalor = xvalor;
		System.out.println(this.xvalor);
	}
	public Classe001() {
		super();
		System.out.println(this.xvalor);
	}

//tem que ser public para visibilidade
	public class OlaZ {
		public void imprime() {
			System.out.println("Olá Z. Que coisa não !!!");
		}
	}

	public void imprime(int xvalor) {
		if (xvalor == 1) {
			OlaA olaz = new OlaA();
			olaz.imprime();
		} else if (xvalor == 2) {
			OlaB olaz = new OlaB();
			olaz.imprime();
		} else {
			System.out.println("Nem A nem B...");
			throw new IllegalArgumentException("Valor inválido: " + xvalor);
		}
	}

	public void imprimeObj(Classe001 classex01) {
		if (xvalor == 1) {
			OlaA olaz = new OlaA();
			olaz.imprime();
		} else if (xvalor == 2) {
			OlaB olaz = new OlaB();
			olaz.imprime();
		} else {
			System.out.println("Nem A nem B...");
//			throw new IllegalArgumentException("Valor inválido: " + xvalor);
		}
	}

//public para visibilidade
	public void metodoX() {
		System.out.println("Teste Classe Anônima Z...");
	}
}

class OlaA {
	public void imprime() {
		System.out.println("Olá A. Que coisa não !!!");
	}
}

class OlaB {
	public void imprime() {
		System.out.println("Olá B. Que coisa não !!!");
	}
}
