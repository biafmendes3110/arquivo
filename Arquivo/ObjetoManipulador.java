package Arquivo;

import java.io.IOException;
public class ObjetoManipulador {

	public static void main(String args[]) throws IOException {
		String path = "c:\\tmp\\file.doc";


		ManipuladorArquivo.escritor(path);
		ManipuladorArquivo.leitor(path);
	}

}


