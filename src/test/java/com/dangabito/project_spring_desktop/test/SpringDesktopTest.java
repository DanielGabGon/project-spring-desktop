package com.dangabito.project_spring_desktop.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dangabito.project_spring_desktop.dao.DisqueraDAO;

/**
 * Clase de Prueba Unitaria que permite realizar pruebas con el framework SPRING.
 */
class SpringDesktopTest {

	@Test
	void testContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    assertNotNull(context);
	    DisqueraDAO disqueraDAO=  (DisqueraDAO) context.getBean("disqueraDAO");
	    
	    assertNotNull(disqueraDAO);
	    
        DisqueraDAO disqueraDAONuevo=  (DisqueraDAO) context.getBean("disqueraDAO");
	    
	    assertNotNull(disqueraDAONuevo);
	    
	    System.out.println("Contexto cargado exitosamente.");
	    System.out.println(disqueraDAO);
	    System.out.println(disqueraDAONuevo);
	    //::::::::::::::::::::PROPERTIES::::::::::::::::::::::::
	    Properties properties= (Properties) context.getBean("properties");
	    System.out.println(properties.get("spring-username"));
	}

}
