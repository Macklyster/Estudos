package mb;

import br.com.chiquitto.aula.jdbcblog.dao.AdminDao;
import br.com.chiquitto.aula.jdbcblog.exception.RowNotFoundException;
import br.com.chiquitto.aula.jdbcblog.vo.Admin;
import br.com.chiquitto.aula.jdbcblog.vo.Pessoa;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class AdminMb {
    private List<Pessoa> admins;

    public List<Pessoa> getAdmins() {
        if(admins == null){
            AdminDao dao = new AdminDao();
            admins = dao.getAll();
        }
        return admins;
    }
    
    public void apagar(Admin admins){
        AdminDao dao = new AdminDao();
        
        dao.apagar(admins);
        
        admins = null;
    }
}
