package br.com.db1.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.colecoes.Produto;
import br.com.db1.colecoes.ProdutoComparator;

public class ProdutoTest {

	@Test
	public void exercicio9() {
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto(98, "CELULAR", 1000.00));
		produtos.add(new Produto(50, "MONITOR", 200.00));
		produtos.add(new Produto(55, "CANECA", 50.00));

		Assert.assertTrue(produtos.size() == 3);
		Assert.assertTrue(produtos.get(0).getValor() == 1000.00);
		Assert.assertTrue(produtos.get(1).getValor() == 200.00);
		Assert.assertTrue(produtos.get(2).getValor() == 50.00);

		Collections.sort(produtos);
		Assert.assertTrue(produtos.get(0).getValor() == 50.00);
		Assert.assertTrue(produtos.get(1).getValor() == 200.00);
		Assert.assertTrue(produtos.get(2).getValor() == 1000.00);

		Collections.sort(produtos, new ProdutoComparator());
		Assert.assertEquals(produtos.get(0).getDescricao(), "CANECA");
		Assert.assertEquals(produtos.get(1).getDescricao(), "CELULAR");
		Assert.assertEquals(produtos.get(2).getDescricao(), "MONITOR");

	}

}
