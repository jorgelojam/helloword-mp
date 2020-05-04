package org.jtux.demo.helloworld;

import javax.inject.Inject;

import org.eclipse.microprofile.config.inject.ConfigProperty;

public class HelloService {

	@Inject
	@ConfigProperty(name="hello")
	private String saludo;
	
    String createHelloMessage(String name) {
        return saludo + " " + name + "!";
    }

}
