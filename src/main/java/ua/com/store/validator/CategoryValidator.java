package ua.com.store.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ua.com.store.entity.Category;

@Component
public class CategoryValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(Category.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Category category = (Category) target;

        if (category.getCategoryOfProduct().isEmpty()){
            errors.rejectValue("categoryOfProduct","","empty field");
        }
    }
}
