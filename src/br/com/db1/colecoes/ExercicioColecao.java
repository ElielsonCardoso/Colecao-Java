package br.com.db1.colecoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExercicioColecao {

	public Set<String> getVogais(String Palavra) {

		Set<String> listaVogais = new HashSet<>();
		Palavra.toLowerCase();
		for (Integer x = 0; x < Palavra.length(); x++) {
			switch (Palavra.charAt(x)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				listaVogais.add(String.valueOf(Palavra.charAt(x)));
			}
		}
		return listaVogais;
	}

	public Set<String> getConsoantesList(String Palavra) {

		Set<String> listaConsoantes = new HashSet<>();
		Palavra.toLowerCase();
		for (Integer x = 0; x < Palavra.length(); x++) {
			switch (Palavra.charAt(x)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				break;
			default:
				listaConsoantes.add(String.valueOf(Palavra.charAt(x)));
				break;
			}
		}
		return listaConsoantes;
	}

	public Integer removerTerceiraPosicao(List<Integer> valor) {
		Integer numeroRemovido = valor.get(2);
		valor.remove(2);
		return numeroRemovido;
	}

	public String removerTerceiraPosicao2(List<String> string) {
		String nomeRemovido = string.get(2);
		string.remove(2);
		return nomeRemovido;
	}

	public List<Integer> posicoesMultiplasDe3(List<Integer> valor) {
		List<Integer> posicoes = new ArrayList<>();
		for (Integer x = 0; x < valor.size(); x++) {
			if (x % 3 == 0 && x != 0)
				posicoes.add(x);
		}
		return posicoes;
	}

	public List<Integer> valoresMultiplosDe2(List<Integer> valor) {
		List<Integer> multiplosDe2 = new ArrayList<>();
		for (Integer x = 0; x < valor.size(); x++) {
			if (valor.get(x) % 2 == 0)
				multiplosDe2.add(valor.get(x));
		}
		return multiplosDe2;
	}

	public List<String> copiaTextos(List<String> string) {
		return new ArrayList<>(string);
	}
	
	public Boolean comparaList(List<Integer> valor,List<Integer> valor2) {
		if(valor.size()!=valor2.size()){
            return Boolean.FALSE;
		}
		return valor.containsAll(valor2);
	}
	
	public Boolean comparaListString(List<String> string,List<String> string2) {
		if(string.size()!=string2.size()){
	            return Boolean.FALSE;
	    }
		return string.containsAll(string2);
	}

	public Boolean comparaSet(Set<Integer> lista1, Set<Integer> lista2){
        if(lista1.size()!=lista2.size()){
            return Boolean.FALSE;
        }
        return lista1.equals(lista2);
	}
	
	public Boolean comparaSetString(Set<String> lista1, Set<String> lista2){
	        if(lista1.size()!=lista2.size()){
	            return Boolean.FALSE;
	        }
	        return lista1.equals(lista2);
	}
	
}
