package projetoPessoas2;

public class ProjetoPessoas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno();
		a1.setNome("Gustavo");
		a1.setCurso("ADS");
		a1.fazerAniversario();
		a1.pagarMensalidade();
		
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Pedro");
		b1.setCurso("ADS");
		b1.setMatricula(90909);
		b1.setBolsa(800);
		b1.fazerAniversario();
		b1.pagarMensalidade();
		
		
	}

}
