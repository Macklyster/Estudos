/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mb;

import br.com.chiquitto.aula.jdbcblog.dao.CategoriaDao;
import br.com.chiquitto.aula.jdbcblog.exception.RowNotFoundException;
import br.com.chiquitto.aula.jdbcblog.vo.Categoria;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class CategoriaUpdate {
    private Categoria categorias = new Categoria();
    
    public Categoria getCategoria(){
        return categorias;
    }
    
    public void loadCategoria(){
        CategoriaDao dao = new CategoriaDao();
        try{
            categorias = (Categoria) dao.getOne(categorias.getIdcategoria());
        } catch(RowNotFoundException e){
            FacesMessage f = new FacesMessage("Categoria Inexistente");
            f.setSeverity(FacesMessage.SEVERITY_ERROR);
            
            FacesContext.getCurrentInstance().addMessage(null, f);
        }
    }
    
    public String salvar(){
        CategoriaDao dao = new CategoriaDao();
        dao.editar(categorias);
        
        return "/categorias/listar.xhtml";
    }
}
