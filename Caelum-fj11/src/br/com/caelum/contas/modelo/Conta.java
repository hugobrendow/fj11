package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exceptions.SaldoInsuficienteException;

public abstract class Conta {

	protected double saldo;
	private String titular;
	private int numero;
	private String agencia;
	
	public abstract String getTipo();

	public double getSaldo() {
		return this.saldo;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		}else{
			throw new SaldoInsuficienteException(valor);
		}
	}

	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}else{
			throw new IllegalStateException();
		}
	}

	public void transfere(double valor, Conta destino) throws Exception {
		this.sacar(valor);
		destino.deposita(valor);
	}

	public void imprimeDados() {
		System.out.println("Nome: " + this.titular);
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Numero: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
	}

	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 0;
	}
}
