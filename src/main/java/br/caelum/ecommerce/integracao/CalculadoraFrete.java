package br.caelum.ecommerce.integracao;

import org.javamoney.moneta.Money;

import br.caelum.ecommerce.dominio.Pedido;

public class CalculadoraFrete {

	/**
	 * Retorna sempre 1% do valor do pedido
	 * 
	 * @param pedido
	 * @return
	 */
	public Money calcularComBaseEm(Pedido pedido) {
		return pedido.lerValorTotal().divide(100);
	}

}
