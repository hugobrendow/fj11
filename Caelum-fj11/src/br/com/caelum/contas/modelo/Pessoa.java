package br.com.caelum.contas.modelo;
public class Pessoa {
	private String nome;
	private String cpf;

//	private boolean validaCpf(String cpf) {
//		if (!(cpf.equals("00000000000") || cpf.equals("11111111111")
//				|| cpf.equals("22222222222") || cpf.equals("33333333333")
//				|| cpf.equals("44444444444") || cpf.equals("55555555555")
//				|| cpf.equals("66666666666") || cpf.equals("77777777777")
//				|| cpf.equals("88888888888") || cpf.equals("99999999999")
//				|| (cpf.length() != 11))) {
//			return true;
//		} else {
//			return false;
//		}
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
