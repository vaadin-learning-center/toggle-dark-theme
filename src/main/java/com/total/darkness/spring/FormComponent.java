package com.total.darkness.spring;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;

public class FormComponent extends VerticalLayout {

  public FormComponent() {
    setSpacing(false);
    setWidth(null);
    add(
        new TextField("Name"),
        new EmailField("Email"),
        new DatePicker("DOB"),
        new Button("Sign up"){{addThemeVariants(ButtonVariant.LUMO_PRIMARY);}}
    );
  }
}
