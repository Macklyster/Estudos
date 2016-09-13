package mb;

import br.com.chiquitto.aula.jdbcblog.dao.PostDao;
import br.com.chiquitto.aula.jdbcblog.exception.RowNotFoundException;
import br.com.chiquitto.aula.jdbcblog.vo.Post;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class PostUpdateMb {
    private Post post = new Post();
    
    public Post getPost(){
        return post;
    }
    
    public void loadPost(){
        PostDao dao = new PostDao();
        try{
            post = (Post) dao.getOne(post.getIdpost());
        } catch(RowNotFoundException e){
            FacesMessage f = new FacesMessage("Post Inexistente");
            f.setSeverity(FacesMessage.SEVERITY_ERROR);
            
            FacesContext.getCurrentInstance().addMessage(null, f);
        }
    }
    
    public String salvar(){
        PostDao dao = new PostDao();
        dao.editar(post);
        
        return "/post/listar.xhtml";
    }
}
