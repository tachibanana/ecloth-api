package com.javar.dev.ecloth.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig{

	public JerseyConfig(){
		packages("com.javar.dev.ecloth");
	}

}
