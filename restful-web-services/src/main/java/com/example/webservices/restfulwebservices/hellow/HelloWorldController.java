package com.example.webservices.restfulwebservices.hellow;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webservices.restfulwebservices.hellowWorldd.HelloWorldBean;

//REST API4
@RestController
public class HelloWorldController {
	
	private MessageSource messageSource;
	
	public HelloWorldController(MessageSource messageSource) {
		this.messageSource = messageSource;				
	}
	
	@RequestMapping(path = "/world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	@RequestMapping(path = "/world-bean/pathVariable/{name}")
	public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name)); 
	}
	
	@GetMapping(path = "/hello-world-internationalized")
	public String helloWorldInternationalized() {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "Default Message", locale );
		
		//return "Hello World V2"; 
		
		//1:
		//2:
//		- Example: `en` - English (Good Morning)
//		- Example: `nl` - Dutch (Goedemorgen)
//		- Example: `fr` - French (Bonjour)
//		- Example: `de` - Deutsch (Guten Morgen)

	}
}
