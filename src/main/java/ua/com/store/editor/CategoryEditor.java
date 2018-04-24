package ua.com.store.editor;

import ua.com.store.entity.Category;

import java.beans.PropertyEditorSupport;

public class CategoryEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {

        Category category = new Category();
        category.setId(Integer.parseInt(text));

        setValue(category);
    }
}
