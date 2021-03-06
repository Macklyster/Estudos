package listeners;


import java.util.Arrays;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class AutenticacaoListener implements PhaseListener {
    private final String[] URL_NAO_PROTEGIDA = new String[] {
            "/login.xhtml"
            };
    
    
    @Override
    public void afterPhase(PhaseEvent event) {
        FacesContext context = FacesContext.getCurrentInstance();
        String viewId = context.getViewRoot().getViewId();
        
        System.out.println(viewId);
        
        Boolean existe;
        existe = Arrays.asList(URL_NAO_PROTEGIDA).contains(viewId);
        
        if(!existe){
            Object usuario = context.getExternalContext().getSessionMap().get("usuario");
            
            if (usuario == null){
                NavigationHandler nav = context.getApplication().getNavigationHandler();
                
                nav.handleNavigation(context, null, "/login.xhtml");
            }
        }
    }

    @Override
    public void beforePhase(PhaseEvent event) {
        
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.RESTORE_VIEW;
    }
    
}
