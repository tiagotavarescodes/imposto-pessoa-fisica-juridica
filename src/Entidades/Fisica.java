package Entidades;

public class Fisica extends Pessoa {

	private double GastoComSaude;

	public Fisica(String nome, double rendaAnual, double gastoComSaude) {
		super(nome, rendaAnual);
		GastoComSaude = gastoComSaude;
	}

	public double getGastoComSaude() {
		return GastoComSaude;
	}

	public void setGastoComSaude(double gastoComSaude) {
		GastoComSaude = gastoComSaude;
	}

	@Override
	public double imposto() {
		double impostoFisico;
		if(getRendaAnual() < 20000.0) {
			impostoFisico = (getRendaAnual() * 0.15) - (GastoComSaude * 0.5);
		} else {
			impostoFisico = (getRendaAnual() * 0.25) - (GastoComSaude * 0.5);
		}
		return impostoFisico;
	}

}
