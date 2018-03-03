package br.com.caelum.contas.modelo;

public class ContaInvestimento extends Conta{
	
	public String getTipo(){
		return "Conta Investimento";
	}
	
	@Override
	public void sacar(double valor){
		//implementação aqui.
	}
}
