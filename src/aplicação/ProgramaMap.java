package aplicação;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class ProgramaMap {

	public static void main(String[] args) {

		String caminho = "C:\\Users\\aliss\\Dropbox\\Programação\\exercicio seção19.txt";

		try (BufferedReader buffer = new BufferedReader(new FileReader(caminho))) {

			Map<String, Integer> listaMap = new LinkedHashMap<>();

			String linha = buffer.readLine();
			System.out.println("LISTA COMPLETA:");
			while (linha != null) {

				System.out.println(linha);
				String[] campo = linha.split(",");
				String nome = campo[0];
				int cont = Integer.parseInt(campo[1]);

				if (listaMap.containsKey(nome)) {
					int votos = listaMap.get(nome);
					listaMap.put(nome, cont + votos);
				} else {
					listaMap.put(nome, cont);
				}

				linha = buffer.readLine();
			}

			System.out.println();
			System.out.println("TOTAL:");
			for (String key : listaMap.keySet()) {
				System.out.println(key + ": " + listaMap.get(key));
			}

		} catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}

}
