public class ExecutarMain {

    public static void main(String[] args) {

        AlunoDAO alunoDAO = new AlunoDAO();

        Aluno aluno = new Aluno();
        aluno.setNome("Marcelo da Silva Nunes");
        aluno.setResponsavel("Marcelo");
        aluno.setEmail("msnunes.ti@gmail.com");
        aluno.setTelefone("(48)98419.7756");

        alunoDAO.save(aluno);
    }
}
