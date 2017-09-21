package br.com.db1.colecoes.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.colecoes.ExercicioColecao;

public class ExercicioColecaoTest {

	private ExercicioColecao exercicioColecao = new ExercicioColecao();

	private List<Integer> numeros = new ArrayList<>();
	private List<String> nomes = new ArrayList<>();

	@Before
	public void getListNumeros() {
		for (Integer x = 1; x <= 10; x++) {
			numeros.add(new Integer(x));
		}
	}
	
	@Before
	public void getListNomes() {
		nomes.add("Elielson");
		nomes.add("Mayza");
		nomes.add("Fusca");
		nomes.add("Joao");
		nomes.add("Ast");
		nomes.add("Patrik");
		nomes.add("Mateus");
		nomes.add("Matheus");
		nomes.add("Jessica");
		nomes.add("Eloisa");
	}

	@Test
	public void getVogaisList() {
		Set<String> vogais = exercicioColecao.getVogais("Fusca");
		Assert.assertTrue(vogais.size() == 2);
		Assert.assertFalse(vogais.contains("F"));
		Assert.assertTrue(vogais.contains("u"));
		Assert.assertFalse(vogais.contains("s"));
		Assert.assertFalse(vogais.contains("c"));
		Assert.assertTrue(vogais.contains("a"));
	}

	@Test
	public void getConsoantesList() {
		Set<String> consoantes = exercicioColecao.getConsoantesList("Fusca");
		Assert.assertTrue(consoantes.size() == 3);
		Assert.assertTrue(consoantes.contains("F"));
		Assert.assertFalse(consoantes.contains("u"));
		Assert.assertTrue(consoantes.contains("s"));
		Assert.assertTrue(consoantes.contains("c"));
		Assert.assertFalse(consoantes.contains("a"));
	}

	@Test
	public void removerTerceiraPosicao() {
		Assert.assertFalse(exercicioColecao.removerTerceiraPosicao(numeros) == numeros.get(2));
		Assert.assertTrue(exercicioColecao.removerTerceiraPosicao(numeros) != numeros.get(2));
	}

	@Test
	public void removerTerceiraPosicao2() {
		Assert.assertFalse(exercicioColecao.removerTerceiraPosicao2(nomes) == nomes.get(2));
		Assert.assertTrue(exercicioColecao.removerTerceiraPosicao2(nomes) != nomes.get(2));
	}

	@Test
	public void posicoesMultiplasDe3() {
		Assert.assertTrue(exercicioColecao.posicoesMultiplasDe3(numeros).get(0) == 3);
		Assert.assertTrue(exercicioColecao.posicoesMultiplasDe3(numeros).get(1) == 6);
		Assert.assertTrue(exercicioColecao.posicoesMultiplasDe3(numeros).get(2) == 9);
	}

	@Test
	public void valoresMultiplosDe2() {
		Assert.assertTrue(exercicioColecao.valoresMultiplosDe2(numeros).get(0) == 2);
		Assert.assertTrue(exercicioColecao.valoresMultiplosDe2(numeros).get(1) == 4);
		Assert.assertTrue(exercicioColecao.valoresMultiplosDe2(numeros).get(2) == 6);
	}

	@Test
	public void copiaTextos() {
		Assert.assertFalse(exercicioColecao.copiaTextos(nomes) == nomes);
	}

	@Test
	public void comparaList() {
		List<Integer> num2 = new ArrayList<>();
		num2.addAll(numeros);
		Assert.assertTrue(exercicioColecao.comparaList(numeros, num2)==Boolean.TRUE);
		num2.add(50);
		Assert.assertFalse(exercicioColecao.comparaList(numeros, num2)==Boolean.TRUE);
	}
	
	@Test
	public void comparaListString() {
		List<String> nomes2 = new ArrayList<>();
		nomes2.addAll(nomes);
		Assert.assertTrue(exercicioColecao.comparaListString(nomes,nomes2)==Boolean.TRUE);
		nomes2.add("fusca2");
		Assert.assertFalse(exercicioColecao.comparaListString(nomes,nomes2)==Boolean.TRUE);
	}

	@Test
	public void comparaSet(){
		Set<Integer> numerosSet = new HashSet<>();
		numerosSet.addAll(numeros);
		Set<Integer> numerosSet2 = new HashSet<>();
		numerosSet2.addAll(numeros);
        Assert.assertTrue(exercicioColecao.comparaSet(numerosSet, numerosSet2)==Boolean.TRUE);
        numerosSet2.add(50);
        Assert.assertTrue(exercicioColecao.comparaSet(numerosSet, numerosSet2)==Boolean.FALSE);
	}
	
	@Test
	public void comparaSetString(){
		Set<String> nomesSet = new HashSet<>();
		nomesSet.addAll(nomes);
		Set<String> nomesSet2 = new HashSet<>();
		nomesSet2.addAll(nomes);
        Assert.assertTrue(exercicioColecao.comparaSetString(nomesSet, nomesSet2)==Boolean.TRUE);
		nomesSet2.add("fusca2");
        Assert.assertTrue(exercicioColecao.comparaSetString(nomesSet, nomesSet2)==Boolean.FALSE);
	}
	
	
	
}
