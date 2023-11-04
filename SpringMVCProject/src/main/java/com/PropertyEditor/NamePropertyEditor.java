package com.PropertyEditor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport
{
    //override setAsText method

    @Override
    public void setAsText(String name) throws IllegalArgumentException {
        // name-> user entered name
        String capsName=name.toUpperCase();
        setValue(capsName); //it will go to the dto
    }

    @Override
    public String getAsText() {
        //this will used to set default values
        return "Enter your name";
    }
}
