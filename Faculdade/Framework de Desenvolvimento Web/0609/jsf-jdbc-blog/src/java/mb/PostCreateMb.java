package mb;

import br.com.chiquitto.aula.jdbcblog.dao.PostDao;
import br.com.chiquitto.aula.jdbcblog.vo.Post;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class PostCreateMb {
    private Post post = new Post();

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
    
    public String salvar(){
        PostDao dao = new PostDao();
        dao.cadastrar(post);
        
        return "/post/listar.xhtml";
    }
}
