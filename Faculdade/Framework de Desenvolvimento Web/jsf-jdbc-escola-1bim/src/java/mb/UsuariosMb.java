package mb;

import br.com.chiquitto.aula.jdbcescola.dao.UsuarioDao;
import br.com.chiquitto.aula.jdbcescola.vo.Usuario;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class UsuariosMb {
    private List<Usuario> usuarios;

    public List<Usuario> getUsuarios() {
        if (usuarios == null) {
            UsuarioDao dao = new UsuarioDao();
            usuarios = dao.getAll();
        }
        return usuarios;
    }
    
    public void apagar(Usuario usuario) {
        UsuarioDao dao = new UsuarioDao();
        dao.apagar(usuario);
        usuarios = null;
        
        FacesMessage msg = new FacesMessage("Registro apagado");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
}
