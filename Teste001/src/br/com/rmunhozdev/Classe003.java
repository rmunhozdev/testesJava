package br.com.rmunhozdev;

//import br.com.rmunhozdev.teste001.Classe001;
//import br.com.rmunhozdev.teste001.OlaA;
//import br.com.rmunhozdev.teste001.OlaB;

public class Classe003 extends Classe004 {
	public int v1 = 0;
	protected int v2 = 0;
	private int v3 = 1000;
	int v4 = 0;
	static int v5 = 0;
	protected int res1 = soma001(2, 2);
	protected int res2 = soma002(3, 2);
	protected int res3 = soma003(4, 2);
	protected int res4 = soma004(5, 2);
	protected int res5 = soma005(6, 2);
//Não funciona com métodos não estáticos
//	static int res6 = multiplica001(2, 2);
//	static int res7 = multiplica002(3, 2);
//	static int res8 = multiplica003(4, 2);
//	static int res9 = multiplica004(5, 2);
	static int res0 = multiplica005(6, 2); //estático

	public int soma001(int x, int y) {
		int res = x + y;
		res = res + v1;
		res = res + v2;
		res = res + v3;
		res = res + v4;
		res = res + v5;
		return res;
	}

	protected int soma002(int x, int y) {
		int res = x + y;
		res = res + v1;
		res = res + v2;
		res = res + v3;
		res = res + v4;
		res = res + v5;
		return res;
	}

	int soma003(int x, int y) {
		int res = x + y;
		res = res + v1;
		res = res + v2;
		res = res + v3;
		res = res + v4;
		res = res + v5;
		return res;
	}

	private int soma004(int x, int y) {
		int res = x + y;
		res = res + v1;
		res = res + v2;
		res = res + v3;
		res = res + v4;
		res = res + v5;
		return res;
	}

	static int soma005(int x, int y) {
		int res = x + y;
//não funciona referenciar com campos não estáticos
//		res = res + v1;
//		res = res + v2;
//		res = res + v3;
//		res = res + v4;
		res = res + v5;
		return res;
	}

	public void metodoObj(Classe003 classex01) {
		System.out.println(this.v1);
		System.out.println(classex01.v1);
		System.out.println(classex01.soma001(0, 0));
	}

	public int somaArgs(int... x) {
		int res = 0;
		for (int n : x) {
			res += n;
		}
		return res;
	}
}
