package br.com.rmunhoz;

//JIGSAW JPMS
//configurar botão direito no Teste002, java build path, project, add module
import br.com.rmunhozdev.teste001.Classe001;
//import br.com.rmunhozdev.teste002.Classe002;

public class Teste002 {

	public static void main(String[] args) {
			Classe001 x2 = new Classe001();
			x2.imprime(2);
//			Classe002 x3 = new Classe002();
//			x3.imprime(1);
	}

}
