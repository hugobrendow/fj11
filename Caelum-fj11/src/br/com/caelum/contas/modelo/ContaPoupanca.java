package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exceptions.SaldoInsuficienteException;

public class ContaPoupanca extends Conta {
	
	@Override
	public String getTipo() {
		return "Conta Poupanca";
	}
	
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException{
		if (valor <= this.saldo) {
			this.saldo -= valor;
		}else{
			throw new SaldoInsuficienteException(valor);
		}
	}
}
