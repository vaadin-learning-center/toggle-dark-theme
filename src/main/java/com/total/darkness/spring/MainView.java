package com.total.darkness.spring;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.dom.ThemeList;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route
public class MainView extends VerticalLayout {

  public MainView() {
    H1 h1 = new H1("Hello darkness");
    FormComponent form = new FormComponent();

    Button toggleButton = new Button("Toggle dark theme", click -> {
      ThemeList themeList = UI.getCurrent().getElement().getThemeList();

      if (themeList.contains(Lumo.DARK)) {
        themeList.remove(Lumo.DARK);
      } else {
        themeList.add(Lumo.DARK);
      }
    });

    add(
        toggleButton,
        h1,
        form
    );
  }

}
