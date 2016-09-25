package mb;

import br.com.chiquitto.aula.jdbcescola.dao.UsuarioDao;
import br.com.chiquitto.aula.jdbcescola.exception.RowNotFoundException;
import br.com.chiquitto.aula.jdbcescola.vo.Usuario;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;

/**
 *
 * @author alex
 */
@ManagedBean
public class UsuarioFotoMb {

    private Usuario usuario = new Usuario();
    private String fotoUrl;
    private Part foto;

    public Usuario getUsuario() {
        return usuario;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public Part getFoto() {
        return foto;
    }

    public void setFoto(Part foto) {
        this.foto = foto;
    }

    public void loadData() {
        UsuarioDao dao = new UsuarioDao();
        try {
            usuario = dao.getOne(usuario.getIdpessoa());
        } catch (RowNotFoundException ex) {

        }

        fotoUrl = "/upload/usuario" + usuario.getIdpessoa() + ".jpg";
    }

    public void salvar() {
        String upload = FacesContext.getCurrentInstance().getExternalContext().getInitParameter("UPLOAD_DIR");
        String nome = "usuario" + usuario.getIdpessoa() + ".jpg";

        File file = new File(upload, nome);

        if (file.isFile()) {
            file.delete();
        }
        
        try {
            InputStream input = foto.getInputStream();
            Files.copy(input, file.toPath());
        } catch (IOException ex) {
            
        }
    }
}
