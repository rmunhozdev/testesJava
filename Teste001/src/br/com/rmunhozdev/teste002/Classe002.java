package br.com.rmunhozdev.teste002;

public class Classe002 {
	protected int xvalor = 0;

	public Classe002(int xvalor) {
		super();
		this.xvalor = xvalor;
		System.out.println(this.xvalor);
	}
	public Classe002() {
		super();
		System.out.println(this.xvalor);
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
			throw new IllegalArgumentException("Unexpected value: " + xvalor);
		}
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
