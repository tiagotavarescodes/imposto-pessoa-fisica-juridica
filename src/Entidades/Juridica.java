package Entidades;

public class Juridica extends Pessoa {

	private int numeroDeFuncionarios;

	public Juridica(String nome, double rendaAnual, int numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public double imposto() {
		double impostoJuridico;
		if (numeroDeFuncionarios > 10) {
			impostoJuridico = getRendaAnual() * 0.14;
		} else {
			impostoJuridico = getRendaAnual() * 0.16;
		}
		return impostoJuridico;
	}

}
