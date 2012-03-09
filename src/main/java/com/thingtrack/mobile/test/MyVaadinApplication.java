package com.thingtrack.mobile.test;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Scope;

import com.vaadin.addon.touchkit.ui.TouchKitApplication;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;

/**
 * The Application's "main" class
 */
@Configurable
@Scope("session")
@SuppressWarnings("serial")
public class MyVaadinApplication extends TouchKitApplication
{
    
    @Override
    public void onBrowserDetailsReady() {
        Button button = new Button("Click Me");
        button.addListener(new Button.ClickListener() {
            public void buttonClick(ClickEvent event) {
                event.getButton().getWindow().addComponent(new Label("Thank you for clicking"));
            }
        });
        getMainWindow().addComponent(button);
    }

    
}
