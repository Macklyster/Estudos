package mb;

import br.com.chiquitto.aula.jdbcescola.dao.ProfessorDao;
import br.com.chiquitto.aula.jdbcescola.vo.Professor;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author alex
 */
@ManagedBean
public class ProfessorCreateMb {
    private Professor professor = new Professor();

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public String salvar() {
        ProfessorDao dao = new ProfessorDao();
        dao.cadastrar(professor);
        
        return "/professor/listar.xhtml";
    }
}
