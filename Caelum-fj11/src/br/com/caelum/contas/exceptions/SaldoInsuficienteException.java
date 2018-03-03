package br.com.caelum.contas.exceptions;

import java.io.IOException;

public class SaldoInsuficienteException extends IOException {
	public SaldoInsuficienteException(double valor){
		super("Saldo insuficiente para sacar o valor de: "+valor);
	}
}
