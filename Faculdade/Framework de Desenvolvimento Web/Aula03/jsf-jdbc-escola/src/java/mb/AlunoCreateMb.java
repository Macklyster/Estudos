package mb;

import br.com.chiquitto.aula.jdbcescola.dao.AlunoDao;
import br.com.chiquitto.aula.jdbcescola.vo.Aluno;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author alex
 */
@ManagedBean
public class AlunoCreateMb {
    private Aluno aluno = new Aluno();

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno Aluno) {
        this.aluno = Aluno;
    }
    
    public String salvar() {
        AlunoDao dao = new AlunoDao();
        dao.cadastrar(aluno);
        
        return "/aluno/listar.xhtml";
    }
}
