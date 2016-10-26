package ManagedBean;

import Marca.Marca;
import Marca.Marcas;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.event.TransferEvent;
import org.primefaces.model.DualListModel;

@ManagedBean
public class DataPickListMb 
{
    
    DualListModel<Marca> itens = new DualListModel<Marca>(); 
    
    @PostConstruct
    public void init()
    {
        List<Marca> marcasNaoSelecionadas = new Marcas();
        itens.setSource(marcasNaoSelecionadas);
    }

    public DualListModel<Marca> getItens() 
    {
        return itens;
    }

    public void setItens(DualListModel<Marca> itens) {
        this.itens = itens;
    }
    
    public void itensTransfer(TransferEvent evento)
    {
        String msg;
        
        if(evento.isAdd())
        {
            msg = "Item adicionado";
        }else{
            msg = "Item removido";
        }
        
        for(Object id: evento.getItems())
        {
            String idString = (String) id;
            
            FacesMessage msg2 = new FacesMessage(msg, idString);
            FacesContext.getCurrentInstance().addMessage(null, msg2);
        }
    }
}
