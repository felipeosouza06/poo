import java.util.ArrayList;
 
public class Avaliacao {
    private int id;
    private String nome;
    private ArrayList<Questao> questoes;
 
    public Avaliacao() {
        this.questoes = new ArrayList<>();
    }
 
    // Construtor que recebe id e nome, pois questões nascem aqui dentro
    public Avaliacao(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.questoes = new ArrayList<>();
    }
 
    // composição - a questão depende da avaliação para ser criada
    public void adicionarQuestao(int num, String texto, float peso) {
        Questao q = new Questao(num, texto, peso);
        this.questoes.add(q);
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public ArrayList<Questao> getQuestoes() {
        return questoes;
    }
 
    public void setQuestoes(ArrayList<Questao> questoes) {
        this.questoes = questoes;
    }
 
    @Override
    public String toString() {
        return "\n   Avaliação ID: " + id + " | Nome: " + nome +
               "\n   --- Questões ---" + questoes;
    }
}
 
 