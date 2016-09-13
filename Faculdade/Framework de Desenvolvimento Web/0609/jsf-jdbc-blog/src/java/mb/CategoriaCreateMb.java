/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mb;

import br.com.chiquitto.aula.jdbcblog.dao.CategoriaDao;
import br.com.chiquitto.aula.jdbcblog.vo.Categoria;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class CategoriaCreateMb {
    private Categoria categoria = new Categoria();

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public String salvar(){
        CategoriaDao dao = new CategoriaDao();
        dao.cadastrar(categoria);
        
        return "/categoria/listar.xhtml";
    }
}
