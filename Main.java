package salvaAlunos;

public class Main {

	public static void main(String[] args) {
		
		Plano p = new Plano(5, 5);
		
		Andador an = new Andador(1, " andador", 2, 2, p);
		Aluno al = new Aluno(2, " aluno", 1, 1, p);
		Bug bu = new Bug(3, " tony", 3, 3, p);
		
		p.verificarSeTemRobo();
		//r.moverEsquerda();
			
	}
}