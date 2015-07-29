package kz.kokmardan.validator;

import java.util.Enumeration;
import java.util.ResourceBundle;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("kz.kokmardan.validator.LoginValidator")
public class LoginValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        
        String newvalue = value.toString() ;
        ResourceBundle bundle = ResourceBundle.getBundle("kz.kokmardan.library.nls.messages",
            FacesContext.getCurrentInstance().getViewRoot().getLocale()) ; 
        
        if(newvalue.length() < 5){
            FacesMessage message = new FacesMessage(bundle.getString("login_length_error")) ;
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(message) ;
        }
        
        if(!Character.isLetter(newvalue.charAt(0))){
            FacesMessage message2 = new FacesMessage(bundle.getString("first_letter_error")) ;
            message2.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(message2) ;
        }
        
        
    
    }
    
}
