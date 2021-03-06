package validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author alex
 */
@FacesValidator("emailValidator")
public class EmailValidar implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
       String s = (String) value;
       
       if(!s.contains("@")){
           FacesMessage msg = new FacesMessage("Email deve conter @");
           msg.setSeverity(FacesMessage.SEVERITY_ERROR);
           
           throw new ValidatorException(msg);
       }
    }
    
}
