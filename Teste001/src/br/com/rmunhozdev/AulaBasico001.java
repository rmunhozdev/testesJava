package br.com.rmunhozdev;

public class AulaBasico001 {

	public static void main(String[] args) {
		int nContador = 0;
		//int double float char byte short long boolean
		int idade = (int) 10000000000L; //corte de bits
		double x1 = 10.0;
		double x11 = (x1 += 1.0);
		double x111 = x1++;
		double x1111 = ++x111;
		float x2 = 10.0F;
		char x3 = 'A';
		char x33 = 87;
		char x333 = '\u0057';
		byte x4 = 127; //128;
		short x5 = 32000;
		long x6 = 10;
		boolean x7 = (20 > 15 && 20 < 30);
		boolean lret = false;
		String x8 = "Ricardão";
		boolean x88 = x8.contains("Ricardao");
		var x9 = "Ricardão X"; //a partir do Java 10
		char[] x10 = new char[8];
//		int[] nums1 = {10,15,20}; 
		int[] nums2 = new int[]{10,15,20};
		char[][] chs1 = {{'A','B'},{'D','E','F'}};
//		char[][] chs2 = new char[2][3];
//		char[][] chs3 = new char[][]{{'A','B','C'},{'D','E','F'}};
		//['R','I','C','A','R','D','O']
//		int[] chs41 = {31,32};
//		int[] chs42 = {61,62};
//		int[][] chs43 = {{1,2,chs41[]},{4,5,chs42[]}};
		x10[0] = 'R';
		x10[1] = 'I';
		x10[2] = 'C';
		x10[3] = 'Ã';
		x10[4] = 'R';
		x10[5] = 'D';
		x10[6] = 'O';
		x10[7] = '\0';
		int[] x12 = new int[2];
		x12[0] = 60;
		x12[1] = (int) 13.56;
		System.out.println("Idade é: " + idade);
		System.out.println(x1);
		System.out.println(x11);
		System.out.println(x111);
		System.out.println(x1111);
		System.out.println(x1++);
		System.out.println(++x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x33);
		System.out.println(x333);
		System.out.println(x4);
		System.out.println(x5);
		System.out.println(x6);
		System.out.println(x7);
		System.out.println(x8);
		System.out.println(x88);
		System.out.println(x9);
		if (idade > 4000000000L) {
			System.out.println("Sim");
		} else if (idade == 0) {
			System.out.println("Clato que Não");
		} else {
			System.out.println("Não");
			lret = true;
		}
		System.out.println(lret == true ? lret : "Nada feito");
		switch (x8.length()) {
		case 5:
			System.out.println("Tamanho é igual a 5");
			break;
		case 10:
			System.out.println("Tamanho é igual a 10");
			break;
		default:
			System.out.println("Nenhuma das alternativas");
		}
		while (x1 < 16) {
			System.out.println("X1 é: " + x1++);
		}
		do {
			System.out.println("X1 é: " + x1++);
		} while (x1 < 20);
		do {
			System.out.println("X1 é: " + ++x1);
		} while (x1 < 23);
		for (int nx = 1; nx <= 10; nx++) {
			if (nx % 2 == 0) {
				System.out.println(nx);
			} else if (nx == 9) {
				break;
			} else if (nx != 7) {
				System.out.println("nx diferente de 7: " + nx);
				continue;
			}
		}
		System.out.println("***");
		for (int x : x10) {
			System.out.print((char) x);
		}
		System.out.print("\n");
		while (x10[nContador] != '\0') {
			System.out.print(x10[nContador]);
			nContador++;
		}
		System.out.print('\n');
		for (int nx = 0; nx < x10.length; nx++) {
			if (x10[nx] != '\0') {
				System.out.print(x10[nx]);
			} else {
				System.out.println("");
			}
		}
		for (int nx = 0; nx < x12.length; nx++) {
			System.out.println(x12[nx]);
		}
		for (int num : nums2) {
			System.out.println(num);
		}
		System.out.println("**A*");
		for (int x = 0; x < chs1.length; x++) {
			for (int z = 0; z < chs1[x].length; z++) {
				System.out.print((char) chs1[x][z]);
			}
		}
		System.out.print("\n");
		System.out.println("**B*");
		for (char[] x : chs1) {
			for (int z : x) {
				System.out.print((char) z);
			}
		}
		System.out.print("\n");
		System.out.println("*** FIM ***");
	}
}
