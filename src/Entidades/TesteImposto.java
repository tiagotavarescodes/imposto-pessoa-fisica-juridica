package Entidades;

public class TesteImposto {
	public static void main(String[] args) {
		Pessoa fisica = new Fisica("tiago", 10000, 0);
		Pessoa juridica = new Juridica("joao", 5000, 20);
		
		System.out.println(fisica.imposto());
		System.out.println(juridica.imposto());
	}
}
