package mb;

import br.com.chiquitto.aula.jdbcblog.dao.AdminDao;
import br.com.chiquitto.aula.jdbcblog.vo.Admin;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class AdminCreateMb {
    private Admin admin = new Admin();

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    
    public String salvar(){
        AdminDao dao = new AdminDao();
        dao.cadastrar(admin);
        
        return "/admin/listar.xhtml";
    }
}
