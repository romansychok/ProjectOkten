package ua.com.store.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ua.com.store.entity.User;

@Component
public class UserValidator implements Validator {



   @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(User.class);
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;
        if (user.getUsername().isEmpty()){
            errors.rejectValue("username","","Field is empty");
        }
        else if (user.getPassword().isEmpty()){
            errors.rejectValue("password","","Password field is empty");
        }
        else if (!user.getPassword().equals(user.getRepeatPassword())){
            errors.rejectValue("repeatPassword","","Please enter password again!");
        }


    }
}
