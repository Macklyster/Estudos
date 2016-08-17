package mb;

import br.com.chiquitto.aula.jdbcescola.dao.UsuarioDao;
import br.com.chiquitto.aula.jdbcescola.vo.Usuario;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author alex
 */

@ManagedBean
public class UsuariosMb {
    private List<Usuario> usuarios;

    public List<Usuario> getUsuarios() {
        if(usuarios == null){
            UsuarioDao dao = new UsuarioDao();
            usuarios = dao.getAll();
        }
        return usuarios;
    }
    
    public void apagar(Usuario usuario){
        UsuarioDao dao = new UsuarioDao();
        
        dao.apagar(usuario);
        
        usuario = null;
    }
   
}
