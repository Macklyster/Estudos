package converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author alex
 */
@FacesConverter("telefoneConverter")
public class TelefoneConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        return value.replaceAll("[^\\d]", "");
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        String s = (String) value;
        String r = "(";
        
        r += s.substring(0, 2);
        r += ") ";
        r += s.substring(2, 6);
        r += "-";
        r += s.substring(6, 10);
        
        return r;
    }
    
}
