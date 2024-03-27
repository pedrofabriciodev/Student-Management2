package projetoPessoas2;

public class Bolsista extends Aluno{
	private float bolsa;
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de: " + getNome());
	}
	
	public void pagarMensalidade() {
		System.out.println("O estudante: " + getNome() + " é bolsista, isento de mensalidade!!!");
	}


	public float getBolsa() {
		return bolsa;
	}


	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
}
