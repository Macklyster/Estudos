package mb;

import br.com.chiquitto.aula.jdbcescola.dao.UsuarioDao;
import br.com.chiquitto.aula.jdbcescola.vo.Usuario;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;

@ManagedBean
public class UsuarioCreateMb {

    private Usuario usuario = new Usuario();
    private Part foto;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String salvar() {
        UsuarioDao dao = new UsuarioDao();
        dao.cadastrar(usuario);
        
        String upload = FacesContext
                .getCurrentInstance()
                .getExternalContext()
                .getInitParameter("UPLOAD_DIR");
        File file = new File(upload, "usuario" + usuario.getIdpessoa() + ".jpg");
        //System.out.println(file.getAbsoluteFile());

        try {
            InputStream input = foto.getInputStream();
            Files.copy(input, file.toPath());
        } catch (IOException e) {
            // Show faces message?
        }

        return "/usuario/listar.xhtml";
    }

    public Part getFoto() {
        return foto;
    }

    public void setFoto(Part foto) {
        this.foto = foto;
    }
}
