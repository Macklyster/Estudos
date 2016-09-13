package mb;

import br.com.chiquitto.aula.jdbcblog.dao.CategoriaDao;
import br.com.chiquitto.aula.jdbcblog.vo.Categoria;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class CategoriaMb {
    private List<Categoria> categorias;

    public List<Categoria> getCategorias() {
        if(categorias == null){
            CategoriaDao dao = new CategoriaDao();
            categorias = dao.getAll();
        }
        return categorias;
    }
    
    public void apagar(Categoria categorias){
        CategoriaDao dao = new CategoriaDao();
        
        dao.apagar(categorias);
        
        categorias = null;
    }
}
