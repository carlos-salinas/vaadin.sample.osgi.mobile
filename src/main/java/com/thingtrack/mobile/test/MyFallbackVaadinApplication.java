package com.thingtrack.mobile.test;

import org.springframework.beans.factory.annotation.Configurable;

import org.springframework.context.annotation.Scope;

import com.vaadin.Application;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Window;

@Configurable
@Scope("session")
public class MyFallbackVaadinApplication extends Application {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init() {
		
		Window mainWindow = new Window();
		setMainWindow(mainWindow);
		
		Button button = new Button("Click Me");
	        button.addListener(new Button.ClickListener() {
	            public void buttonClick(ClickEvent event) {
	                event.getButton().getWindow().addComponent(new Label("Thank you for clicking"));
	            }
	        });
	        
	    getMainWindow().addComponent(button);

	}

}
