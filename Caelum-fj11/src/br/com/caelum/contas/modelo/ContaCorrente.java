package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exceptions.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		}else{
			throw new SaldoInsuficienteException(valor);
		}
	}

	public double getValorImposto() {
		return this.getSaldo() * 0.01;

	}
}
