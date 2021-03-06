package mb;

import br.com.chiquitto.aula.jdbcescola.dao.UsuarioDao;
import br.com.chiquitto.aula.jdbcescola.exception.RowNotFoundException;
import br.com.chiquitto.aula.jdbcescola.vo.Usuario;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class LoginMb {
    private String email;
    private String senha;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String login(){
        UsuarioDao dao = new UsuarioDao();
        
        Usuario usuario = new Usuario();
        usuario.setEmail(email);
        usuario.setSenha(senha);
        
        try {
            usuario = dao.getByEmailSenha(usuario);
            
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", usuario);
            
            return "/index.xhtml?faces-redirect=true";
        } catch (RowNotFoundException ex) {
            FacesMessage msg = new FacesMessage("Email e/ou Senha Incorretos!");
            FacesContext.getCurrentInstance().addMessage(null, msg);
            return "";
        }
    }
    
}
