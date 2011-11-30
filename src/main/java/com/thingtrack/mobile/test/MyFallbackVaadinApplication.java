package com.thingtrack.mobile.test;

import com.vaadin.Application;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Window;

public class MyFallbackVaadinApplication extends Application {

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
