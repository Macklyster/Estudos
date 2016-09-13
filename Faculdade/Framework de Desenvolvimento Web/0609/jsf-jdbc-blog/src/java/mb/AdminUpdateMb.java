/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mb;

import br.com.chiquitto.aula.jdbcblog.dao.AdminDao;
import br.com.chiquitto.aula.jdbcblog.exception.RowNotFoundException;
import br.com.chiquitto.aula.jdbcblog.vo.Admin;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class AdminUpdateMb {
    private Admin admins = new Admin();
    
    public Admin getAdmin(){
        return admins;
    }
    
    public void loadAdmin(){
        AdminDao dao = new AdminDao();
        try{
            admins = (Admin) dao.getOne(admins.getIdpessoa());
        } catch(RowNotFoundException e){
            FacesMessage f = new FacesMessage("Admin Inexistente");
            f.setSeverity(FacesMessage.SEVERITY_ERROR);
            
            FacesContext.getCurrentInstance().addMessage(null, f);
        }
    }
    
    public String salvar(){
        AdminDao dao = new AdminDao();
        dao.editar(admins);
        
        return "/admin/listar.xhtml";
    }
}
