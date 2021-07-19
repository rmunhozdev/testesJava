package br.com.rmunhozdev;

import br.com.rmunhozdev.teste001.Classe001;

public class Teste001 {

	public static void main(String[] args) {
		int res = 0;

		Classe003 tst001 = new Classe003();
		Classe004 tst002 = new Classe004();

		res = tst001.soma001(1, 1);
		System.out.println(res);
		res = tst001.soma002(1, 1);
		System.out.println(res);
		res = tst001.soma003(1, 1);
		System.out.println(res);
//		res = tst001.soma004(1, 1); //não visível
//		res = tst001.soma005(1, 1); //estático funciona tbm
		res = Classe003.soma005(1, 1); //estático
		System.out.println(res);

		tst001.v1 = 10;
		tst001.v2 = 20;
//		tst001.v3 = 30; //não visível
		tst001.v4 = 40;
//		tst001.v5 = 50; //estático funciona tbm
		Classe003.v5 = 50; //estático

		res = tst002.multiplica001(1, 1);
		System.out.println(res);
		res = tst002.multiplica002(1, 1);
		System.out.println(res);
		res = tst002.multiplica003(1, 1);
		System.out.println(res);
//		res = tst002.multiplica004(1, 1); //não visível
//		res = tst002.multiplica005(1, 1); //estático funciona tbm
		res = Classe004.multiplica005(1, 1); //estático
		System.out.println(res);

		tst002.v1 = 11;
		tst002.v2 = 22;
//		tst002.v3 = 33; //não visível
		tst002.v4 = 44;
//		tst002.v5 = 55; //estático funciona tbm
		Classe004.v5 = 55; //estático

		System.out.println("OLAX");
		Classe001 olax = new Classe001(1);

		Classe001.OlaZ olaz = olax.new OlaZ() ;
		olaz.imprime();

		Classe001 olay = new Classe001() {
			public void metodoX() {
				System.out.println("Teste Classe Anônima pode ser X...");
			}
		};
		olay.metodoX();

		System.out.println("OLAX / OLAY");
//		olax.imprimeObj(olaz);
		olax.imprimeObj(olay);
		tst001.v1 = 255;
		tst001.metodoObj(tst001);
		System.out.println(tst001.soma001(1, 1));

		System.out.println(tst001.somaArgs(10,5,2,1));

		System.out.println("Olá a todos ...");
		olax.imprime(1);
		olax.imprime(0);
	}

}
