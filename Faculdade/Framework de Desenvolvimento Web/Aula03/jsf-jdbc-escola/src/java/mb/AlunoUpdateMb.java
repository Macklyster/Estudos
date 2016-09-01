package mb;

import br.com.chiquitto.aula.jdbcescola.dao.AlunoDao;
import br.com.chiquitto.aula.jdbcescola.exception.RowNotFoundException;
import br.com.chiquitto.aula.jdbcescola.vo.Aluno;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class AlunoUpdateMb {
    private Aluno aluno = new Aluno();
    
    public Aluno getUsuario(){
        return aluno;
    }
    
    public void loadAluno(){
        AlunoDao dao = new AlunoDao();
        try{
            aluno = dao.getOne(aluno.getIdpessoa());
        } catch(RowNotFoundException e){
            FacesMessage f = new FacesMessage("Aluno Inexistente");
            f.setSeverity(FacesMessage.SEVERITY_ERROR);
            
            FacesContext.getCurrentInstance().addMessage(null, f);
        }
    }
    
    public String salvar(){
        AlunoDao dao = new AlunoDao();
        dao.editar(aluno);
        
        return "/aluno/listar.xhtml";
    }
}
