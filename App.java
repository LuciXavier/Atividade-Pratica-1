public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno(23, "Luciana Xavier", 8);
        Aluno aluno2 = new Aluno(15, "Hugo Fraga", 6);
        Aluno aluno3 = new Aluno(13, "Evelyn Ferreira", 9);
        Aluno aluno4 = new Aluno(20, "Giulia Louzada", 10);


        Aluno[] estudantesADS = {aluno,aluno3};
        Turma turma1 = new Turma("ADS", estudantesADS);

        Aluno[] estudantesFI = {aluno4};
        Turma turma2 = new Turma("Fisioterapia", estudantesFI);

        Aluno[] estudantesDG = {aluno2};
        Turma turma3 = new Turma("Design Gráfico", estudantesDG);


        Turma [] turmas = {turma1, turma2, turma3};

        Faculdade unimes = new Faculdade("Universidade Metropolitana de Santos", turmas);

        unimes.exibirAlunosTurma();
    }
}
