package br.com.rmunhozdev;

public class Classe004 {
	public int v1 = 1;
	protected int v2 = 1;
	private int v3 = 10000;
	int v4 = 1;
	static int v5 = 1;
	int res1 = multiplica001(2, 2);
	int res2 = multiplica002(3, 2);
	int res3 = multiplica003(4, 2);
	int res4 = multiplica004(5, 2);
	int res5 = multiplica005(6, 2);
//Só funciona com métodos estáticos
//	int res6 = Classe003.soma001(6, 2);
//	int res7 = Classe003.soma002(6, 2);
//	int res8 = Classe003.soma003(6, 2);
//	int res9 = Classe003.soma004(6, 2);
	protected int res0 = Classe003.soma005(6, 2); //estático

	public int multiplica001(int x, int y) {
		int res = x * y;
		res = res * v1;
		res = res * v2;
		res = res * v3;
		res = res * v4;
		res = res * v5;
		return res;
	}

	protected int multiplica002(int x, int y) {
		int res = x * y;
		res = res * v1;
		res = res * v2;
		res = res * v3;
		res = res * v4;
		res = res * v5;
		return res;
	}

	int multiplica003(int x, int y) {
		int res = x * y;
		res = res * v1;
		res = res * v2;
		res = res * v3;
		res = res * v4;
		res = res * v5;
		return res;
	}

	private int multiplica004(int x, int y) {
		int res = x * y;
		res = res * v1;
		res = res * v2;
		res = res * v3;
		res = res * v4;
		res = res * v5;
		return res;
	}

	static int multiplica005(int x, int y) {
		int res = x * y;
//não funciona referenciar com campos não estáticos
//		res = res * v1;
//		res = res * v2;
//		res = res * v3;
//		res = res * v4;
		res = res * v5;
		return res;
	}
}
