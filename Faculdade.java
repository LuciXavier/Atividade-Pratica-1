public class Faculdade {
    public String nome;
    public Turma[] turmas;

    public Faculdade(String nome, Turma[] turmas){
        this.nome = nome;
        this.turmas = turmas;
    }

    public void exibirAlunosTurma(){
        for (Turma turma:turmas){
            turma.exibirAlunos();
        }
    }
}
