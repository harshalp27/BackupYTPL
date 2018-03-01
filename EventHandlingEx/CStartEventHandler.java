package com.EventHandlingEx;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.w3c.dom.views.AbstractView;

public class CStartEventHandler implements ApplicationListener<ContextStartedEvent>{

	public void onApplicationEvent(ContextStartedEvent event){
		System.out.println("Context Started..!!!");
	}
	
}
