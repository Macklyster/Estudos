package mb;

import br.com.chiquitto.aula.jdbcblog.dao.PostDao;
import br.com.chiquitto.aula.jdbcblog.vo.Post;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class PostMb {
    private List<Post> posts;

    public List<Post> getPosts() {
        if(posts == null){
            PostDao dao = new PostDao();
            posts = dao.getAll();
        }
        return posts;
    }
    
    public void apagar(Post posts){
        PostDao dao = new PostDao();
        
        dao.apagar(posts);
        
        posts = null;
    }
}
