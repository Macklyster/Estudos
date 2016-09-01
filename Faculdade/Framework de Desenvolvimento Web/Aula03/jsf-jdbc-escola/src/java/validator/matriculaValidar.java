package validator;

import br.com.chiquitto.aula.jdbcescola.vo.Aluno;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("matriculaValidar")
public class matriculaValidar implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
                
        int num = (int) value;
        
        if((num < 10000) || (num > 20000)){
            FacesMessage msg = new FacesMessage("Os valores válidos é entre 10000 e 20000");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            
            throw new ValidatorException(msg);
        }
    }
    
}
