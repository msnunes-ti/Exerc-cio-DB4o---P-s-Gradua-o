import javax.persistence.Entity;

@Entity
public class Aluno extends Pessoa{

    private String responsavel;


    public String getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
}
