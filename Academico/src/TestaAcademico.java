public class TestaAcademico {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(1, "Ana Silva", "111222", "Engenharia de Software");
        Aluno a2 = new Aluno(2, "Carlos Mendes", "333444", "Ciência da Computação");
 
        Disciplina disciplina = new Disciplina(100, "Programação Orientada a Objetos", "Professor Felipe");
 
        disciplina.matricularAluno(a1);
        disciplina.matricularAluno(a2);
 
        disciplina.criarAvaliacao(1, "Prova Semestral");
 
        Avaliacao provaSemestral = disciplina.getAvaliacoes().get(0);
        provaSemestral.adicionarQuestao(1, "O que é Herança em POO?", 3.0f);
        provaSemestral.adicionarQuestao(2, "Explique o conceito de Polimorfismo.", 3.5f);
        provaSemestral.adicionarQuestao(3, "Qual a diferença entre Agregação e Composição?", 3.5f);
 
        System.out.println(disciplina.toString());
    }
}