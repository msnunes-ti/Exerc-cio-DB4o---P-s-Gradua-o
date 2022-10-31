import com.db4o.ObjectContainer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    @PersistenceContext(unitName="context_hibernate")
    private EntityManager manager;
        private ObjectContainer db = ConnectionFactory.objectContainergetConnection();

    public void save(Aluno aluno) {
        try {
            this.db.store(aluno);
            this.db.commit();
        } catch (Exception e) {
            e.printStackTrace();
            this.db.rollback();
        }
    }
    public void delete(Aluno aluno) {
        try {
            this.db.delete(aluno);
            this.db.commit();
        } catch (Exception e) {
            e.printStackTrace();
            this.db.rollback();
        }
    }   public List<Aluno> listar() {
        List<Aluno> alunos = new ArrayList<Aluno>();
        try {
            alunos = this.db.query(Aluno.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return alunos;
    }
}
