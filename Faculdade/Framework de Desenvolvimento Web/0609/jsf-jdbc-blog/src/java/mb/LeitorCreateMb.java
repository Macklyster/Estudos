package mb;


import br.com.chiquitto.aula.jdbcblog.dao.LeitorDao;
import br.com.chiquitto.aula.jdbcblog.vo.Leitor;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class LeitorCreateMb {
    private Leitor leitor = new Leitor();

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }
    
    public String salvar(){
        LeitorDao dao = new LeitorDao();
        dao.cadastrar(leitor);
        return "/leitor/listar.xhtml";
        
    }
   
}
